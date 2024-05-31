package proz.enzo.atividade;


import java.util.Scanner;

public class atividade_7 {
    public static void main(String[] args) {
        Scanner duro = new Scanner(System.in);
        System.out.println("digite o valor principal: ");
        float valor_principal = duro.nextFloat();
        System.out.println("digite a taxa em porcetagem?: ");
        float taxa = duro.nextFloat();
        System.out.println("digite quantos anos vai demorar para pagar: ");
        float anos = duro.nextFloat();
        float taxa_juros = taxa/100;
        float montate = valor_principal + (valor_principal*taxa_juros*anos/100);
        System.out.println("seu montante é: "+montate);
        duro.close();

        

    }
    
}
