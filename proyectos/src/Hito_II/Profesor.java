package Hito_II;

public class Profesor extends Persona {
        private String ciudad;
        private int cargaH;
        private int nroMaterias;
        private String [] materias;

        public Profesor(){
            this.ciudad = "";
            this.cargaH = 0;
            this.nroMaterias = 0;
        }

    public String getCiudad() {
        return this.ciudad;
    }

    public void leer() {
        super.leer();
        System.out.println("ingrese la cuidad: ");
        this.ciudad = LEER.next();
//        System.out.println("ingrese el numero de destinos: ");
//        this.nroDestinos = LEER.nextInt();
//
//        System.out.println("ingrese los"+nroDestinos+" destinos: ");
//
//        this.destinos = new String[this.nroDestinos];
//
//        for(int i=0 ; i<this.nroDestinos ; i++){
//            System.out.println("destino "+i+": ");
//            String dest = LEER.next();
//            destinos[i] = dest;
//
//        }
//        for(int i=0 ; i<destinos.length ; i++){
//
//            System.out.println("destino "+i+": "+destinos[i]);
//
//        }
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("ciudad: "+ciudad);
//        System.out.println("numero de destinos: "+nroDestinos);
//
//        System.out.println("destinos: ");
////        this.destinos = new String[this.nroDestinos];
//
//        for(int j=0 ; j<this.nroDestinos ; j++){
//
//            System.out.println("destino "+j+": "+this.destinos[j]);
//
//        }

    }
}
