/*

kendisine parakmetre olarak gelen iki boyutlu string dizisi içindeki 
en uzun ve en kısa karakterlere sahip iki stringi bulup geri döndüren 
java metodunu yazınız. Not sadece method yazınız
 */
package Final_Caisalarim;

import java.util.Scanner;

public class matrisEnbEnkElemanlarıBulDondurFinalBir {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        String dene[] = new String[2];
        String dizi[][] = new String[3][3];
        matrisEnbEnkElemanlarıBulDondurFinalBir f = new matrisEnbEnkElemanlarıBulDondurFinalBir();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("öetin girin");
                String giris = k.next();
                dizi[i][j] = giris;
            
            }
        }
        f.bul(dizi, 3, 3);


    }

    public String[] bul(String dizi[][], int a, int b) {
        //dizinin ilk elemanklarnı diziye atadım ardından gelenleri karşılaştıracağım
        int sayac, enb = dizi[0][0].length(), enk = dizi[0][0].length();
        //dizi içeriklerini de tutmak için tanımladım ve dizinin ilk elemanını sayısı gibi içeriğini de bu değişkenlere atadım
        String enkMetin = dizi[0][0], enbMetin = dizi[0][0];
        
        String dondur[] = new String[2];
 
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (dizi[i][j].length() <= enk) {
                    enk = dizi[i][j].length();
                    enkMetin = dizi[i][j];
                }
                if (dizi[i][j].length() >= enb) {
                    enb = dizi[i][j].length();
                    enbMetin = dizi[i][j];
                
                }

            }
        }
        
        dondur[0] = enkMetin;
        dondur[1] = enbMetin;
        System.out.println("cevaplar");
        System.out.println(dondur[0]);
        System.out.println(dondur[1]);
        return dondur;
    }
}
