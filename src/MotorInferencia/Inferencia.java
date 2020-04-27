/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorInferencia;
import org.jpl7.Query;
/**
 *
 * @author Baziota Beans
 */
public class Inferencia 
{
    public static void inserirNovaregra(String pergunta, String resposta)
    { 
        Query conexao = new Query("consult('nova_regra.pl')");
        System.out.println((conexao.hasSolution()?"Conectado com sucesso":"Erro na conexão"));
        String rule = new String();
        rule += "pergunta(\\'"+resposta+"\\') --> [\\'"+pergunta+"\\'].";
        System.out.println("--------------------------------");   
        System.out.println("Pergunta = "+pergunta);
        System.out.println("Resposta = "+resposta);  
        System.out.println("Regra 0 "+rule);           
        System.out.println("--------------------------------");
        Query query = new Query("novo_facto('"+rule+"').");
        query.hasSolution();       
    }
}
