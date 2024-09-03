
package exercicios;


public class Exercicio2Principal {

    public static void main(String[] args) {
        Exercicio2Livro livro = new Exercicio2Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Exercicio2Revista revista = new Exercicio2Revista("National Geographic", "Diversos", 2024);
        Exercicio2Jornal jornal = new Exercicio2Jornal("O Globo", "Diversos", 2024);

        livro.emprestar();
        revista.emprestar();
        jornal.emprestar();

        livro.devolver();
        revista.devolver();
        jornal.devolver();

        livro.reservar();
        revista.reservar();
        jornal.reservar();

    
}
}
