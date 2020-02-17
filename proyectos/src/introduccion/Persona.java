package introduccion;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//        System.out.println("ingrese su nombre: ");
//        String n = leer.nextLine();
//
//        System.out.print("hola " + n);
//
//        System.out.println("ingrese su edad");
//        while (leer.hasNextInt()) {
//            System.out.println("ingrese su edad");
//            int e = leer.nextInt();
//            System.out.println("tienes " + e);
//        }
        //sumar las primeras 5 edades

        int c = 0;
        int cn = 0;
        //System.out.println("ingrese las edades");
        while (cn<5) {
            System.out.println("ingrese la edad");
            int e = leer.nextInt();
            //System.out.println("edad " + e);
            c+=e;
            cn++;
        }
        System.out.println("la suma es: "+ c);
        System.out.println("el promedio es: "+ c/cn);



    }
}
