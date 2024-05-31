package proz.enzo.condicao;
import java.util.Scanner;

public class atividade_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float num = scan.nextFloat();
        if (num > 0){
            System.out.println("esse numero é positivo!");
        } else if (num < 0){
            System.out.println("esse numero é negativo!");
        } else{
            System.out.println("esse numero é zero!");
        }
        scan.close();
    }
    
}
