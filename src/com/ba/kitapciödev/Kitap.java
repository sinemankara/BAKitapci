package com.ba.kitapciödev;

public class Kitap extends Yayin {

    private int sayfaSayisi;
    private String kapakRengi;

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }
    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    public String getKapakRengi() {
        return kapakRengi;
    }
    public void setKapakRengi(String kapakRengi) {
        this.kapakRengi = kapakRengi;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() +
                "sayfaSayisi=" + sayfaSayisi +
                ", kapakRengi='" + kapakRengi + '\'' +
                " }";
    }

    @Override
    public void yazdir() {
        System.out.println("kitap");
    }
}
