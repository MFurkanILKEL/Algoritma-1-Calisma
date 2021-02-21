/*
klavyeden girilecek olan stringi aşağıdaki gibi ekrana yazan programı yazınız
sadece main metodunu yazınız . örneğin "kitap" için;
k
ii
ttt
aaaa
ppppp
 */
package VIZE_SINAV_CEVAPLARI;

import java.util.Scanner;

public class kelimeyiTekrarlayarakYazdırVizeÜç {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("kelimeyi giriniz");
        String kelime = k.next();
        int sayac = 0;

        for (int i = 0; i < kelime.length(); i++) {
            sayac++;
            System.out.println();
            for (int j = 0; j < sayac; j++) {
                System.out.print(kelime.charAt(i));
            }

        }
    }
}
