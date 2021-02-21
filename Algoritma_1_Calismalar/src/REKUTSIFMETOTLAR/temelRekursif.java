

package REKUTSIFMETOTLAR;

public class temelRekursif {

    //!!!ÖZETLE REKÜRSİF FOKNSİYONLARDA DİZİ İŞLEMİ YAPIYORSAN BİR İNDİSİ PARAMETRE GÖNDERMEYİ UNUTMA!!!
    public static void main(String[] args) {
        //sayiyazdir(1);
        //System.out.println(factorial(5));
        //System.out.println(fibonacci(6));

        //NOT ilk parametre küçük sayı ikinci parametre büyük sayi olmalı
        //System.out.println(aralikToplama(1, 10));
        /*int dizi[] = {2,5,7,9};
        diziYazdir(dizi, 0);
        diziTersYazdir(dizi, dizi.length-1);
         */
        /*
        int dizi1[] = {2, 5, 7, 9};
        int dizi2[] = {2, 6, 7, 4};
        ayniIndisleriBul(dizi1, dizi2, 0);
         */
        /*
        //NOT BURADA DA 0 DAN BAŞLADIĞI İÇİN SON İNDİSİ 1 EKSİK GÖNDERİYORUZ
        String metin = "Bilgisayar";
        metniTersYazdir(metin, metin.length()-1);
         */
        /* int dizi2[] = {2, 6, 7, 4};
        System.out.println(enKucukBul(dizi2, 0, dizi2.length-1));
         */
       
        
        int dizi2[] = {2, 6, 7, 4,0};
        System.out.println(binarySearch(dizi2, 0, dizi2.length-1, 0));
    }

    //sayıları 1-10 a kadar yazdırma 
    public static int sayiyazdir(int sayi) {
        if (sayi == 10) {
            return sayi;
        } else {
            System.out.println(sayi);
            return sayiyazdir(sayi + 1);
        }
    }

    public static int factorial(int sayi) {
        if (sayi == 1) {
            return sayi;
        } else {
            return sayi * factorial(sayi - 1);
        }
    }

    public static int fibonacci(int sayi) {
        if (sayi == 0) {
            return 0;
        }
        if (sayi == 1) {
            return 1;
        }
        //asıl hesaplama burada yapılıyor
        int hesap = fibonacci(sayi - 1) + fibonacci(sayi - 2);
        //sonuclar 0 ve 1 dönme islemleri bittiğinde ise sonucu döndürüyor
        return hesap;
    }

    //örneğin 1 - 10 girildiğinde 55 vermeli
    //iki sayıyının arasındaki sayıları toplayan metod
    public static int aralikToplama(int s1, int s2) {
        //burada toplama için küçük sayı büyük sayıdan büyük olduğunda aralıktaki değerler toplanmış demektir 
        if (s1 > s2) {
            return 0;
        } //burada da küçük sayı büyük sayıya eşit olana kadar küçük sayıyı arttırarak sayıya ekliyoruz
        else {
            return s1 + aralikToplama(s1 + 1, s2);
        }
    }

    //diziyi rekürsif olarak yazdıran metod
    //ilk parametre dizi ikincisi ise gezinmek için indis kullanıyoruz(baştan sona yazdırmak için index 0 verilmeli) 
    public static void diziYazdir(int s1[], int index) {

        if (s1.length != index) {
            System.out.println(s1[index]);
            diziYazdir(s1, index + 1);
        }
    }

    //yukarıdakinin aksine diziyi ters yazdırıyor
    //index (dizi boyutu-1) olarak girilmeli
    public static void diziTersYazdir(int s1[], int index) {

        if (index != -1) {
            System.out.println(s1[index]);
            diziTersYazdir(s1, index - 1);
        }
    }

    public static void ayniIndisleriBul(int s1[], int s2[], int index) {

        //sonlanmasını kontrol edebilmek için kkoşul önemli
        if (index != s1.length) {

            if (s1[index] == s2[index]) {
                System.out.println(index);
            }
//NOT TEKRARI İÇİN METODU ÇAĞIRDIĞIN NOKTAYA DİKKAT ET!!!
//BURADA KOŞUL İÇİNE KOYSAYDIK EŞİT OLMAYAN DEĞER GELDİKTEN SONRA ÇALIŞMAYI DURDURACAKTIR.
            ayniIndisleriBul(s1, s2, index + 1);
        }
    }

    public static void metniTersYazdir(String metin, int sonindex) {
        //Metni taradıktan sonra -1. indise geçtiği için sondan başa gelineceğinde indisi -1 ile kontrol ediyoruz
        if (sonindex != -1) {
            System.out.println(metin.charAt(sonindex));
            metniTersYazdir(metin, sonindex - 1);
        }
    }

    public static int enKucukBul(int s1[], int i, int n) {
        //buraada n boyutu , i ise indizimiz oluyor
        return (n == 1) ? s1[i] : Math.min(s1[i], enKucukBul(s1, i + 1, n - 1));

    }

    public static int binarySearch(int s1[], int sol, int sag, int aranan) {

        if (sag >= sol) {
            int orta = sol + (sag - sol) / 2;
            if (aranan == s1[orta]) 
                return orta;
            if (s1[orta] > aranan) 
                return binarySearch(s1, sol, orta-1, aranan);
            return binarySearch(s1, orta+1, sag, aranan);
        }
        return -1;
    }

}
