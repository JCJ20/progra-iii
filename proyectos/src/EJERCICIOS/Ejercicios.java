package EJERCICIOS;

import java.util.Scanner;

public class Ejercicios {

    int fibonacci(int n)
    {
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    public void imprimirF(int n){
        System.out.println(fibonacci(n));
    }

    public void seleccion(int A[]) {
        int i=0, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
            System.out.println(A[i]);
        }

    }

    public void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
            System.out.println(A[i]);

        }
    }

    public void cadena10(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5 ; i++) {
            System.out.println("ingrese un nombre: ");
            String c = scanner.nextLine();
            int tam = 10;
            char[] arrayChar = c.toCharArray();

            while (tam!=arrayChar.length) {

            }
        }

    }



}
