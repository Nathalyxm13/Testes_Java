package src;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu sexo f ou m: ");
        char letra = sc.next().charAt(0);
        System.out.print("Digite f ou m: ");

        if (letra  == 'f') {
            System.out.println("Feminino");
        } else if (letra == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Letra inválida");
        }

        sc.close();
    }
}