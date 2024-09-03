
package exercicios;


public abstract class Exercicio3Transporte {

    protected int capacidade;
    protected double velocidadeMaxima;

    /**
     * Construtor da classe Transporte.
     *
     * @param capacidade        a capacidade do transporte
     * @param velocidadeMaxima  a velocidade máxima do transporte
     */
    public Exercicio3Transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Método abstrato para mover o transporte.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void mover();

    /**
     * Método abstrato para parar o transporte.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void parar();

    /**
     * Retorna a capacidade do transporte.
     *
     * @return a capacidade do transporte
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Retorna a velocidade máxima do transporte.
     *
     * @return a velocidade máxima do transporte
     */
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}

    

