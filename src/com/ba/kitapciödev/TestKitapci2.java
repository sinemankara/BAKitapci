package com.ba.kitapciödev;

import java.util.Scanner;

public class TestKitapci2 {
    static Scanner input = new Scanner(System.in);
    static Kitapci kitapci= new Kitapci();


    public static void main(String[] args) {

        Yayin yayin = null;
        while (true) {
            kitapci.kitapciMenu();
            System.out.println("Yapmak istediğiniz işlemi seçiniz :");
            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("hangi tipte yayın eklenecek? ");
                   // input.nextLine();
                    String yayinTuru = input.next();
                    if (yayinTuru.equalsIgnoreCase("Kitap")) {
                        yayin = new Kitap();
                    } else if (yayinTuru.equalsIgnoreCase("Dergi")) {
                        yayin = new Dergi();
                    } else if (yayinTuru.equalsIgnoreCase("Gazete")) {
                        yayin = new Gazete();
                    } else {
                        System.out.println("Lütfen geçerli bi tür giriniz.");
                        continue;
                    }
                    yayinBilgileriniAl(yayin);
                    yayin.setYayinTuru(yayinTuru);
                    kitapci.yayinEkle(yayin);
                    break;
                case 2:
                    System.out.println("lütfen silmek istediğiniz yayının idsini giriniz :");
                    int yayinId = input.nextInt();
                    if (kitapci.yayinSil(yayinId)) {
                        System.out.println("idsi " + yayinId + "olan yayın silindi.");
                    } else {
                        System.out.println("Yayın bulunamadı.");
                    }
                    break;
                case 3:
                    System.out.println("Yayınlar listeleniyor : ");
                    kitapci.listele();
                    break;
                case 4:
                    System.out.println("aramak istediğiniz yayın için idsini giriniz : ");
                    int id = input.nextInt();
                    kitapci.yayinAra(id);
                    break;
                case 5:
                    System.out.println("aramak istediğiniz yayın için adını giriniz : ");
                    int adi = input.nextInt();
                    kitapci.yayinAra(adi);
                    break;
                case 6:
                    System.out.println("Kitapçıdan çıkılıyor...");
                    break;
            }
        }
    }


    private static void yayinBilgileriniAl(Yayin yayin) {

        System.out.println("Lütfen yayın id giriniz :");
        int id = input.nextInt();
          if (kitapci.idKontrol(id)) {
              id = input.nextInt();
          }
        System.out.println("yayın adı gidiniz : ");
        input.nextLine();
        String adı = input.nextLine();
        System.out.println("yazar adı giriniz :");
        String yazarAdi = input.nextLine();
        System.out.println("basım yeri giriniz :");
        String basimYeri = input.nextLine();
        System.out.println("fiyat giriniz :");
        double fiyat = input.nextDouble();
        yayin.setYayinId(id);
        yayin.setYayinAdi(adı);
        yayin.setYazarlar(yazarAdi.split(","));
        yayin.setBasimYeri(basimYeri);
        yayin.setFiyat(fiyat);
        if (yayin instanceof Kitap) {
            System.out.println("kapak rengi giriniz :");
            input.nextLine();
            String rengi = input.nextLine();
            System.out.println("sayfa sayısı giriniz :");
            int sayfaSayisi = input.nextInt();
            ((Kitap) yayin).setKapakRengi(rengi);
            ((Kitap) yayin).setSayfaSayisi(sayfaSayisi);
        } else if (yayin instanceof Dergi) {
            System.out.println("dergi aylık mı basılıyor ?");
            input.nextLine();
            boolean aylikMi = input.nextLine().equalsIgnoreCase("evet");
            ((Dergi) yayin).setAylikMi(aylikMi);
        } else if (yayin instanceof Gazete) {
            System.out.println("Gazetenin bulmaca eki var mı ?");
            input.nextLine();
            boolean bulmacaEkiVarMi = input.nextLine().equalsIgnoreCase("evet");
            ((Gazete) yayin).setBulmacaEkiVarMi(bulmacaEkiVarMi);
        }

    }


}

