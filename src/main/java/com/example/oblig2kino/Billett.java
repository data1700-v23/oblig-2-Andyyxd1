package com.example.oblig2kino;

public class Billett {
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String telefon;
    private String epostadresse;

    public Billett(String film, int antall, String fornavn, String etternavn, String telefon, String epostadresse) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.epostadresse = epostadresse;
    }

    public String getFilm() {
        return film;
    }

    public int getAntall() {
        return antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEpostadresse() {
        return epostadresse;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEpostadresse(String epostadresse) {
        this.epostadresse = epostadresse;
    }
}
