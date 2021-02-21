package SINAV_DENEMELERI;

import java.util.Scanner;

//20 basamablı iki sayıyının farkını bulan kodu yazınız. (Note ilk sayı ikinci sayıdan büyük olduğnu varsayınız)
public class soru1 {

    public static void main(String[] args) {

        int dizi1[] = new int[5];
        int dizi2[] = new int[5];
        int sonuc[] = new int[5];
        Scanner k = new Scanner(System.in);

        System.out.println("ilk sayıyı giriniz");
        for (int i = 0; i < dizi1.length; i++) {
            dizi1[i] = k.nextInt();
        }
        
        System.out.println("ikinci sayıyı giriniz");
        for (int i = 0; i < dizi2.length; i++) {
            dizi2[i] = k.nextInt();
        }
        

        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] - dizi2[i] < 0) {

                dizi1[i] = dizi1[i] + 10;
                dizi1[i-1] = dizi1[i-1] - 1;
                sonuc[i] = dizi1[i] - dizi2[i];
            } else {
                sonuc[i] = dizi1[i] - dizi2[i];
            }
        }
        System.out.println("sonuc");
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println(sonuc[i]);
        }
    }
}
