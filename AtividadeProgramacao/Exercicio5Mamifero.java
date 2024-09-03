/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
    
/**
 * Classe que representa um mamífero no zoológico.
 * Implementa os métodos de emitir som, alimentar e cuidar.
 */
public class Exercicio5Mamifero extends Exercicio5Animal implements Exercicio5Cuidador {

    /**
     * Construtor da classe Mamifero.
     *
     * @param nome    o nome do mamífero
     * @param idade   a idade do mamífero
     * @param especie a espécie do mamífero
     */
    public Exercicio5Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico do mamífero.
     */
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som de mamífero.");
    }

    /**
     * Alimenta o mamífero com alimentos específicos.
     */
    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com ração para mamíferos.");
    }

    /**
     * Cuida do mamífero realizando ações específicas.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidador está cuidando de " + nome + " (mamífero) com atividades de exercício e limpeza.");
    }
}

