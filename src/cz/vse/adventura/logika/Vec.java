package cz.vse.adventura.logika;

public class Vec {
    private int pocet;
    private String nazev;

    public Vec(String nazev, boolean prenositelna, int pocet) {
        this.nazev = nazev;
        this.prenositelna = prenositelna;
        this.pocet = pocet;
    }

    private boolean prenositelna;

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public boolean isPrenositelna() {
        return prenositelna;
    }

    public void setPrenositelna(boolean prenositelna) {
        this.prenositelna = prenositelna;
    }

    public int getPocet() {
        return pocet;
    }

    public void setPocet(int pocet) {
        this.pocet = pocet;
    }
}
