package Aula1.Exercicios.Exercicio1;

/**
 * Classe que representa um funcionário mensalista.
 */
public class Exercicio1FuncionarioMensalista extends Exercicio1Funcionario implements Exercicio1Pagamento {
    /**
     * Nome do funcionário.
     */
    private String nome;

    /**
     * Salário base do funcionário.
     */
    private float salarioBase;

    /**
     * Construtor da classe Exercicio1FuncionarioMensalista.
     *
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Exercicio1FuncionarioMensalista(String nome, float salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Obtém o nome do funcionário.
     *
     * @return o nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o salário base do funcionário.
     *
     * @return o salário base do funcionário.
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * Define o nome do funcionário.
     *
     * @param nome o novo nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o salário base do funcionário.
     *
     * @param salarioBase o novo salário base do funcionário.
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário do funcionário mensalista.
     *
     * @return o salário calculado do funcionário.
     */
    @Override
    public float calcularSalario() {
        return salarioBase;
    }

    /**
     * Processa o pagamento do funcionário mensalista.
     *
     * @return o salário calculado do funcionário.
     */
    @Override
    public float processoPagamento() {
        return calcularSalario();
    }

    /**
     * Retorna uma representação em string do funcionário mensalista.
     *
     * @return uma string representando o funcionário mensalista.
     */
    @Override
    public String toString() {
        return "FuncionarioMensalista{" +
                "nome='" + nome + '\'' +
                ", Funcionario Mensalista" +
                ", salarioBase=" + salarioBase +
                '}';
    }
}