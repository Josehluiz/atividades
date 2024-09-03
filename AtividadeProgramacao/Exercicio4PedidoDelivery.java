
package exercicios;
    
/**
 * Classe que representa um pedido para delivery no restaurante.
 * Implementa os métodos de manipulação de itens, cálculo de total e desconto.
 */
public class Exercicio4PedidoDelivery extends Exercicio4Pedido implements Exercicio4Desconto {

    private double taxaEntrega;
    private Map<String, Double> precosItens;

    /**
     * Construtor da classe PedidoDelivery.
     *
     * @param numeroDoPedido o número identificador do pedido
     */
    public Exercicio4PedidoDelivery(int numeroDoPedido) {
        super(numeroDoPedido);
        this.taxaEntrega = 5.0; // Exemplo de taxa fixa
        this.precosItens = new HashMap<>();
    }

    /**
     * Calcula o total do pedido delivery com base nos itens adicionados e taxa de entrega.
     *
     * @return o total calculado do pedido
     */
    @Override
    public double calcularTotal() {
        double total = taxaEntrega;
        for (String item : listaDeItens) {
            total += precosItens.getOrDefault(item, 0.0);
        }
        return total;
    }

    /**
     * Adiciona um item ao pedido delivery.
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
     * Remove um item do pedido delivery.
     *
     * @param item o item a ser removido
     */
    @Override
    public void removerItem(String item) {
        listaDeItens.remove(item);
        precosItens.remove(item);
    }

    /**
     * Aplica um desconto ao pedido delivery.
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
     * Retorna a taxa de entrega do pedido delivery.
     *
     * @return a taxa de entrega
     */
    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    /**
     * Define a taxa de entrega do pedido delivery.
     *
     * @param taxaEntrega a nova taxa de entrega
     */
    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
}

