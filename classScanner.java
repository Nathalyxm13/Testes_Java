package src;
import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
    Scanner texto = new Scanner (System.in);
    String str;

    System.out.println("Infome o nome:");
    str = texto.nextLine();
    System.out.println("Bem vindo" + str);

    System.out.println("Informe a matricula:");
    int num = texto.nextInt();
    System.out.println("A matricula informada:" + num);

    texto.close();
    }
}
