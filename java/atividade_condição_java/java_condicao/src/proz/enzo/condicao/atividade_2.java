package proz.enzo.condicao;
import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        float num1 = scan.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float num2 = scan.nextFloat();
        if (num1 > num2){
            System.out.println(num1+" é maior que "+num2);
        } else{
            System.out.println(num2+" é maior "+num1);
        }
        scan.close();
    }
    
}
