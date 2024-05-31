import java.util.Scanner;

public class contabancaria {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //digitar qual é o nome
     System.out.println("Qual é seu nome? ");
     String nome = scan.nextLine();
    //digitar o numero do banco
     System.out.println("Qual é o numero do seu banco? ");
     int num = scan.nextInt();

     // consumir a linha
     scan.nextLine();
    
    //digitar a agência
     System.out.println("Qual é a agência? ");
     String agencia = scan.nextLine();

    //saldo do usuario
     double saldo = 2345.87;

     //print da frase 
     System.out.println("Olá, Sr(a) "+ nome+",obrigado por criar uma conta em nosso banco! sua Agência é "+agencia +", conta "+num + " e seu saldo é: " + saldo + " já esta disponivel para saque.");

    scan.close();
    }
}
