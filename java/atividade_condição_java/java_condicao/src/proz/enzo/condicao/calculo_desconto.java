package proz.enzo.condicao;
import java.util.Scanner;

public class calculo_desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor da compra: ");
        float valor = scan.nextInt(); //valor inicial

        if (valor >= 100 && valor <= 150){
            float desconto = valor * 0.3f; //30% de desconto
            float valordescontado = (valor - desconto); //valor final
            System.out.println(desconto);
            System.out.println("esse é o que você vai pagar "+valordescontado); 
        } else if (valor > 150){
            float desconto = valor * 0.5f; //50% de desconto
            System.out.println(desconto);
            float valordescontado = (valor - desconto);//valor final
            System.out.println("esse é o que você vai pagar "+valordescontado); 
        } else{
            System.out.println("valor não descontado");
        }
        scan.close();
    }
}
