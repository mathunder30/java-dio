package proz.enzo.atividade;


import java.util.Scanner;

public class atividade_6 {
    public static void main(String[] args) {
        Scanner pobre = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        float valor = pobre.nextFloat();
        System.out.println("Digite o valor do desconto que você vai querer: ");
        float desconto = pobre.nextFloat();
        float desconto_aplicado = desconto/100;
        float valor_porcentagem = valor*desconto_aplicado;
        float valor_descontado = valor-valor_porcentagem;
        System.out.println("O valor com o desconto é: "+ valor_descontado);
        pobre.close();

        
    }
    
}
