package com.ba.kitapciödev;

import java.util.Arrays;

public abstract class Yayin {
    private  String yayinTuru;
    private int yayinId;
    private String yayinAdi;
    private double fiyat;
    private String yazarlar[];
    private String basimYeri;

    @Override
    public String toString() {
        return  "yayın Türü :" + yayinTuru +
                ", yayin Id :" + yayinId +
                ", yayin Adi :'" + yayinAdi + '\'' +
                ", fiyat :" + fiyat +
                ", yazarlar :" + Arrays.toString(yazarlar) +
                ", basimYeri :'" + basimYeri + '\'' + '\n';
    }

    public String getYayinTuru() {
        return yayinTuru;
    }

    public void setYayinTuru(String yayinTuru) {
        this.yayinTuru = yayinTuru;
    }

    public int getYayinId() {
        return yayinId;
    }

    public void setYayinId(int yayinId) {
        this.yayinId = yayinId;
    }

    public String getYayinAdi() {
        return yayinAdi;
    }

    public void setYayinAdi(String yayinAdi) {
        this.yayinAdi = yayinAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String[] getYazarlar() {
        return yazarlar;
    }

    public void setYazarlar(String[] yazarlar) {
        this.yazarlar = yazarlar;
    }

    public String getBasimYeri() {
        return basimYeri;
    }

    public void setBasimYeri(String basimYeri) {
        this.basimYeri = basimYeri;
    }

    public abstract void yazdir();
}
