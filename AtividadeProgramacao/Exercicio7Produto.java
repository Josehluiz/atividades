
package exercicios;
/**
 * Classe abstrata que representa um produto no e-commerce.
 * Contém atributos e métodos comuns para todos os tipos de produtos.
 */
public abstract class Exercicio7Produto {

    protected String nome;
    protected double preco;
    protected String categoria;

    /**
     * Construtor da classe Produto.
     *
     * @param nome      o nome do produto
     * @param preco     o preço do produto
     * @param categoria a categoria do produto
     */
    public Exercicio7Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * Método abstrato para calcular o preço final do produto.
     * Deve ser implementado por todas as subclasses.
     *
     * @return o preço final do produto
     */
    public abstract double calcularPrecoFinal();

    /**
     * Método abstrato para exibir os detalhes do produto.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void exibirDetalhes();

    /**
     * Retorna o nome do produto.
     *
     * @return o nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o preço do produto.
     *
     * @return o preço do produto
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Retorna a categoria do produto.
     *
     * @return a categoria do produto
     */
    public String getCategoria() {
        return categoria;
    }
}

