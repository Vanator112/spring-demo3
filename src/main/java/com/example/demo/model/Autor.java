package com.example.demo.model;

public class Autor {

    private String nume;

    private String carte;

    public Autor(String nume, String carte) {
        this.nume = nume;
        this.carte = carte;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }
}
