package com.example.demo.Model;

import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Entity
@Table(name = "Corona-Virus")
public class CoronaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDep;
    @Column(name = "Departamento", length = 50)
    private String NombreDep;
    @Column(name = "Departamento", length = 50)
    private Integer CasosSospechosos;
    @Column(name = "Departamento", length = 50)
    private Integer CasosConfirmados;
    @Column(name = "Departamento", length =  50)
    private Integer CasosRecuperados;

    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    public String getNombreDep() {
        return NombreDep;
    }

    public void setNombreDep(String nombreDep) {
        NombreDep = nombreDep;
    }

    public Integer getCasosSospechosos() {
        return CasosSospechosos;
    }

    public void setCasosSospechosos(Integer casosSospechosos) {
        CasosSospechosos = casosSospechosos;
    }

    public Integer getCasosConfirmados() {
        return CasosConfirmados;
    }

    public void setCasosConfirmados(Integer casosConfirmados) {
        CasosConfirmados = casosConfirmados;
    }

    public Integer getCasosRecuperados() {
        return CasosRecuperados;
    }

    public void setCasosRecuperados(Integer casosRecuperados) {
        CasosRecuperados = casosRecuperados;
    }
}
