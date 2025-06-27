package src;

public class ClassScannerII {
    
    //+ soma
    //- sub
    //* multiplicação
    // / divisão
    // ++ Auto incremento
    //-- Auto incremento
    
    public static void main(String[] args) {
        int a = 10;
    int b = 2;
    int c = 65;

    int resultado = a + b * c /2 + a++ - 3 - --b ;

    System.out.println("Resultado 1:");

    resultado = (a + b) * c /2 + (a++ - 3) - --b;

    System.out.println("Resultado 2:" + resultado);
    }
    
}
