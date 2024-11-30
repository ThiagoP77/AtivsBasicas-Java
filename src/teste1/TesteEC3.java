package teste1;
import java.util.Scanner;

public class TesteEC3 {

    public static void main(String[] args) {
        Scanner analise = new Scanner(System.in);
        System.out.print("Informe a quantidade de pernas: ");
        int pernas = analise.nextInt();
        String tipo;
        switch (pernas){
            case 1: 
                tipo = "Saci"; 
                break;
            case 2: 
                tipo = "Bípede"; 
                break;
            case 4: 
                tipo = "Quadrúpede"; 
                break;
            case 6: 
                tipo = "Aranha"; 
                break;
            case 8: 
                tipo = "Aranha"; 
                break;
            default: 
                tipo = "ET";
        }
        System.out.format("Tipo: %s.\n", tipo);
    }
    
}
