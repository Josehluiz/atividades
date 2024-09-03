package Aula1.Exercicios.Exercicio1;

/**
 * Classe abstrata que representa um funcionário.
 */
public abstract class Exercicio1Funcionario {
    /**
     * Nome do funcionário.
     */
    String nome;

    /**
     * Salário base do funcionário.
     */
    float salarioBase;

    /**
     * Método abstrato para calcular o salário do funcionário.
     *
     * @return o salário calculado do funcionário.
     */
    public abstract float calcularSalario();
}