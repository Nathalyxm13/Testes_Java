package src;

public class Desicao_2 {
    
    public static void main(String[] args) {
        int idade = 20;

        if (idade >=18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
        //Operador Ternário

        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        // true and false
        System.out.println(resultado);
    }
}
