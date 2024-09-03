
package exercicios;


public class Exercicio3Principal {

    public static void main(String[] args) {
        Exercicio3Carro carro = new Exercicio3Carro(5, 200.0);
        Exercicio3Bike bicicleta = new Exercicio3Bike(1, 30.0);
        Exercicio3Aviao aviao = new Exercicio3Aviao(180, 900.0);

        // Mover os transportes
        carro.mover();
        bicicleta.mover();
        aviao.mover();

        // Parar os transportes
        carro.parar();
        bicicleta.parar();
        aviao.parar();

        // Abastecer os transportes motorizados
        carro.abastecer();
        aviao.abastecer();
    }
}


