package Transporte;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setColor("blanco");
        auto.setNroRuedas(4);
        auto.color();
        auto.nroRuedas();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setColor("verde");
        bicicleta.setNroRuedas(2);
        bicicleta.nroRuedas();
        bicicleta.color();
    }
}
