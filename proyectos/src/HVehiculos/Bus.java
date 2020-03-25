package HVehiculos;

public class Bus extends Vehiculo {
    String cc;

    public Bus(String cc, int nruedas, int nacientos, int placa) {
        super(nruedas, nacientos, placa);
    }

    public void imprimirBus(){
        System.out.println(getPlaca());
    }
}
