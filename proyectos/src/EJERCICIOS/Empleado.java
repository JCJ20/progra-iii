package EJERCICIOS;

public class Empleado implements LeerInterface {
    private String primerNombre;
    private String primerApellido;
    private int ciNumero;
    private String ciExtencion;

    public Empleado() {
        this.primerNombre = "";
        this.primerApellido = "";
        this.ciNumero = 0;
        this.ciExtencion = "";
    }

    public void leer(){
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
