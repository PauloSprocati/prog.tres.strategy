import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> lista = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public void adicionarProduto(Produto produto) {
        this.lista.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotalComDesconto() {
        double totalProdutos = 0.0;
        for (Produto produto : this.lista) {
            totalProdutos += produto.getPreco();
        }

        return this.descontoStrategy.calcularDesconto(totalProdutos);
    }
}
