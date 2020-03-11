package empresa;

import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de empresas");
        int ne = leer.nextInt();

        Area[] areas = new Area[1];

        for (int i=0; i<ne; i++){
            System.out.println("Ingrese el nombre de la empresa");
            String nombreE = leer.next();
            System.out.println("Ingrese el nit de la empresa");
            String ci = leer.next();
            System.out.println("ingrese el numero de areas");
            int na = leer.nextInt();

            Empresa empresa = new Empresa("PIL", areas);
            empresa.Imp();
        }

        System.out.println("ingrese el numero de empleados");
        int n = leer.nextInt();

        Empleado[] empleados = new Empleado[n];

        for (int i=0; i<n; i++){
            System.out.println("Ingrese el nombre del empleado");
            String nombre = leer.next();
            System.out.println("Ingrese el ci del empleado");
            String ci = leer.next();
            System.out.println("Ingrese la edad del empleado");
            int edad = leer.nextInt();

            Empleado empleado = new Empleado(nombre,ci,edad);
            empleados[i]=empleado;
        }

        /*Empleado emp1 = new Empleado("juan", "80808080", 21);
        Empleado emp2 = new Empleado("jose", "60606060", 22);
        Empleado emp3 = new Empleado("robet", "80808080", 21);
        Empleado emp4 = new Empleado("rene", "60606060", 22);*/

        //Area areaR = new Area("RRHH", empleados);
        //areaR.Imprimir();
        //Area areaS = new Area("Sistemas", empleadosSIS);
        //areaS.Imprimir();

//        Area[] areas = new Area[1];
        //areas[1] = areaS;

    }
}
