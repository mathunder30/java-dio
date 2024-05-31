package proz.enzo.condicao;

import java.util.Scanner;

public class aprovacao_disciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a sua nota de portugues");
        float nota = scan.nextInt();
        if (nota >= 7){
            System.out.println("Voce esta aprovado");
        } else{
            System.out.println("Voce está reprovado!");
        }
        scan.close();
    }
    
}
