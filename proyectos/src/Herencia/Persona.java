package Herencia;

import java.util.InvalidPropertiesFormatException;

public class Persona implements Ipersona {
//    public String nombres;
//    public String apellidos;
//    public int edad;
//    public String CI;

    public Persona(String nombres, String apellidos, int edad, String CI) {
        CI = Ipersona.ci;
    }

    public String getCI(String ci) {
        return ci;
    }

//    public void setCI(String CI) {
//        this.CI = CI;
//    }
//
//    public String getCI() {
//        return CI;
//    }
}
