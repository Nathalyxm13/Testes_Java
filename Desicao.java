package src;

import java.util.Scanner;

public class Desicao {
    
    public static void main(String[] args) {
        verIdade();
    }

        public static void verIdade (){
            Scanner texto = new Scanner(System.in);

            System.out.print("Informe sua idade: ");
        int idade = texto.nextInt();

        //String retorno getIdade(idade);
        //System.out.println("Resultado: " + retorno);

        System.out.println("Resultado: " + getIdade (idade));

        texto.close();
        }

        

    public static String getIdade(int idade){
        String texto = null;
        if (idade >= 0 && idade < 3) {
            texto =("Você é um bebê");

        } else if (idade >= 3 && idade < 7) {
            texto = "Você é uma criança";
        } else if (idade >= 7 && idade < 12) {
            texto = "Você ainda é uma criança";
        } else if (idade >= 12 && idade < 18) {
            texto = "Você é um adolecente";
        } else if (idade >= 18 && idade < 65) {
            texto ="Você é um adulto";
        } else{
            texto = "Você é um idoso";
        }
        return texto;
    }

}
