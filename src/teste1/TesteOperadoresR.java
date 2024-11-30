/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;

/**
 *
 * @author Thiag
 */
public class TesteOperadoresR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        String res2;
        res = (nome1==nome3)?"igual":"diferente";
        res2 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        System.out.println(res2);
        
    }
    
}
