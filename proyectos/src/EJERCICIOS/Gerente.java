package EJERCICIOS;

public class Gerente extends Empleado {
    public int nroID;
    public int sueldoBasico;
    public String codArea;

    public Gerente(String primerNombre, String primerApellido, int ciNumero, String ciExtencion) {
        super(primerNombre, primerApellido, ciNumero, ciExtencion);

    }

    public void Leer() {

        System.out.println("ingrese id: ");
        this.nroID = LEER.nextInt();

//        System.out.println("ingrese el codigo de area: ");
//        this.codArea = LEER.nextLine();
//
//        System.out.println("ingrese el sueldo basico: ");
//        this.sueldoBasico = LEER.nextInt();
        super.leer();
    }

    public void Mostrar() {

        System.out.println("id: "+nroID);
//        System.out.println("codigo de area: "+codArea);
//        System.out.println("sueldo basico: "+sueldoBasico);
        super.mostrar();
    }
}
