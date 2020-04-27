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
public class QueryGramatical 
{
    
    public static String consultar_arvore_sintatica(String str)
    {
        System.out.println(str);
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado com sucesso":"Não foi possivel conectar!"));
        String resultado;
        Query consulta = new Query("frase(R,["+str+"],[])");
        
        
        if(consulta.hasSolution()) return resultado = consulta.oneSolution().get("R").toString();
        else return "";
    } 
    //frase(sujeito(artigo(o), substantivo(gato)), predicado(verbo('caçou'), artigo(o), substantivo(rato)))
        
    public static String getSujeito(String str)
    {
        String consulta = str;
        System.out.println(consulta);
        if(consulta.contains("frase(sujeito("))
        {
            String strTemp[] = consulta.split("\\)\\), predicado\\("); 
            String sujeito;
            sujeito = strTemp[0];
            sujeito = sujeito.replace("frase(sujeito(", "");
            sujeito = sujeito.replace("artigo(", "");
            sujeito = sujeito.replace("), substantivo("," ");
            System.out.println("Sujeito: "+sujeito);
            return sujeito;
        }
        return null;
    }
    
    public static String getPredicado(String str)
    {
        String consulta = str;
        if(consulta.contains("predicado("))
        {
            String strTemp[] = consulta.split("\\, predicado\\(");
            String predicado = strTemp[1];
            predicado = predicado.replace("verbo(","");
            predicado = predicado.replace("), artigo(", " ");
            predicado = predicado.replace("), substantivo(", " ");
            predicado = predicado.replace(")))", "");
            System.out.println("Predicado: "+predicado);
            return predicado;
        }
        return null;
    }
    //frase(sujeito(artigo(o), substantivo(gato)), predicado(verbo('caçou'), artigo(o), substantivo(rato)))
    
    public  static List<String> getPalavrasKB(String strFrase)
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
    
    public static String getVerbo(String strFrase)
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        List<String>lista = getPalavrasKB(strFrase);
        String resultado = "";
        for(int i = 0; i < lista.size(); i++)
        {
            Query query = new Query("verbo(R,["+lista.get(i)+"],[]).");
            if(query.hasSolution())
            {
                resultado+=lista.get(i);
                resultado+=" ";
            }
        }
        return resultado;
    }
    
    public static String getClasseGramatical(String strFrase, String tipo_classe)
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        List<String>lista = getPalavrasKB(strFrase);
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
       
    public static void listarPalavras(List<String>lista)
    {
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println("Palavras"+i+1+": "+lista.get(i));
        }
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
        List<String> listaClasseGramatical = getAllGramaticalClass();
        
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
                if (query.isOpen()) resultadoTemp += palavras[count] + " ; "; 
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
    
    public static List<String> getAllGramaticalClass()
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
    
    
    public static void addNewRule(String newRule)
    {
        Query conexao = new Query("consult('nova_regra.pl').");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        String rule = "novo_facto('"+newRule+"').";
        Query query = new Query(rule);
        query.hasMoreSolutions();
    }
    
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
    
    public static List<String>palavrasNovas(String[] palavras)
    {
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possivel concectar!"));
        
        List<String> listaTermosDesconhecidos = new ArrayList<>();
        for(String termo : palavras)
        {
            List<String> listaClassesGramaticais = getAllGramaticalClass();
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
    
    /*public static String respostaComClassesGramaticiaisAnaliseMorfologica(String strfrase)
    {
        String resposta = new String();
        String[] palavras = strfrase.split(",");
        
        List<String> strClassesGramaticais = getAllGramaticalClass();
        
        
    }*/
    
    
}
