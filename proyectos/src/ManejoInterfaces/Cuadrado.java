package ManejoInterfaces;

public class Cuadrado implements Figura {
    private Double lado;

    public Double area(){
        return lado*lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public Double Pi() {
        return null;
    }
}
