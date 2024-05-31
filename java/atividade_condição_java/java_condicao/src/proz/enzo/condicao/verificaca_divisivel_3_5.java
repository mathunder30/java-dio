package proz.enzo.condicao;
import java.util.Scanner;

public class verificaca_divisivel_3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = scan.nextInt();
        if (num % 3 == 0 ){
            System.out.println("esse numero é divido por tres");
        } else if (num % 5 == 0){
            System.out.println("Esse numero é divisivel por 5");

        } else{
            System.out.println("Esse numero não é divisivel por 5 e 3");
        }
        scan.close();
    }
    
}
