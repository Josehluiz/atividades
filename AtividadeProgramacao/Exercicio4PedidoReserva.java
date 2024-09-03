
package exercicios;

/**
 * Classe que representa um pedido de reserva no restaurante.
 * Implementa os métodos de manipulação de itens, cálculo de total e desconto.
 */
public class Exercicio4PedidoReserva extends Exercicio4Pedido implements Exercicio4Desconto {

    private int numeroDePessoas;
    private Map<String, Double> precosItens;

    /**
     * Construtor da classe PedidoReserva.
     *
     * @param numeroDoPedido   o número identificador do pedido
     * @param numeroDePessoas  o número de pessoas na reserva
     */
    public Exercicio4PedidoReserva(int numeroDoPedido, int numeroDePessoas) {
        super(numeroDoPedido);
        this.numeroDePessoas = numeroDePessoas;
        this.precosItens = new HashMap<>();
    }

    /**
     * Calcula o total do pedido de reserva com base nos itens adicionados.
     *
     * @return o total calculado do pedido
     */
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (String item : listaDeItens) {
            total += precosItens.getOrDefault(item, 0.0);
        }
        return total;
    }

    /**
     * Adiciona um item ao pedido de reserva.
     *
     * @param item o item a ser adicionado
     */
    @Override
    public void adicionarItem(String item) {
        listaDeItens.add(item);
        // Simulando o preço de cada item
        precosItens.put(item, 10.0);
    }

    /**
     * Remove um item do pedido de reserva.
     *
     * @param item o item a ser removido
     */
    @Override
    public void removerItem(String item) {
        listaDeItens.remove(item);
        precosItens.remove(item);
    }

    /**
     * Aplica um desconto ao pedido de reserva.
     *
     * @param percentual o percentual de desconto a ser aplicado
     * @return o valor do desconto aplicado
     */
    @Override
    public double aplicarDesconto(double percentual) {
        double total = calcularTotal();
        double desconto = total * (percentual / 100);
        return total - desconto;
    }

    /**
     * Retorna o número de pessoas na reserva.
     *
     * @return o número de pessoas
     */
    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    /**
     * Define o número de pessoas na reserva.
     *
     * @param numeroDePessoas o novo número de pessoas
     */
    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }
}

