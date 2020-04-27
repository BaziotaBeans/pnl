/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
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
        String nome = "eu sou angolano";
        
        String[] nomes = nome.split(" ");
        
        for(int i = 0; i < nomes.length; i++) System.out.println(nomes[i]);
    }
    
}
