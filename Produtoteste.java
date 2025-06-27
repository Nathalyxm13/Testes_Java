package src;

public class Produtoteste {
    public static void main(String[] args) {
        Produto p = new Produto ();
        p.setNomeDoProduto("Colar");
        p.setPrecoDoProduto(119.99);
        p.setDetalhesDoProduto("Prata leve com pingente do simbolo do infinito.");
        p.setMarcaDoProduto("Prata fina");


        System.out.println("Nome do Produto: " + p.getNomeDoProduto());
        System.out.println("Preço do Produto: R$ " + p.getPrecoDoProduto());
        System.out.println("Detalhe do Produto: " + p.getDetalheDoProduto());
        System.out.println("Marca do Produto: " + p.getMarcaDoProduto());
    }
}
