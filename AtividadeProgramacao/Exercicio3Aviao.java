package exercicios;

    
/**
 * Classe que representa um avião.
 * Implementa os métodos de movimento, parada e abastecimento para aviões.
 */
public class Exercicio3Aviao extends Exercicio3Transporte implements Exercicio3Combusstivel {

    private boolean emVoo;

    /**
     * Construtor da classe Aviao.
     *
     * @param capacidade        a capacidade do avião
     * @param velocidadeMaxima  a velocidade máxima do avião
     */
    public Exercicio3Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
        this.emVoo = false;
    }

    /**
     * Move o avião.
     * Indica que o avião está voando.
     */
    @Override
    public void mover() {
        if (!emVoo) {
            emVoo = true;
            System.out.println("Avião está decolando.");
        } else {
            System.out.println("Avião já está em voo.");
        }
    }

    /**
     * Para o avião.
     * Indica que o avião pousou.
     */
    @Override
    public void parar() {
        if (emVoo) {
            emVoo = false;
            System.out.println("Avião pousou.");
        } else {
            System.out.println("Avião já está no solo.");
        }
    }

    /**
     * Abastece o avião.
     * Indica que o avião foi abastecido.
     */
    @Override
    public void abastecer() {
        System.out.println("Avião abastecido.");
    }
}

