package Aula1.Exercicios.Exercicio1;

/**
 * Classe que representa um funcionário comissionado.
 */
public class Exercicio1FuncionarioComissionado extends Exercicio1Funcionario implements Exercicio1Pagamento {
    private String nome;
    private float salarioBase;
    private float comissao;
    private float totalVendas;

    /**
     * Construtor da classe Exercicio1FuncionarioComissionado.
     *
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     * @param comissao Comissão do funcionário.
     * @param totalVendas Total de vendas do funcionário.
     */
    public Exercicio1FuncionarioComissionado(String nome, float salarioBase, float comissao, float totalVendas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    /**
     * Calcula o salário do funcionário comissionado.
     *
     * @return o salário calculado do funcionário.
     */
    @Override
    public float calcularSalario() {
        salarioBase = salarioBase + (comissao * totalVendas);
        return salarioBase;
    }

    /**
     * Processa o pagamento do funcionário comissionado.
     *
     * @return o salário calculado do funcionário.
     */
    @Override
    public float processoPagamento() {
        return calcularSalario();
    }

    /**
     * Retorna uma representação em string do funcionário comissionado.
     *
     * @return uma string representando o funcionário comissionado.
     */
    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", comissao=" + comissao +
                ", totalVendas=" + totalVendas +
                '}';
    }
}