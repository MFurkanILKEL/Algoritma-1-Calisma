/*
 klavyeden girilen isimler içinden ilk karakteri 'A' vey 'a' olannları bulup tek boyutlu string dizisine
atan metodu yazınız. Not toplam 20 adet string oluşturulacaktır . sadece main metodu yeterlidir.
 */
package VIZE_SINAV_CEVAPLARI;

import java.util.Scanner;

public class aABulDiziyeAtaVizeİki {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String isimler[] = new String[20];
        int isimSay = 0;

        while (isimSay != 20) {
            System.out.println("isim giriniz");
            //String isim = k.next();  de yazılabilir o <zaman sadece string alır aşağıdaki gibi olursa sayı da alabiliyor(metin olarak alıyor ama)
            String isim = k.nextLine();
            if (isim.charAt(0) == 'a' || isim.charAt(0) == 'A') {
                System.out.println(isim);
                isimler[isimSay] = isim;
                isimSay++;
                System.out.println(isimSay);
            }

        }
        //kontrol için
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }

    }
}
