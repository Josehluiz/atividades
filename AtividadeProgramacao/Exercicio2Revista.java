
package exercicios;

/**
 * Classe que representa uma revista na biblioteca.
 * Implementa as regras de empréstimo, devolução e reserva para revistas.
 */
public class Exercicio2Revista extends Exercicio2Publicaco implements Exercicio2Reservavel {

    

    private boolean isEmprestado;
    private boolean isReservado;

    /**
     * Construtor da classe Revista.
     *
     * @param titulo        o título da revista
     * @param autor         o autor da revista
     * @param anoPublicacao o ano de publicação da revista
     */
    public Exercicio2Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.isEmprestado = false;
        this.isReservado = false;
    }

    /**
     * Empresta a revista.
     * Define a flag isEmprestado como true.
     */
    @Override
    public void emprestar() {
        if (!isEmprestado) {
            isEmprestado = true;
            System.out.println("Revista " + titulo + " emprestada com sucesso.");
        } else {
            System.out.println("Revista " + titulo + " já está emprestada.");
        }
    }

    /**
     * Devolve a revista.
     * Define a flag isEmprestado como false.
     */
    @Override
    public void devolver() {
        if (isEmprestado) {
            isEmprestado = false;
            System.out.println("Revista " + titulo + " devolvida com sucesso.");
        } else {
            System.out.println("Revista " + titulo + " não está emprestada.");
        }
    }

    /**
     * Reserva a revista.
     * Define a flag isReservado como true.
     */
    @Override
    public void reservar() {
        if (!isReservado) {
            isReservado = true;
            System.out.println("Revista " + titulo + " reservada com sucesso.");
        } else {
            System.out.println("Revista " + titulo + " já está reservada.");
        }
    }
}
