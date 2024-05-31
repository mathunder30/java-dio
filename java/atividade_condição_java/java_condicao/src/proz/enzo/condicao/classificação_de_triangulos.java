package proz.enzo.condicao;
import java.util.Scanner;

public class classificação_de_triangulos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado do triangulo: ");
        int lado1 = scan.nextInt();
        System.out.println("Digite o lado do triangulo: ");
        int lado2 = scan.nextInt();
        System.out.println("Digite o lado do triangulo: ");
        int lado3 = scan.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 +lado2 > lado1){
            if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ){
                System.out.println("Esse Triangulo é Isoceles");

            } else if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Esse Triangulo é equilátero");

            } else if (lado1 != lado2 || lado2 != lado3 || lado3 != lado1) {
                System.out.println("é um triangulo escaleno");

            }
        } else{
            System.out.println("não é um triangulo");
        }
        scan.close();
    }
}
