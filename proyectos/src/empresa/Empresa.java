package empresa;

public class Empresa {
    private String nombre;
    private Area[] areas;

    public Empresa(String nombre, Area[] areas) {
        this.nombre = nombre;
        this.areas = areas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public void Imp(){
        System.out.println(("Empresa: "+ this.nombre));
        for (int i=0; i<this.areas.length; i++) {
            this.areas[i].Imprimir();
        }
    }
}
