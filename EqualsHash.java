package src.equalsHash;

public class EqualsHash {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setNome("Nathaly Xavier");
        u1.setEmail("nathalyxm13@gmail.com");

        u2.setNome("Theo Almeida");
        u2.setEmail("theoam32@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        u1.con
    }
    
}
