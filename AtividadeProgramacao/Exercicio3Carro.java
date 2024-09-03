
package exercicios;

    
    /**
 * Classe que representa um carro.
 * Implementa os métodos de movimento, parada e abastecimento para carros.
 */
public class Exercicio3Carro extends Exercicio3Transporte implements Exercicio3Combusstivel {

    private boolean ligado;

    /**
     * Construtor da classe Carro.
     *
     * @param capacidade        a capacidade do carro
     * @param velocidadeMaxima  a velocidade máxima do carro
     */
    public Exercicio3Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
        this.ligado = false;
    }

    /**
     * Move o carro.
     * Indica que o carro está em movimento.
     */
    @Override
    public void mover() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro está se movendo.");
        } else {
            System.out.println("Carro já está em movimento.");
        }
    }

    /**
     * Para o carro.
     * Indica que o carro parou.
     */
    @Override
    public void parar() {
        if (ligado) {
            ligado = false;
            System.out.println("Carro parou.");
        } else {
            System.out.println("Carro já está parado.");
        }
    }

    /**
     * Abastece o carro.
     * Indica que o carro foi abastecido.
     */
    @Override
    public void abastecer() {
        System.out.println("Carro abastecido.");
    }
}

    

