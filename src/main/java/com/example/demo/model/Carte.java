package com.example.demo.model;

public class Carte {

    private String nume;

    private String data_aparitie;

    private int numar_pagini;

    private int numar_copii;

    public Carte(String nume, String data_aparitie, int numar_pagini, int numar_copii) {
        this.nume = nume;
        this.data_aparitie = data_aparitie;
        this.numar_pagini = numar_pagini;
        this.numar_copii = numar_copii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getData_aparitie() {
        return data_aparitie;
    }

    public void setData_aparitie(String data_aparitie) {
        this.data_aparitie = data_aparitie;
    }

    public int getNumar_pagini() {
        return numar_pagini;
    }

    public void setNumar_pagini(int numar_pagini) {
        this.numar_pagini = numar_pagini;
    }

    public int getNumar_copii() {
        return numar_copii;
    }

    public void setNumar_copii(int numar_copii) {
        this.numar_copii = numar_copii;
    }
}

