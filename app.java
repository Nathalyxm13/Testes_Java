package src;

public class app {

    public static void main(String[] args) throws Exception {

        Produto p = new Visibilidade ();
        p.nomeDoProduto = "";
        p.precoDoproduto = 0.0;
        p.detalhesDoProduto = "";

        p.mostarDados();
        p.limparNome ();
        p.preencherDadosDoProduto();
    
    }
}

