
package exercicios;
    
/**
 * Classe que representa uma bicicleta.
 * Implementa os métodos de movimento e parada para bicicletas.
 */
public class Exercicio3Bike extends Exercicio3Transporte {

    private boolean emMovimento;

    /**
     * Construtor da classe Bicicleta.
     *
     * @param capacidade        a capacidade da bicicleta
     * @param velocidadeMaxima  a velocidade máxima da bicicleta
     */
    public Exercicio3Bike(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
        this.emMovimento = false;
    }

    /**
     * Move a bicicleta.
     * Indica que a bicicleta está em movimento.
     */
    @Override
    public void mover() {
        if (!emMovimento) {
            emMovimento = true;
            System.out.println("Bicicleta está se movendo.");
        } else {
            System.out.println("Bicicleta já está em movimento.");
        }
    }

    /**
     * Para a bicicleta.
     * Indica que a bicicleta parou.
     */
    @Override
    public void parar() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("Bicicleta parou.");
        } else {
            System.out.println("Bicicleta já está parada.");
        }
    }
}

