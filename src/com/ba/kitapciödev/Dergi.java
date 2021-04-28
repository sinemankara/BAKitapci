package com.ba.kitapciödev;

public class Dergi extends Yayin{

    private boolean aylikMi;

    public void setAylikMi(boolean aylikMi) {
        this.aylikMi = aylikMi;
    }
    public boolean isAylikMi() {
        return aylikMi;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() +
                "aylikMi=" + aylikMi +
                " }";
    }

    @Override
    public void yazdir() {
        System.out.println("dergi");
    }
}
