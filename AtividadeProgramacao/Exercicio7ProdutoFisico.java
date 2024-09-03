
package exercicios;

/**
 * Classe que representa um produto físico.
 * Implementa os métodos de calcular preço final, exibir detalhes e aplicar promoção.
 */
public class Exercicio7ProdutoFisico extends Exercicio7Produto implements Exercicio7Promo {

    private double custoEnvio;

    /**
     * Construtor da classe ProdutoFisico.
     *
     * @param nome       o nome do produto
     * @param preco      o preço do produto
     * @param categoria  a categoria do produto
     * @param custoEnvio o custo de envio do produto
     */
    public Exercicio7ProdutoFisico(String nome, double preco, String categoria, double custoEnvio) {
        super(nome, preco, categoria);
        this.custoEnvio = custoEnvio;
    }

    /**
     * Calcula o preço final do produto físico, incluindo o custo de envio.
     *
     * @return o preço final do produto físico
     */
    @Override
    public double calcularPrecoFinal() {
        return preco + custoEnvio;
    }

    /**
     * Exibe os detalhes do produto físico.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Físico: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Custo de Envio: R$" + custoEnvio);
    }

    /**
     * Aplica uma promoção no produto físico, reduzindo o preço.
     */
    @Override
    public void aplicarPromocao() {
        this.preco *= 0.9; // Exemplo de 10% de desconto
    }
}

