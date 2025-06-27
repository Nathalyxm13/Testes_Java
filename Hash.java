package src.equalsHash;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet <Usuario> usuarios = new HashSet<>();
        
        usuarios.add(new Usuario("Estevão"));
        usuarios.add(new Usuario("Nathalia"));
        usuarios.add(new Usuario("Rafael"));

        boolean resultado = usuarios.contains(new Usuario("Estevão"));
        System.out.println(resultado); //verificação da existencia contains//
    }
}
