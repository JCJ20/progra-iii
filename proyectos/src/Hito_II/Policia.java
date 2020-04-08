package Hito_II;

import ManejoInterfaces.Cuadrado;

public class Policia extends Persona   {
    private String turno;
    private int nroDestinos;
    private String [] destinos;

    public Policia() {
        super();
        this.turno = "";
        this.nroDestinos = 0;
    }

    public void leer() {
        super.leer();
        System.out.println("ingrese el turno: ");
        this.turno = LEER.next();
        System.out.println("ingrese el numero de destinos: ");
        this.nroDestinos = LEER.nextInt();

        System.out.println("ingrese los"+nroDestinos+" destinos: ");

        this.destinos = new String[this.nroDestinos];

        for(int i=0 ; i<this.nroDestinos ; i++){
            System.out.println("destino "+i+": ");
            String dest = LEER.next();
            destinos[i] = dest;

        }
        for(int i=0 ; i<destinos.length ; i++){

            System.out.println("destino "+i+": "+destinos[i]);

        }
    }

    public String[] getDestinos() {
        return destinos;
    }

    public void Mostrar(String c) {
        super.mostrar();
        System.out.println("turno: "+turno);
        System.out.println("numero de destinos: "+nroDestinos);

        System.out.println("destinos: ");
//        this.destinos = new String[this.nroDestinos];

        for(int j=0 ; j<this.nroDestinos ; j++){

            System.out.println("destino "+j+": "+this.destinos[j]);
            if(this.destinos[j].equals(c)){
                System.out.println("coinciden : "+this.destinos[j]);

            };

        }


    }
}
