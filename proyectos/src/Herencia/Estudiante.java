package Herencia;

public class Estudiante extends Persona {
    private String carrera;
    public Estudiante(String carrera,String nombres, String apellidos, int edad, String CI) {
        super(nombres, apellidos, edad, CI);
    }

    public void imprimirestudiante(){
        System.out.println(getCI(ci));
    }

}
