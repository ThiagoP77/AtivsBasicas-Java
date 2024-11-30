/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;
import java.util.Scanner;

public class TesteNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner analise = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = analise.nextLine();
        System.out.print("Insira sua nota: ");
        float nota = analise.nextFloat();
        System.out.format("\nOlá %s, sua nota foi %.2f.\n",nome,nota);
        
    }
    
}
