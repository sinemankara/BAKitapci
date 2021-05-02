package com.ba.kitapciödev;

import java.util.ArrayList;
import java.util.List;


    public class KitapciArrayList implements IKitapci{

        // private Yayin[] yayinListesi = new Yayin[50];
        List<Yayin> yayinListesi;
        public List<Yayin> getYayinListesi() {
            return yayinListesi;
        }


        public KitapciArrayList(){
            yayinListesi = new ArrayList<Yayin>();
        }

        public boolean idKontrol(int id) {
            for(int i = 0; i < yayinListesi.size(); i++){
                if(yayinListesi.get(i)!=null && yayinListesi.get(i).getYayinId()==id){
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

            yayinListesi.add(yayin);

        }

        @Override
        public void yayinSil(int yayinId) {
            Yayin silinecekYayin=null;
            for (Yayin yayin : yayinListesi) {
                if(yayin.getYayinId() == yayinId){
                    silinecekYayin = yayin;
                    break;
                }
            }

            if (silinecekYayin!=null) {
                yayinListesi.remove(silinecekYayin);
                System.out.println("idsi " + yayinId + "olan yayın silindi.");
            } else {
                System.out.println("Yayın bulunamadı.");
            }

        }

        @Override
        public void listele() {
            for (Yayin yayin : yayinListesi) {
                System.out.println(yayin.toString()); //sistem out içersinde nesne default olarak tostring çağırır.
            }


        }

        @Override
        public void yayinAra(int yayinId) {
            for (Yayin yayin : yayinListesi) {
                if(yayin.getYayinId() == yayinId){
                    System.out.println(yayin.toString());
                }
            }
        }

        @Override
        public void yayinAra(String yayinAdi) {
            for (Yayin yayin : yayinListesi) {
                if(yayin.getYayinAdi() == yayinAdi){
                    System.out.println(yayin.toString());
                }
            }
        }



    }

