package Hito_II;

import ManejoInterfaces.Cuadrado;

public class Policia extends Persona   {
    public String turno;
    public int nroDestinos;
    public String [] destinos;

    public Policia() {
        this.turno = "";
        this.nroDestinos = 0;
        this.destinos = new String[nroDestinos];

    }



    public void leer() {
        super.leer();
        System.out.println("ingrese el turno: ");
        this.turno = LEER.next();
        System.out.println("ingrese el numero de destinos: ");
        this.nroDestinos = LEER.nextInt();

        System.out.println("ingrese los"+nroDestinos+" destinos: ");

        this.destinos = new String[nroDestinos];

        for(int i=0 ; i<destinos.length ; i++){
            System.out.println("destino "+i+": ");
            String dest = LEER.next();
            destinos[i] = dest;

        }
        for(int i=0 ; i<destinos.length ; i++){

            System.out.println("destino "+i+": "+destinos[i]);

        }
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("turno: "+turno);
        System.out.println("numero de destinos: "+nroDestinos);

        System.out.println("destinos: ");
        this.destinos = new String[nroDestinos];

        for(int i=0 ; i<destinos.length ; i++){

            System.out.println("destino "+i+": "+this.destinos[i]);

        }

    }
}
