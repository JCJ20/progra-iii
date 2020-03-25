package Calculadora;

public class Calculadora implements Suma, Resta, Multiplicacion{
    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    public void imprimir(String msg, int value){
        System.out.printf(msg,value);
    }
}
