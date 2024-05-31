package proz.enzo.condicao;
import java.util.Scanner;

public class classificação_idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt(); // digitar a idade
        // condição para ver se é uma criança, adolescente, adulto, senhor de idade
        // condição criança
        if (idade <= 12 && idade == 0){
            System.out.println("Você é criança!");
        } // condição adolescente
         else if (idade >= 12 && idade <= 17){
            System.out.println("Você é Adolescente");
        } // condição adulto
         else if (idade >= 18 && idade <= 60) {
            System.out.println("Você é um adulto!");
        } // condição velho
         else if (idade > 60){
            System.out.println("você é velho!");
        } // condição não definida
         else{
            System.out.println("idade não definida!");
        }
        scan.close();
    }
    
}
