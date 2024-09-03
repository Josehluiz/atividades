package Aula1.Exercicios.Exercicio1;

/**
 * Classe principal para execução do programa de funcionários.
 */
public class Exercicio1Principal {
    /**
     * Método principal para execução do programa.
     *
     * @param args Argumentos de linha de comando.
     */
    public static void main(String[] args) {
        /**
         * Cria uma instância de Exercicio1FuncionarioHorista.
         */
        Exercicio1Funcionario funcionario1 = new Exercicio1FuncionarioHorista("João", 1000);

        /**
         * Cria uma instância de Exercicio1FuncionarioMensalista.
         */
        Exercicio1Funcionario funcionario2 = new Exercicio1FuncionarioMensalista("Maria", 2000);

        /**
         * Cria uma instância de Exercicio1FuncionarioComissionado.
         */
        Exercicio1Funcionario funcionario3 = new Exercicio1FuncionarioComissionado("José", 1500, 0.1f, 5000);

        /**
         * Imprime a representação em string do funcionário horista.
         */
        System.out.println(funcionario1);

        /**
         * Imprime a representação em string do funcionário mensalista.
         */
        System.out.println(funcionario2);

        /**
         * Imprime a representação em string do funcionário comissionado.
         */
        System.out.println(funcionario3);
    }
}