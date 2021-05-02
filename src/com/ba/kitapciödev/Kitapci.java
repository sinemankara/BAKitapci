package com.ba.kitapciödev;

import java.util.Arrays;

public class Kitapci implements IKitapci{

    private Yayin[] yayinListesi = new Yayin[50];

    public Yayin[] getYayinListesi() {
        return yayinListesi;
    }


    public boolean idKontrol(int id) {
        for(int i = 0; i < yayinListesi.length; i++){
            if(yayinListesi[i]==null){
                continue;
            }
            else if(yayinListesi[i].getYayinId()==id){
                System.out.println("Bu id de kayıtlı yayın var. Lütfen farklı id giriniz!");
                return true;
            }
        }
        return false;
    }

    public void kitapciMenu(){
        System.out.println("Kitapçıya hoşgeldiniz yapabiliceğiniz işlemler aşağıda listelenmiştir.\n"
                +"1-Yayın Ekle\n"
                +"2-Yayın Sil\n"
                +"3-Listele\n"
                +"4-Id ile Yayın Ara\n"
                +"5-Adı ile Yayın Ara\n"
                +"Çıkmak için 0'a basın");
    }
    @Override
    public void yayinEkle(Yayin yayin) {
        for(int i = 0; i < yayinListesi.length; i++){
            if(yayinListesi[i] == null){
                yayinListesi[i] = yayin;
                break;
            }
        }
    }

    @Override
    public void yayinSil(int yayinId) {

        for(int i = 0; i < yayinListesi.length; i++){
            Yayin yayin = yayinListesi[i];
            if(yayin != null && yayin.getYayinId() == yayinId){
                yayinListesi[i] = null;
                System.out.println("idsi " + yayinId + "olan yayın silindi.");
            } else {
                System.out.println("Yayın bulunamadı.");
            }
        }

    }

    @Override
    public void listele() {
        for(int i = 0; i < yayinListesi.length; i++){
            if(yayinListesi[i]==null)continue;
            System.out.println((i+1) + ".yayın : " + yayinListesi[i].toString());
         /*   System.out.println((i+1) + ". yayın : yayın id :" + yayinListesi[i].getYayinId()
                    + "yayın adı :"  + yayinListesi[i].getYayinAdi()
                    + "basım yeri :" + yayinListesi[i].getBasimYeri()
                    + "fiyatı :" + yayinListesi[i].getFiyat()
                    + "yazarı :" + yayinListesi[i].getYazarlar()[i]);
        */
        }

    }

    @Override
    public void yayinAra(int yayinId) {

        for(int i = 0; i < yayinListesi.length; i++){
            Yayin yayin = yayinListesi[i];
            if(yayin != null && yayin.getYayinId() == yayinId){
                System.out.println(yayin.toString());
            }
        }
    }

    @Override
    public void yayinAra(String yayinAdi) {
        for(int i = 0; i < yayinListesi.length; i++){
            Yayin yayin = yayinListesi[i];
            if(yayin != null && yayin.getYayinAdi() == yayinAdi){
                System.out.println(yayin.toString());
            }
        }
    }



}