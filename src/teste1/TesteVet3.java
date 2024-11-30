package teste1;
import java.util.Arrays;
        
public class TesteVet3 {

    public static void main(String[] args) {
        int num[] = {2, 5, 1, 4, 7, 0};
        for (int c=0; c<=(num.length-1); c++){
            System.out.print(num[c]);
    }
        int pos = Arrays.binarySearch(num, 1);
        Arrays.sort(num);
        System.out.println(" ");
        for (int cc=0; cc<=(num.length-1); cc++){
            System.out.print(num[cc]);
    }
        System.out.println("\n"+ pos);
    }
    
}
