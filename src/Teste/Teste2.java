/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;
import BaseDeConhecimento.Consultar;
import java.util.List;
/**
 *
 * @author Baziota Beans
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        List<String>lista = Consultar.getTodasPalavras();
        
        for(int i=0; i < lista.size(); i++)
        {
            System.out.println("Palavras: "+lista.get(i));
        }
    }
    
}
