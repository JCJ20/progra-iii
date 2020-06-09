package com.example.examen_h4.model;

import javax.persistence.*;

@Entity
@Table(name = "Alfabeto")
public class AlphabetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String Letter;
    @Column
    private String fila;

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public AlphabetModel(){

    }

    public AlphabetModel(String letras, String fila){
        this.Letter = letras;
        this.fila = fila;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLetter() {
        return Letter;
    }

    public void setLetter(String letter) {
        Letter = letter;
    }

}
