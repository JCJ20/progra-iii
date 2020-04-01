package Hito_II;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
//        p.leer();
//        p.mostrar();
//
        Profesor pf = new Profesor();
        pf.leer();

        Policia pp = new Policia();
        pp.leer();
        pp.Mostrar(pf.getCiudad());


    }
}
