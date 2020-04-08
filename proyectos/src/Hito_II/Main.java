package Hito_II;

public class Main {
    public static void main(String[] args) {
        String [] policias;

        Persona p = new Persona();
//        p.leer();
//        p.mostrar();
//
//        Profesor pf = new Profesor();
//        pf.leer();

        Policia pp = new Policia();
        pp.leer();

        Policia pp1 = new Policia();
        pp1.leer();
//        pp.Mostrar(pf.getCiudad());

        Departamento d = new Departamento();
//        System.out.print(d.Dep(pp.getDestinos()));
        String n1m,n2m;
        int m1,m2;
        d.Dep(pp.getDestinos());
        n1m = d.getNombreDep();
        m1 = d.getCant();
        System.out.print(n1m+m1);


        d.Dep(pp1.getDestinos());
        n2m = d.getNombreDep();
        m2 = d.getCant();
        System.out.print(n2m+m2);


        if(n1m.equals(n2m)){
            System.out.print(n1m+m1+m2);
        }
        else if(m1>m2){
            System.out.print(n1m+m1);
        }
        else if(m2>m1){
            System.out.print(n2m+m2);
        }


    }
}
