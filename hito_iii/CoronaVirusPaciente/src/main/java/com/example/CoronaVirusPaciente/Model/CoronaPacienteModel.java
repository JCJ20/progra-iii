package com.example.CoronaVirusPaciente.Model;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CoronaVirusPaciente")
public class CoronaPacienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCoronaVirus;
    @Column(name = "Departamento", length = 50)
    private String nombreDepartamento;
    @Column(name = "NombrePaciente", length = 50)
    private String nombrePaciente;
    @Column(name = "ApellidosPaciente", length = 50)
    private String apellidosPaciente;
    @Column(name = "EdadPaciente")
    private int edadPaciente;
    @Column(name = "Categoria", length = 15)
    private String categoria;
    @Column(name = "Fullname", length = 100)
    private String fullname;
    @Column(name = "CasosSospechosos")
    private int casosSospechosos;
    @Column(name = "CasosConfirmados")
    private int casosConfirmados;
    @Column(name = "CasosRecuperados")
    private int casosRecuperados;

    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getIdCoronaVirus() {
        return idCoronaVirus;
    }

    public void setIdCoronaVirus(int idCoronaVirus) {
        this.idCoronaVirus = idCoronaVirus;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
