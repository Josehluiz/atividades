
package exercicios;
    
/**
 * Classe que representa um carro.
 * Implementa os métodos de ligar, desligar, acelerar e realizar manutenção.
 */
public class Exercicio6Carro extends Exercicio6Veiculo implements Exercicio6Manutencao {

    /**
     * Construtor da classe Carro.
     *
     * @param marca  a marca do carro
     * @param modelo o modelo do carro
     * @param ano    o ano de fabricação do carro
     */
    public Exercicio6Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga o carro.
     */
    @Override
    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligado.");
    }

    /**
     * Desliga o carro.
     */
    @Override
    public void desligar() {
        System.out.println(marca + " " + modelo + " está desligado.");
    }

    /**
     * Acelera o carro.
     */
    @Override
    public void acelerar() {
        System.out.println(marca + " " + modelo + " está acelerando.");
    }

    /**
     * Realiza manutenção no carro.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no " + marca + " " + modelo + " (carro).");
    }
}

