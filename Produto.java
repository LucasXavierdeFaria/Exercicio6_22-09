public class Produto {
    private string nome;
    private double preco, custo;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void calcularEstoque(double preco, int qtd){
        custo = preco * qtd;
        System.out.println("O Custo total do produto "+nome+" é: R$"+custo);
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
