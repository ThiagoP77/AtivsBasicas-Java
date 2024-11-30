package teste1;

import java.util.Scanner;

public class TesteER3 {


    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner analise = new Scanner (System.in);
        do {
            System.out.print("Digite um número: ");
            n = analise.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = analise.next();
        }while (resp.equals("S"));
        System.out.format("A soma de todos os números é %d.\n", s);
    }
    
}
