package empresa;

public class Area {
    private String nombre;
    private Empleado[] empleados;

    public Area(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void Imprimir(){
        System.out.println(("Area: "+ this.nombre));
        for (int i=0; i<this.empleados.length; i++) {
            this.empleados[i].imprimir();
        }
    }
}
