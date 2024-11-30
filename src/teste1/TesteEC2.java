package teste1;

import java.util.Scanner;

public class TesteEC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner analise = new Scanner(System.in);
        System.out.print("Insira seu ano de nascimento: ");
        int nasc = analise.nextInt();
        int i = 2022-nasc;
        System.out.format("Sua idade é de %d anos.\n", i);
        if (i>=18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
    
}
