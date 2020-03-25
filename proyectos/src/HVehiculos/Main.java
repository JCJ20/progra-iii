package HVehiculos;

public class Main {
    public static void main(String[] args) {
        Moto m = new Moto("200 cc",2,1,123);
        m.imprimirMoto();

        Trufi t = new Trufi("2000 cc",4,9,456);
        t.imprimirTrufi();

        Bus b = new Bus("4000 cc",8,25,789);
        b.imprimirBus();
    }
}
