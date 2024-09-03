
package exercicios;


/**
 * Classe que representa um réptil no zoológico.
 * Implementa os métodos de emitir som, alimentar e cuidar.
 */
public class Exercicio5Reptil extends Exercicio5Animal implements Exercicio5Cuidador {

    /**
     * Construtor da classe Reptil.
     *
     * @param nome    o nome do réptil
     * @param idade   a idade do réptil
     * @param especie a espécie do réptil
     */
    public Exercicio5Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico do réptil.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som de réptil.");
    }

    /**
     * Alimenta o réptil com alimentos específicos.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com insetos e pequenos roedores.");
    }

    /**
     * Cuida do réptil realizando ações específicas.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidador está cuidando de " + nome + " (réptil) com controle de temperatura e umidade.");
    }
}

