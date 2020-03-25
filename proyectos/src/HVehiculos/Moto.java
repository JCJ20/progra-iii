package HVehiculos;

public class Moto extends Vehiculo {
    String cc;
    public Moto(String cc,int nruedas, int nacientos, int placa) {
        super(nruedas, nacientos, placa);
    }

    public void imprimirMoto(){
        System.out.println(getPlaca());
    }
}
