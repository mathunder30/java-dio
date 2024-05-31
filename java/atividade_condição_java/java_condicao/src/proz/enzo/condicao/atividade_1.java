package proz.enzo.condicao;
import java.util.Scanner;

public class atividade_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        if (num % 2 == 0){
            System.out.println("esse numero é par!!");

        } else {
            System.out.println("Esse numero é impar!!");
        }
        
        scan.close();
    }
}