package com.ba.kitapciödev;

public class Gazete extends Yayin{

    private boolean bulmacaEkiVarMi;

    public void setBulmacaEkiVarMi(boolean bulmacaEkiVarMi) {
        this.bulmacaEkiVarMi = bulmacaEkiVarMi;
    }
    public boolean isBulmacaEkiVarMi() {
        return bulmacaEkiVarMi;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() +
                "bulmacaEkiVarMi=" + bulmacaEkiVarMi +
                "  }";
    }

    @Override
    public void yazdir() {
        System.out.println("gazete");
    }
}
