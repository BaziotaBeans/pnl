/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;
import java.util.ArrayList;
import java.util.List;
import org.jpl7.Query;
/**
 *
 * @author Baziota Beans
 */
public class Teste {

    /**
     * @param args the command line arguments                                   
     */                                                                         
    public static void main(String[] args)                                      
    {                                                                           
        // TODO code application logic here                                     
        String nome = "o gato caçou o rato";                                    
        
        String[] vector = nome.split(" ");
        List<String> lista = new ArrayList<String>();
        List<String> listaArtigo =  new ArrayList<String>(),listaVerbo = new ArrayList<String>(),listaSubstantivo  = new ArrayList<String>();
        String colecao;
        colecao = nome.replaceAll(" ", ",");
        System.out.println(colecao);
        for(int i = 0; i < vector.length; i++)
        {
            lista.add(vector[i]);
            
        }
        
        Query conexao = new Query("consult('Base de Conhecimento.pl')");
        System.out.println((conexao.hasSolution()?"Conectado":"Não foi possível conectar"));
        
        Query q1 = new Query("frase(R, ["+colecao+"], [])");
        if(q1.hasSolution())
        {
            System.out.println("Frase: "+q1.oneSolution().get("R").toString());
        }
        String sujeito = "", predicado = "", verbo = "", substantivo = "", artigo = ""; 
        //Para verbos, artigos, substantivo
        int contador_verbo = 0, contador_artigo = 0, contador_substantivo = 0;
        for(int i = 0; i < lista.size(); i++)
        {
            Query q2 = new Query("verbo(R,["+lista.get(i)+"],[])");
            if(q2.hasSolution())
            {
                verbo += " " + lista.get(i);
                listaVerbo.add(lista.get(i));
                contador_verbo++;
            }
                
            Query q3 = new Query("artigo(R,["+lista.get(i)+"],[])");
            if(q3.hasSolution()) 
            {
                artigo += " " + lista.get(i);
                listaArtigo.add(lista.get(i));
                contador_artigo++;
            }
            Query q4 = new Query("substantivo(R,["+lista.get(i)+"],[])");
            if(q4.hasSolution()){
                substantivo += " " + lista.get(i);
                listaSubstantivo.add(lista.get(i));
                contador_substantivo++;
            } 
        } 
        System.out.println("Verbo: "+verbo);
        System.out.println("Artigo: "+artigo);
        System.out.println("Substantivo: "+substantivo);
        
        //o gato cacou o rato
        //Sujeito
        boolean state = false, estado = false;
        int count = 0;
        while(!state)
        {
            Query q5 = new Query("sujeito(R,["+listaArtigo.get(count)+","+listaSubstantivo.get(count)+"], [])");
            if(q5.hasSolution()) 
            {
                state = true;
                sujeito = listaArtigo.get(count) + " " + listaSubstantivo.get(count);
            }
            count++;
        }
        System.out.println("Sujeito => "+sujeito);
        
        //Predicado
        // A Joana não gosta de tomar banho mas o pedro gosta de tomar banho.
        while(estado)
        {
            for(int i = 0; i < listaVerbo.size(); i++)
            {
                Query q6 = new Query("predicado(R, ["+listaVerbo.get(i)+","+listaArtigo.get(0)+","+listaSubstantivo.get(0)+"],[])");
                if(q6.hasSolution())
                {
                    estado = true;
                    predicado = listaVerbo.get(i) + " " + listaArtigo.get(0) + " " + listaSubstantivo.get(0);
                }
            }
        }
    }
    
}
