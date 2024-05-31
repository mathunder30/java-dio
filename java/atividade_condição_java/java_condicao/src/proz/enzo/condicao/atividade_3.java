package proz.enzo.condicao;
import java.util.Scanner;

public class atividade_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a sua idade");
        int anos = scan.nextInt();
        if (anos >= 18){
            System.out.println("Você é maior de idade, vc pode dirigir!!");

        } else{
            System.out.println("você é de menor!!");
        }
        scan.close();
    }
    
}
