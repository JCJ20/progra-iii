package HVehiculos;

public class Vehiculo {
    public int Nruedas;
    public int Nacientos;
    private int placa;

    public Vehiculo(int nruedas, int nacientos, int placa) {
        this.Nruedas = nruedas;
        this.Nacientos = nacientos;
        this.placa = placa;
    }

    public int getNruedas() {
        return Nruedas;
    }

    public void setNruedas(int nruedas) {
        Nruedas = nruedas;
    }

    public int getNacientos() {
        return Nacientos;
    }

    public void setNacientos(int nacientos) {
        Nacientos = nacientos;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
