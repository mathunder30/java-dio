package proz.enzo.atividade;


import java.util.Scanner;
public class file {
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        System.out.println("digite o um numero: ");
        float n1 = numero.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float n2 = numero.nextFloat();
        float soma = n1 + n2;
        System.out.println("a soma dos numeros é: "+soma);
        float sub = n1-n2;
        float multi = n1*n2;
        float div = n1/n2;
        System.out.println("a subtração dos numeros: "+sub);
        System.out.println("a multiplicação dos numeros: "+multi);
        System.out.println("a divisão dos numeros é: "+div);

        numero.close();
        


    }

    
}