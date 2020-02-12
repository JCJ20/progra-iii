import java.util.Scanner;

public class variables {

    public static void main(String[] args) {

        pedir_nombre();
    }

    public static void pedir_nombre() {
        String pwd = "123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String n = scanner.nextLine();

        System.out.println("ingrese su contraseña: ");
        String c = scanner.nextLine();

        if(c.equals(pwd)){
            System.out.println("bienvenido "+n);
        }
    }
}
