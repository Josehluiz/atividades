
package exercicios;
import java.util.ArrayList;
import java.util.List;

public abstract class Exercicio4Pedido {

    protected int numeroDoPedido;
    protected List<String> listaDeItens;
    protected String status;

    /**
     * Construtor da classe Pedido.
     *
     * @param numeroDoPedido o número identificador do pedido
     */
    public Exercicio4Pedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
        this.listaDeItens = new ArrayList<>();
        this.status = "Novo";
    }

    /**
     * Método abstrato para calcular o total do pedido.
     * Deve ser implementado por todas as subclasses.
     *
     * @return o total calculado do pedido
     */
    public abstract double calcularTotal();

    /**
     * Método abstrato para adicionar um item ao pedido.
     * Deve ser implementado por todas as subclasses.
     *
     * @param item o item a ser adicionado
     */
    public abstract void adicionarItem(String item);

    /**
     * Método abstrato para remover um item do pedido.
     * Deve ser implementado por todas as subclasses.
     *
     * @param item o item a ser removido
     */
    public abstract void removerItem(String item);

    /**
     * Retorna o número do pedido.
     *
     * @return o número do pedido
     */
    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    /**
     * Retorna a lista de itens do pedido.
     *
     * @return a lista de itens
     */
    public List<String> getListaDeItens() {
        return listaDeItens;
    }

    /**
     * Retorna o status do pedido.
     *
     * @return o status do pedido
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o status do pedido.
     *
     * @param status o novo status do pedido
     */
    public void setStatus(String status) {
        this.status = status;
    }
}

