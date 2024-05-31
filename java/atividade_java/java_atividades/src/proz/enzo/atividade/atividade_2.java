package proz.enzo.atividade;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("digite a primeira nota:");
        float num1 = numero.nextFloat();
        System.out.println("digite a segunda nota: ");
        float num2 = numero.nextFloat();
        System.out.println("digite a terceira nota: ");
        float num3 = numero.nextFloat();
        float soma = num1+num2+num3;
        float media = soma/3;
        System.out.println("a media das tres notas é: "+media);
        numero.close();
    }
    
}
