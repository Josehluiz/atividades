
package exercicios;

    
/**
 * Classe que representa uma ave no zoológico.
 * Implementa os métodos de emitir som, alimentar e cuidar.
 */
public class Exercicio5Aves extends Exercicio5Animal implements Exercicio5Cuidador {

    /**
     * Construtor da classe Ave.
     *
     * @param nome    o nome da ave
     * @param idade   a idade da ave
     * @param especie a espécie da ave
     */
    public Exercicio5Aves(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico da ave.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som de ave.");
    }

    /**
     * Alimenta a ave com alimentos específicos.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentada com sementes e frutas.");
    }

    /**
     * Cuida da ave realizando ações específicas.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidador está cuidando de " + nome + " (ave) com atividades de voo e manutenção de plumagem.");
    }
}

