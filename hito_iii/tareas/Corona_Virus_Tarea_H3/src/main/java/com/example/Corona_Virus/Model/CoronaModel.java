package com.example.Corona_Virus.Model;

import javax.persistence.*;

@Entity
@Table(name = "CoronaVirus")
public class CoronaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDep;
    @Column(name = "NombreDepartamento", length = 50)
    private String nombreDepartamento;
    @Column(name = "CasosSospechosos")
    private int casosSospechosos;
    @Column(name = "CasosConfirmados")
    private int casosConfirmados;
    @Column(name = "CasosRecuperados")
    private int casosRecuperados;

    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCasosSospechosos() {
        return casosSospechosos;
    }

    public void setCasosSospechosos(int casosSospechosos) {
        this.casosSospechosos = casosSospechosos;
    }

    public int getCasosConfirmados() {
        return casosConfirmados;
    }

    public void setCasosConfirmados(int casosConfirmados) {
        this.casosConfirmados = casosConfirmados;
    }

    public int getCasosRecuperados() {
        return casosRecuperados;
    }

    public void setCasosRecuperados(int casosRecuperados) {
        this.casosRecuperados = casosRecuperados;
    }
}

