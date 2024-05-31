package proz.enzo.atividade;

import java.util.Scanner;

public class atividade_9 {
    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = conversao.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = conversao.nextInt();
        int num3 = num1;
         num1 = num2;
         num2 = num3;

        System.out.println("o valor do primeiro numero: "+num1);
        System.out.println("O valor do segundo numero: "+num2);


        

        conversao.close();
        
    }
    
}
