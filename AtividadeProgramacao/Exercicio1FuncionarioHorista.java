package Aula1.Exercicios.Exercicio1;

/**
 * Classe que representa um funcionário horista.
 */
public class Exercicio1FuncionarioHorista extends Exercicio1Funcionario implements Exercicio1Pagamento {
    String nome;
    float salarioBase;
    float valorHora;
    float horasTrabalhadas;

    /**
     * Construtor da classe Exercicio1FuncionarioHorista.
     *
     * @param nome        Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Exercicio1FuncionarioHorista(String nome, float salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário do funcionário horista.
     *
     * @return o salário calculado do funcionário.
     */
    @Override
    public float calcularSalario() {
        salarioBase = valorHora * horasTrabalhadas;
        return salarioBase;
    }

    /**
     * Processa o pagamento do funcionário horista.
     *
     * @return o salário base do funcionário.
     */
    @Override
    public float processoPagamento() {
        return salarioBase;
    }

    /**
     * Obtém o nome do funcionário.
     *
     * @return o nome do funcionário.
     */
    public String getNome() {
        return nome;
    }
}