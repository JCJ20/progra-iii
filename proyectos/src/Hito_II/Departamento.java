package Hito_II;

public class Departamento {

    public String nombreDep;
    public int cant;


    public Departamento() {
    }

    public void Dep(String [] d) {
        String depto = null;
        int cont1=0,cont2=0,cont3=0;
        int may = 0;
        String [] dep = {"cbba","scz","oru"};

        for(int i=0;i<dep.length;i++){
            if(dep[0].equals(d[i])){
                cont1++;
            }
            if(dep[1].equals(d[i])){
                cont2++;
            }
            if(dep[2].equals(d[i])){
                cont3++;

            }
        }
        if(cont2>cont1 && cont2>cont3){
            may=cont2;
            depto=dep[1];
        }
        if(cont1>cont2 && cont1>cont3){
            may=cont1;
            depto=dep[0];

        }
        if(cont3>cont2 && cont3>cont1){
            may=cont2;
            depto=dep[2];

        }

        this.nombreDep = depto;
        this.cant = may;
    }
    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }


}
