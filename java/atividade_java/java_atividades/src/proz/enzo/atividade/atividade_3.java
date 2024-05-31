package proz.enzo.atividade;


import java.util.Scanner;

public class atividade_3 {
    public static void main(String[] args) {
       Scanner temp = new Scanner(System.in);
       System.out.println("Digite a temperatura: ");
       float celcius = temp.nextFloat();
       float fah = (celcius * 9/5) + 32;
       System.out.println("a temperatura fahrenheit: "+fah);
       temp.close();

    }
    
}
