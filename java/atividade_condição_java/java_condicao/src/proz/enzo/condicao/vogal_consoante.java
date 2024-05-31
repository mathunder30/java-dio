package proz.enzo.condicao;
import java.util.Scanner;

public class vogal_consoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma letra: ");
        char letra = scan.next().charAt(0);
        if (letra == 'a'){
            System.out.println("é uma vogal");
        } else if (letra == 'e'){
            System.out.println("é uma vogal");
        } else if (letra == 'i'){
            System.out.println("é uma vogal");
        } else if (letra == 'o'){
            System.out.println("é uma vogal");
        }else if (letra == 'u'){
            System.out.println("é uma vogal");
        } else {
            System.out.println("é uma consoante");
        }

        scan.close();
    }
    
}
