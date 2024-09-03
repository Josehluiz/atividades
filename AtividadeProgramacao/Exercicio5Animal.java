
package exercicios;
    
/**
 * Classe abstrata que representa um animal no zoológico.
 * Contém atributos e métodos comuns para todos os tipos de animais.
 */
public abstract class Exercicio5Animal {

    protected String nome;
    protected int idade;
    protected String especie;

    /**
     * Construtor da classe Animal.
     *
     * @param nome    o nome do animal
     * @param idade   a idade do animal
     * @param especie a espécie do animal
     */
    public Exercicio5Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /**
     * Método abstrato para emitir som específico do animal.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void emitirSom();

    /**
     * Método abstrato para alimentar o animal.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void alimentar();

    /**
     * Retorna o nome do animal.
     *
     * @return o nome do animal
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a idade do animal.
     *
     * @return a idade do animal
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna a espécie do animal.
     *
     * @return a espécie do animal
     */
    public String getEspecie() {
        return especie;
    }
}

