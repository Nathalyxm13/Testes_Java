package src.produto.arrays;

public class ArrayNotas {

    public static void main(String[] args) {
        double [] notasAlunoA = new double[3];

        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 6.2;
        notasAlunoA [2] = 8.9;

        double [] notasAlunoB = {7.1,6.3,9.4,7.9,4.2};

        /*for (int i = 0; i < notasAlunoA.length; i++){
            System.out.println("Nota" + (i+1)+": Aluno A" + notasAlunoA[i]);
        } */
        
        for (double i : notasAlunoB) {
            System.out.println("Nota" + (i+1)+": Aluno A" + notasAlunoA[i]);
    
        }
        
        for (int i = 0; i < notasAlunoB.length; i++){
            System.out.println("Nota" + (i+1)+": Aluno B" + notasAlunoB[i]);
        }
    }

}
