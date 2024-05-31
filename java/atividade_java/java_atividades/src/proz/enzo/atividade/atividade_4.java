package proz.enzo.atividade;


import java.util.Scanner;

public class atividade_4 {
    public static void main(String[] args) {
        Scanner retan = new Scanner(System.in);
        System.out.println("quantos metros tem a base: ");
        float base = retan.nextFloat();
        System.out.println("quantos metros tem a altura: ");
        float altura = retan.nextFloat();
        float retangulo = altura * base;
        System.out.println("A area do retangulo é: " +retangulo);
        retan.close();
    }
    
}
