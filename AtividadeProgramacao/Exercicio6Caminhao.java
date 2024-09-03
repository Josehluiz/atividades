
package exercicios;
    
/**
 * Classe que representa um caminhão.
 * Implementa os métodos de ligar, desligar, acelerar e realizar manutenção.
 */
public class Exercicio6Caminhao extends Exercicio6Veiculo implements Exercicio6Manutencao {

    /**
     * Construtor da classe Caminhao.
     *
     * @param marca  a marca do caminhão
     * @param modelo o modelo do caminhão
     * @param ano    o ano de fabricação do caminhão
     */
    public Exercicio6Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga o caminhão.
     */
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligado.");
    }

    /**
     * Desliga o caminhão.
     */
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligado.");
    }

    /**
     * Acelera o caminhão.
     */
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    /**
     * Realiza manutenção no caminhão.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no " + marca + " " + modelo + " (caminhão).");
    }
}

