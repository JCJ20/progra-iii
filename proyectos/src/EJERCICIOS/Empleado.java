package EJERCICIOS;

public class Empleado implements LeerInterface {
    public String primerNombre;
    public String primerApellido;
    public int ciNumero;
    public String ciExtencion;

    public Empleado(String primerNombre, String primerApellido, int ciNumero, String ciExtencion) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.ciNumero = ciNumero;
        this.ciExtencion = ciExtencion;
    }

    public void leer(String n){
        System.out.println("Ingrese su primer nombre: ");
        this.primerNombre = LEER.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        this.primerApellido = LEER.nextLine();
        System.out.println("Ingrese su ci: ");
        this.ciNumero = LEER.nextInt();
        System.out.println("Ingrese la extencion del ci: ");
        this.ciExtencion = LEER.nextLine();
    }

    public void mostrar(){
        System.out.println("nombre: "+primerNombre);
        System.out.println("apellido: "+primerApellido);
        System.out.println("ci: "+ciNumero);
        System.out.println("extencion: "+ciExtencion);
    }
}
