package proz.enzo.atividade;


import java.util.Scanner;

public class atividade_8 {
    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);
        System.out.println("Qual é sua idade? ");
        int anos = conversao.nextInt();
        int anos_meses = anos*12;
        int anos_dias = anos*365;
        System.out.println("Sua idade em anos passando para meses é: "+ anos_meses);
        System.out.println("Sua idade em anos passando para dias é: "+ anos_dias);
        conversao.close();
    }
    
}
