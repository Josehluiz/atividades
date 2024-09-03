
package exercicios;
/**
 * Classe que representa um livro na biblioteca.
 * Implementa as regras de empréstimo, devolução e reserva para livros.
 */

public class Exercicio2Livro extends Exercicio2Publicaco implements Exercicio2Reservavel {

    

    private boolean isEmprestado;
    private boolean isReservado;

    /**
     * Construtor da classe Livro.
     *
     * @param titulo        o título do livro
     * @param autor         o autor do livro
     * @param anoPublicacao o ano de publicação do livro
     */
    public Exercicio2Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.isEmprestado = false;
        this.isReservado = false;
    }

    /**
     * Empresta o livro.
     * Define a flag isEmprestado como true.
     */
    @Override
    public void emprestar() {
        if (!isEmprestado) {
            isEmprestado = true;
            System.out.println("Livro " + titulo + " emprestado com sucesso.");
        } else {
            System.out.println("Livro " + titulo + " já está emprestado.");
        }
    }

    /**
     * Devolve o livro.
     * Define a flag isEmprestado como false.
     */
    @Override
    public void devolver() {
        if (isEmprestado) {
            isEmprestado = false;
            System.out.println("Livro " + titulo + " devolvido com sucesso.");
        } else {
            System.out.println("Livro " + titulo + " não está emprestado.");
        }
    }

    /**
     * Reserva o livro.
     * Define a flag isReservado como true.
     */
    @Override
    public void reservar() {
        if (!isReservado) {
            isReservado = true;
            System.out.println("Livro " + titulo + " reservado com sucesso.");
        } else {
            System.out.println("Livro " + titulo + " já está reservado.");
        }
    }
}
