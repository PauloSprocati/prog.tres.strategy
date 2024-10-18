public class DescontoClienteVIP implements DescontoStrategy{
    @Override
    public double calcularDesconto(double preco) {
        return preco - ((preco * 20) / 100);
    }
}
