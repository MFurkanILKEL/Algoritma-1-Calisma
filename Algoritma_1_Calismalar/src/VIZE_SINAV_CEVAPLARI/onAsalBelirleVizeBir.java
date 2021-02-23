
/* kalvyeden girilen rastgele sayılar içinden asal olan sayıları bulup ekrana yazan ve ekrana yazılan asal sayısı 
10 olduğunda duran programı çalışır şekilde oluşturunuz . Not tüm tanımlamalar içinde olacak şekilde verilecektir
 */
package VIZE_SINAV_CEVAPLARI;

import java.util.Scanner;

public class onAsalBelirleVizeBir {

    public static void main(String[] args) {
        int asalsay = 0;

        Scanner k = new Scanner(System.in);
        int bolunensay = 0;
        while (asalsay != 10) {
            System.out.println("sayıyı giriniz");
            int sayi = k.nextInt();
            if (sayi > 2) {
                bolunensay = 0;
                for (int i = 2; i < sayi; i++) {

                    if (sayi % i == 0) {
                        System.out.println(sayi % i);
                        bolunensay++;
                    }
                }
                if (bolunensay == 0) {
                    asalsay++;
                    System.out.println(sayi);
                    System.out.println("asalsayıdır");
                    System.out.println(asalsay);
                }
            } else {
                if (sayi == 1 || sayi == 2) {
                    asalsay++;
                    System.out.println("sayı asaldır");
                    System.out.println(asalsay);
                }
                if (sayi <= 0) {
                    System.out.println("sayı asal olamaz");
                }

            }
        }
    }
}
