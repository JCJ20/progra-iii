package Hito_II;

public class Persona extends Ciudadano {
    public String etapaCrecimiento;

    public Persona() {
        this.etapaCrecimiento = "";
    }

    public void leer() {
        super.leer();
        System.out.println("ingrese la etapa: ");
        this.etapaCrecimiento = LEER.next();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("etapa: "+this.etapaCrecimiento);
    }
}
