/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeConhecimento;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;
/**
 *
 * @author Baziota Beans
 */
public class Consultar 
{
    
    //    faz a consulta geral e retorna quem é 
    //    o sujeito  e o predicado caso existir e faz a analise sintatica e morfologica
    public static String consultaGeral(String str1)
    {
        String str2 = "consult('Base de Conhecimento.pl')", resultado, str3 = "frase(R,["+str1+"],[]).";
        Query conexao = new Query(str2);
        System.out.println((conexao.hasSolution()?"Conectado":"Nao foi possivel conectar"));
        Query query = new Query(str3);
        query.hasMoreSolutions();
        
        /*if(query.isOpen()) return resultado = query.oneSolution().get("R").toString();
        else if(!query.isOpen()) return 
            return "";*/
        if (query.isOpen())
        {
            Map<String, Term> solution = query.nextSolution();
            if(solution != null)
            {
                return getSujeitoPredicado(solution.get("R").toString()) + getClasseGramatical(solution.get("R").toString());
            }
        }
        else return getAnaliseMorfologica(str1);
        return "";
             
    }
    /*
    public static String adicionarNomesKB()
    {
        String []nomes = {"Fábio","João","Miguel","Pina","Leo","Francisco","Gilberto","Eduardo","Fernando","Carlos","Analtina","Lise",
        "Nathan","Lucas","Mira","David","Alice","Anael"};
        List<String> listaNomes = new ArrayList<>();
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        for(int i=0; i<nomes.length;i++)
        {
            
        }
        
    }*/
    
    
    //    pega o sujeito e o predicado do resultado da consulta do prolog

    public static String getSujeitoPredicado(String str)
    {
        String consulta = str;
        System.out.println(consulta);
        if(consulta.contains("frase(sujeito(") && consulta.contains("predicado("))
        {
            String strTemp[] = consulta.split("\\)\\), predicado\\(");
            String sujeito = strTemp[0], predicado = strTemp[1];
            
            //frase(sujeito(artigo(o), substantivo(gato)), predicado(verbo(cacou), artigo(o), substantivo(rato)))
            sujeito = sujeito.replace("frase(sujeito(", "");
            sujeito = sujeito.replace("artigo(", "");
            sujeito = sujeito.replace("), substantivo(", " ");
            sujeito = sujeito.replace(")", "");
            predicado = predicado.replace("verbo(","");
            predicado = predicado.replace("), artigo(", " ");
            predicado = predicado.replace("), substantivo(", " ");
            predicado = predicado.replace(")))", "");
            System.out.println(sujeito);
            String resultado ="";
            return (resultado += "Sujeito : "+ sujeito +"\n" + "Predicado: "+predicado+"\n");
        }
        return "";
    }
    
    public  static List<String> getPalavras(String strFrase)
    {
        List<String>listaPalavra = new ArrayList<>();
        strFrase = strFrase.replace("frase(sujeito(", "");
        strFrase = strFrase.replace(" predicado(", "");
        String[] palavras = strFrase.split(",");
        for(int index = 0; index < palavras.length; index++)
        {
            palavras[index] = palavras[index].substring(palavras[index].indexOf("(")+1,palavras[index].indexOf(")"));
            listaPalavra.add(palavras[index]);
            
        }
        return listaPalavra;
    }
    
    public static List<String>getTodasPalavrasKB(String classeGramatical)
    {
        List<String>listaArtigo = new ArrayList<>();
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        Query query = new Query(classeGramatical+"(X,R,[]).");
        while(query.hasMoreSolutions())
        {
            Map<String,Term>solucao = query.nextSolution();
            if(solucao != null)
            {
                String strTemp = solucao.get("R").toString();
                strTemp = strTemp.replace("'[|]'(", "");
                strTemp = strTemp.replace(", '[]')", "");
                listaArtigo.add(strTemp);
            }
        }
        return listaArtigo;
    }
    
     public static List<String>getTodasPalavras()
     {
         List<String>lista = new ArrayList<>(), listaArtigo = getTodasPalavrasKB("artigo"),listaVerbo = getTodasPalavrasKB("verbo"),
         listaSubstantivo = getTodasPalavrasKB("substantivo");
         for(int i = 0; i < listaArtigo.size(); i++) lista.add(listaArtigo.get(i));
         for(int i = 0; i < listaSubstantivo.size(); i++) lista.add(listaSubstantivo.get(i));
         for(int i = 0; i < listaVerbo.size(); i++) lista.add(listaVerbo.get(i));
         return lista;
     }
    
    /*
        Map<String, Term> solucao = consulta.nextSolution();     
        String strTemp = solucao.get("R").toString();
        System.out.println("Text1: "+strTemp);
        strTemp = strTemp.replace("'[|]'(", "");
        System.out.println("Text2: "+strTemp);
        strTemp = strTemp.replace(", '[]')", "");
        System.out.println("Text3: "+strTemp);
        listaClasseGramatical.add(strTemp);
    */
     
     
    // metodo que faz a analise sintatica , e recebe
    //o resultado da consulta em prolog e exibe a sua classe 
    //gramatical
    public static String getClasseGramatical(String strFrase, String tipo_classe)
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        List<String>lista = getPalavras(strFrase);
        String resultado = "";
        boolean flag = false;
        for(int i = 0; i < lista.size(); i++)
        {
            Query query = new Query(tipo_classe+"(R,["+lista.get(i)+"],[]).");
            if(query.hasSolution())
            {   
                if(flag)
                {
                    resultado+=", ";
                    resultado+=lista.get(i);   
                }
                else
                {
                    resultado+=lista.get(i);
                }
                flag = true;
            }
        }
        return resultado;
    }
    
    public static String getClasseGramatical(String strFrase)
    {
        strFrase = strFrase.replace("frase(sujeito(", "");
        strFrase = strFrase.replace(" predicado(", "");
        String[] palavras = strFrase.split(",");
        System.out.println("-->"+palavras[0]);
        System.out.println("-->"+palavras[1]);
        System.out.println("Tamanho: "+palavras.length);
        /*Para formatar as palavras*/
        for(int i=0; i < palavras.length; i++)
        {
            System.out.println("Original: "+palavras[i]);
        }
        for(int index = 0; index < palavras.length; index++)
        {
            palavras[index] = palavras[index].substring(palavras[index].indexOf("(")+1,palavras[index].indexOf(")"));
            System.out.println("-->"+palavras[index]);
        }
        //Obtem todas as classes gramaticais da nossa KB
        List<String> listaClasseGramatical = getTodasClassesGramatical();
        
        String resultado = new String();
        
        /*  Uma vez a classe gramatical retornada em forma de lista
            Percorremos todas as classes gramaticais na lista
            Saber se as palavras fazem parte da classe gramatical
        */
        for(int i = 0; i < listaClasseGramatical.size(); i++)
        {
            String resultadoTemp = new String();
            
            //Percorre cada palavra e verifica se pertence a classe gramatical
            for(int count = 0; count < palavras.length; count++)
            {
                //artigo(A, [o], []) e a saida sera : A = artigo(o).
                Query query = new Query(listaClasseGramatical.get(i)+"(A, ["+palavras[count]+"], []).");
                query.hasMoreSolutions();
                //Verifica se a palavra existe na KB.
                if (query.isOpen()) resultadoTemp += palavras[count] + " , ";
                //if(count == palavras.length - 1) resultadoTemp += palavras[count] + "";
            }
            if(!resultadoTemp.isEmpty())
            {
                resultadoTemp = listaClasseGramatical.get(i) +" : "+ resultadoTemp;
                resultado += resultadoTemp;
                if((i + 1) != listaClasseGramatical.size()) resultado += "\n";   
            }
        }
        
        return resultado;
    }
    
    //Esse metodo retorna numa lista todas as classes gramaticais (artigo, substantivo e verbo)
    /**/
    public static List<String> getTodasClassesGramatical()
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        Query consulta = new Query("classe(R, [])");
        consulta.hasMoreSolutions();
        List<String> listaClasseGramatical = new ArrayList<>();
        
        if(consulta.isOpen())
        {
            do
            {
                Map<String, Term> solucao = consulta.nextSolution();
                
                String strTemp = solucao.get("R").toString();
                System.out.println("Text1: "+strTemp);
                strTemp = strTemp.replace("'[|]'(", "");
                System.out.println("Text2: "+strTemp);
                strTemp = strTemp.replace(", '[]')", "");
                System.out.println("Text3: "+strTemp);
                listaClasseGramatical.add(strTemp);
                
            }while(consulta.hasMoreSolutions());
        }
        return listaClasseGramatical;
    }
    
    /*
        Adicionar um novo facto na base de conhecimento
    */
    public static void adicionarNovaRegra(String newRule)
    {
        Query conexao = new Query("consult('nova_regra.pl').");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        String rule = "novo_facto('"+newRule+"').";
        Query query = new Query(rule);
        query.hasMoreSolutions();
    }
    
    /*
        recebe a pergunta e retorna a resposta caso exista, se não existir pede para cadastrar
    */
    public static String consultarPergunta(String pergunta)
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        Query query = new Query("pergunta(R, ['"+pergunta+"'], []).");
        query.hasMoreSolutions();
        
        if(query.isOpen())
        {
            Map<String, Term> solucao = query.nextSolution();
            if(solucao != null)
            {
                String resultado = solucao.get("R").toString();
                System.out.println("Resultado ="+resultado);
                return resultado;
            }
        }
        return "";
    }
    /*
        retorna a lista de palavras novas, as que não existem na base de conhecimento
    */
    public static List<String>palavrasNovas(String[] palavras)
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        List<String> listaTermosDesconhecidos = new ArrayList<>();
        for(String termo : palavras)
        {
            List<String> listaClassesGramaticais = getTodasClassesGramatical();
            boolean flag = false;
            for(String classeGramatical : listaClassesGramaticais)
            {
                Query consulta = new Query(classeGramatical+"(R, ["+termo+"], []).");
                if(consulta.hasSolution())
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                listaTermosDesconhecidos.add(termo);
            }
        }
        return listaTermosDesconhecidos;
    }
    
    public static void guardarPalavra(String classeGramatical, String palavra)
    {
        Query conexao = new Query("consult('nova_regra.pl').");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        String str = classeGramatical+"("+classeGramatical+"("+palavra+")) --> ["+palavra+"].";         
        Query consulta = new Query("novo_facto('"+str+"').");
        consulta.hasSolution();
    }
    
    private static String getAnaliseMorfologica(String strfrase)
    {   
        String resposta = new String();
        String[] palavras = strfrase.split(",");
        
        List<String> strClassesGramaticais = getTodasClassesGramatical();        

        for(int i = 0; i < strClassesGramaticais.size(); i++)
        {
            String respTemp = new String();
            
            
            for(int x = 0; x < palavras.length; x++)
            {
               
                Query classeGramatical = new Query(strClassesGramaticais.get(i)+"(A, ["+palavras[x]+"], []).");
                classeGramatical.hasMoreSolutions();    
                
                if(classeGramatical.isOpen())   
                    respTemp +=  palavras[x] + " ; ";
            }
            
            if(!respTemp.isEmpty())
            {
                respTemp = strClassesGramaticais.get(i) +" : "+ respTemp;
                resposta += respTemp;
                if((i + 1) != strClassesGramaticais.size())
                   resposta += "\n";
            }
        }
       return resposta;
    }
}
