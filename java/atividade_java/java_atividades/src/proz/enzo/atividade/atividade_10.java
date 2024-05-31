package proz.enzo.atividade;

import java.util.Scanner;

public class atividade_10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual nota é a nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Quantos alunos tiraram essa nota: ");
        int aluno1 = scanner.nextInt();
        System.out.println("Qual nota é a nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Quantos alunos tiraram essa nota: ");
        int aluno2 = scanner.nextInt();
        System.out.println("Qual nota é a nota: ");
        float nota3 = scanner.nextFloat();
        System.out.println("Quantos alunos tiraram essa nota: ");
        int aluno3 = scanner.nextInt();
        float media = (nota1*aluno1)+(nota2*aluno2)+(nota3*aluno3)/(aluno1+aluno2+aluno3);
        System.out.println("A media ponderada das notas com o peso alunos é: "+media);
        
        scanner.close();
    }
}