
package exercicios;
    
/**
 * Classe que representa uma moto.
 * Implementa os métodos de ligar, desligar, acelerar e realizar manutenção.
 */
public class Exercicio6Moto extends Exercicio6Veiculo implements Exercicio6Manutencao {

    /**
     * Construtor da classe Moto.
     *
     * @param marca  a marca da moto
     * @param modelo o modelo da moto
     * @param ano    o ano de fabricação da moto
     */
    public Exercicio6Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga a moto.
     */
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligada.");
    }

    /**
     * Desliga a moto.
     */
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligada.");
    }

    /**
     * Acelera a moto.
     */
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    /**
     * Realiza manutenção na moto.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção na " + marca + " " + modelo + " (moto).");
    }
}

