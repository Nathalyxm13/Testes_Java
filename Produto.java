package src;

public class Produto {
    
    // Atributos de Visibilidade
    private String nomeDoProduto;
    protected double precoDoProduto;
    public String detalhesDoProduto;
    private String marcaDoProduto;

    // Colocando o modificador de acesso publico para garantir acesso externo
    // get para ler o atributo
    // return retorna o valor do atri
    // this usa para referenciar o objeto atual

    public String getMarcaDoProduto() {
        return marcaDoProduto;
    }
    public void setMarcaDoProduto(String marcaDoProduto){
        this.marcaDoProduto = marcaDoProduto;
    }

    public String getNomeDoProduto(){
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto){
        this.nomeDoProduto = nomeDoProduto;
    }
    public Double getPrecoDoProduto(){
        return precoDoProduto;
    }
    public void setPrecoDoProduto(Double precoDoProduto){
        this.precoDoProduto = precoDoProduto;
    }
    public String getDetalheDoProduto(){
        return detalhesDoProduto;
    }
    public void setDetalhesDoProduto(String detalhesDoProduto){
        this.detalhesDoProduto = detalhesDoProduto;
    }
    
}
