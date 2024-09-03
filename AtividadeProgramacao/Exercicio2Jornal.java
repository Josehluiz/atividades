
package exercicios;

/**
 * Classe que representa um jornal na biblioteca.
 * Implementa as regras de empréstimo, devolução e reserva para jornais.
 */
public class Exercicio2Jornal extends Exercicio2Publicaco implements Exercicio2Reservavel {

    

    private boolean isEmprestado;
    private boolean isReservado;

    /**
     * Construtor da classe Jornal.
     *
     * @param titulo        o título do jornal
     * @param autor         o autor do jornal
     * @param anoPublicacao o ano de publicação do jornal
     */
    public Exercicio2Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.isEmprestado = false;
        this.isReservado = false;
    }

    /**
     * Empresta o jornal.
     * Define a flag isEmprestado como true.
     */
    @Override
    public void emprestar() {
        if (!isEmprestado) {
            isEmprestado = true;
            System.out.println("Jornal " + titulo + " emprestado com sucesso.");
        } else {
            System.out.println("Jornal " + titulo + " já está emprestado.");
        }
    }

    /**
     * Devolve o jornal.
     * Define a flag isEmprestado como false.
     */
    @Override
    public void devolver() {
        if (isEmprestado) {
            isEmprestado = false;
            System.out.println("Jornal " + titulo + " devolvido com sucesso.");
        } else {
            System.out.println("Jornal " + titulo + " não está emprestado.");
        }
    }

    /**
     * Reserva o jornal.
     * Define a flag isReservado como true.
     */
    @Override
    public void reservar() {
        if (!isReservado) {
            isReservado = true;
            System.out.println("Jornal " + titulo + " reservado com sucesso.");
        } else {
            System.out.println("Jornal " + titulo + " já está reservado.");
        }
    }
}
