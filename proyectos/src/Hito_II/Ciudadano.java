package Hito_II;

public class Ciudadano implements LeerInterface {
    private String primerNombre;
    private String primerApellido;
    private int ciNumero;
    private String ciExtencion;
    private int edad;

    public Ciudadano() {
        this.primerNombre = "";
        this.primerApellido = "";
        this.ciNumero = 0;
        this.ciExtencion = "";
        this.edad = 0;
    }

    public void leer(){
        System.out.println("Ingrese su primer nombre: ");
        this.primerNombre = LEER.next();
        System.out.println("Ingrese su primer apellido: ");
        this.primerApellido = LEER.next();
        System.out.println("Ingrese su ci: ");
        this.ciNumero = LEER.nextInt();
        System.out.println("Ingrese la extencion del ci: ");
        ciExtencion = LEER.next();
        System.out.println("Ingrese la edad: ");
        this.edad = LEER.nextInt();
    }

    public void mostrar(){
        System.out.println("nombre: "+this.primerNombre);
        System.out.println("apellido: "+this.primerApellido);
        System.out.println("ci: "+this.ciNumero);
        System.out.println("extencion: "+this.ciExtencion);
        System.out.println("edad: "+this.edad);
    }

}
