package proz.enzo.atividade;


import java.util.Scanner;

public class atividade_5 {
    public static void main(String[] args) {
        Scanner gordo = new Scanner(System.in);
        System.out.println("digite o seu peso: ");
        float peso = gordo.nextFloat();
        System.out.println("digite o sua altura: ");
        float altura = gordo.nextFloat();
        float imc = peso/(altura*altura);
        System.out.println("O seu IMC é: "+imc);
        gordo.close();

    }
    
}
