package Transporte;

public class Bicicleta implements Vehiculo{
    private int nroRuedas;
    private String color;

    @Override
    public void nroRuedas() {
        System.out.printf("Nro de ruedas de la bicleta: %d\n",this.getNroRuedas());
    }

    @Override
    public void color() {
        System.out.printf("color de la bicicleta: %s\n",this.getColor());
    }

    public int getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.nroRuedas = nroRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
