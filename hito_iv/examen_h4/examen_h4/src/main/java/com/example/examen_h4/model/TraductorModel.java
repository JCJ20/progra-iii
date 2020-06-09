package com.example.examen_h4.model;



import javax.persistence.*;

@Entity
@Table(name = "diccionary")
public class TraductorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String english;
    @Column
    private String portugues;
    @Column
    private String word;

    public TraductorModel() {
    }

    public TraductorModel(String english, String portugues, String word) {
        this.english = english;
        this.portugues = portugues;
        this.word = word;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
