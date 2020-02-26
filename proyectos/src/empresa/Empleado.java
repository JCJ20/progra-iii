package empresa;

public class Empleado {
    private String nombre;
    private String ci;
    private int edad;

    public Empleado(String nombre1, String ci1, int edad1) {
        this.nombre = nombre1;
        this.ci = ci1;
        this.edad = edad1;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir (){
        System.out.println("Name: "+this.nombre);
        System.out.println("CI: "+this.ci);
        System.out.println("Edad: "+this.edad);
    }

}
