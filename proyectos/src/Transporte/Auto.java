package Transporte;

public class Auto implements Vehiculo{
    private int nroRuedas;
    private String color;

    @Override
    public void nroRuedas() {
        System.out.printf("Nro de ruedas: %d\n", this.getNroRuedas());
    }


    public void color() {
        System.out.printf("color del auto: %s\n",this.getColor());
    }

    public void setNroRuedas(int nroRuedas){
        this.nroRuedas = nroRuedas;
    }

    public int getNroRuedas() {
        return nroRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
