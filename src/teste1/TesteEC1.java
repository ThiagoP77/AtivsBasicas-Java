package teste1;
import java.util.Scanner;

public class TesteEC1 {

    public static void main(String[] args) {
    Scanner analise = new Scanner (System.in);
    System.out.print("Insira sua primeira nota: ");
    float n1 = analise.nextFloat();
    System.out.print("Insira sua segunda nota: ");
    float n2 = analise.nextFloat();
    float me = ((n1+n2)/2);
    System.out.format("Sua média: %.2f.\n", me);
    if (me>9){
        System.out.println("Parabéns!");
    } else {
    }
    }
    
}
