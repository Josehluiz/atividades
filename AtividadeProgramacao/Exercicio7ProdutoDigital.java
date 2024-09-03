
package exercicios;

/**
 * Classe que representa um produto digital.
 * Implementa os métodos de calcular preço final, exibir detalhes e aplicar promoção.
 */
public class Exercicio7ProdutoDigital extends Exercicio7Produto implements Exercicio7Promo {

    private double taxaLicenca;

    /**
     * Construtor da classe ProdutoDigital.
     *
     * @param nome       o nome do produto
     * @param preco      o preço do produto
     * @param categoria  a categoria do produto
     * @param taxaLicenca a taxa de licença do produto
     */
    public Exercicio7ProdutoDigital(String nome, double preco, String categoria, double taxaLicenca) {
        super(nome, preco, categoria);
        this.taxaLicenca = taxaLicenca;
    }

    /**
     * Calcula o preço final do produto digital, incluindo a taxa de licença.
     *
     * @return o preço final do produto digital
     */
    @Override
    public double calcularPrecoFinal() {
        return preco + taxaLicenca;
    }

    /**
     * Exibe os detalhes do produto digital.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Digital: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Taxa de Licença: R$" + taxaLicenca);
    }

    /**
     * Aplica uma promoção no produto digital, reduzindo o preço.
     */
    @Override
    public void aplicarPromocao() {
        this.preco *= 0.8; // Exemplo de 20% de desconto
    }
}
