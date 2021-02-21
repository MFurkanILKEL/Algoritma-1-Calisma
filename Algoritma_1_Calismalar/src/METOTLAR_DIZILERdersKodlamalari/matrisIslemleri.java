package METOTLAR_DIZILERdersKodlamalari;

import java.util.Scanner;

public class matrisIslemleri {

    public static void main(String[] args) {
        //tersyaz();
        //sayıAra();
        //kelimeAtaDiziye();
        //metinsorgula();
        
        //System.out.println(ustAl(2, 3));
        //System.out.println(fak(4));
        karelertoplamı();
    
    }
    //verilen diziyi tersten yazdıran program 

    public static void tersyaz() {

        String dizi[] = {"ali", "veli", "tuna", "tavus"};
        //indis 0 dan absladğı için uzunluğunun 1 eksiğinden başlatıyoruz
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.println(dizi[i]);
        }
    }

    //girilen sayıyı dizide arar
    public static void sayıAra() {
        Scanner k = new Scanner(System.in);
        int giris = 2;
        boolean sonuc = false;
        int dizi[] = {1, 5, 3, 46, 2, 6, 2, 76, 23,};
        //indis 0 dan absladğı için uzunluğunun 1 eksiğinden başlatıyoruz
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == giris) {
                sonuc = true;
            }
        }
        System.out.println(sonuc);
    }

    //bir metni dizide arayarak sonucu bolean türünde gösteriyopruz 
    //burada döndürmedim sadece gösterdim ama çalışıyor
    public static void metinsorgula() {

        String dizi[] = {"ali", "veli", "tuna", "tavus"};
        Scanner k = new Scanner(System.in);
        String giris = "ali";
        boolean sonuc = false;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].equals(giris)) {
                sonuc = true;
            }
        }
        System.out.println(sonuc);
    }
    //her kelimeyi idiziye atan program

    public static void kelimeAtaDiziye() {
        String kelime = "Bilgisayar";
        int boyut = kelime.length();
        char dizi[] = new char[boyut];

        for (int i = 0; i < boyut; i++) {
            dizi[i] = kelime.charAt(i);
        }
        for (int i = 0; i < boyut; i++) {
            System.out.println(dizi[i]);
        }
    }
    //bir sayının faktöriyel değerini hesaplıyor
    public static int fak(int sayi){
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }
    //üst alır
    public static int ustAl(int taban , int ust){
        int sonuc = 1;
        for (int i = 1; i <= ust; i++) {
            sonuc = sonuc * taban;
        }
        return sonuc;
    }
    
    public static void karelertoplamı(){
        int dizi [] = new int[10];
        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=i;
        }
        int toplam = 0;
        for (int i = 1; i < dizi.length; i++) {
            toplam += dizi[i]*dizi[i];
        }
        System.out.println(toplam);
    }
    
}
