
package exercicios;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa um pedido comum no restaurante.
 * Implementa os métodos de manipulação de itens e cálculo de total.
 */
    

public class Exercicio4PedidoComum extends Exercicio4Pedido implements Exercicio4Desconto {

    private Map<String, Double> precosItens;

    /**
     * Construtor da classe PedidoComum.
     *
     * @param numeroDoPedido o número identificador do pedido
     */
    public Exercicio4PedidoComum(int numeroDoPedido) {
        super(numeroDoPedido);
        this.precosItens = new HashMap<>();
    }

    /**
     * Calcula o total do pedido comum com base nos itens adicionados.
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
     * Adiciona um item ao pedido comum.
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
     * Remove um item do pedido comum.
     *
     * @param item o item a ser removido
     */
    @Override
    public void removerItem(String item) {
        listaDeItens.remove(item);
        precosItens.remove(item);
    }

    /**
     * Aplica um desconto ao pedido comum.
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
}

