package com.ba.kitapciödev;

public interface IKitapci {
    public void yayinEkle(Yayin yayin);
    public boolean yayinSil(int yayinId);
    public void listele();
    public void yayinAra(int yayinId);
    public void  yayinAra(String yayinId);


}
