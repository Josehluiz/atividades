
package exercicios;
    
/**
 * Classe abstrata que representa um veículo.
 * Contém atributos e métodos comuns para todos os tipos de veículos.
 */
public abstract class Exercicio6Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    /**
     * Construtor da classe Veiculo.
     *
     * @param marca  a marca do veículo
     * @param modelo o modelo do veículo
     * @param ano    o ano de fabricação do veículo
     */
    public Exercicio6Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método abstrato para ligar o veículo.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void ligar();

    /**
     * Método abstrato para desligar o veículo.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void desligar();

    /**
     * Método abstrato para acelerar o veículo.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void acelerar();

    /**
     * Retorna a marca do veículo.
     *
     * @return a marca do veículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna o modelo do veículo.
     *
     * @return o modelo do veículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Retorna o ano de fabricação do veículo.
     *
     * @return o ano de fabricação do veículo
     */
    public int getAno() {
        return ano;
    }
}

