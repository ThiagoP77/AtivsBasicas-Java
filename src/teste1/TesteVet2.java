package teste1;

public class TesteVet2 {

    public static void main(String[] args) {
        String meses [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int c = 0; c <= (dias.length-1); c++){
            System.out.println(meses[c]+" tem "+dias[c]+" dias.");
        }
               
    }
    
}
