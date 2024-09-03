
package exercicios;
    
 /**
 * Classe abstrata que representa uma publicação na biblioteca.
 * Contém atributos comuns e métodos abstratos para operações de empréstimo e devolução.
 */
public abstract class Exercicio2Publicaco {

    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    /**
     * Construtor da classe Publicacao.
     *
     * @param titulo        o título da publicação
     * @param autor         o autor da publicação
     * @param anoPublicacao o ano de publicação
     */
    public Exercicio2Publicaco(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Método abstrato para emprestar a publicação.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void emprestar();

    /**
     * Método abstrato para devolver a publicação.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void devolver();

    /**
     * Retorna o título da publicação.
     *
     * @return o título da publicação
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o autor da publicação.
     *
     * @return o autor da publicação
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna o ano de publicação.
     *
     * @return o ano de publicação
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
