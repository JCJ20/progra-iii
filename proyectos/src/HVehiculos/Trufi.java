package HVehiculos;

public class Trufi extends Vehiculo {
    String cc;

    public Trufi(String cc,int nruedas, int nacientos, int placa) {
        super(nruedas, nacientos, placa);
    }

    public void imprimirTrufi(){
        System.out.println(getPlaca());
    }
}
