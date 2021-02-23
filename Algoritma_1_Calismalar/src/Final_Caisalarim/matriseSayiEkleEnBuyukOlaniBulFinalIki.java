/*

kalvyeden girilen sayıları iki boyutlu 4x3 boyutundaki sayısal diziye atan ve 
bu iki boyutlu sayısal dizinin içindeki en büyük sayının en büyük hangisi olduğunu
ve hangi satır ve stunda bulunduğunu ekrana yazan programı yazınız

 */
package Final_Caisalarim;

import java.util.Arrays;
import java.util.Scanner;



public class matriseSayiEkleEnBuyukOlaniBulFinalIki {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int dizi[][] = new int[4][3]; //satır:stun olarak giriliyor
//burada stunları tarayarak satırları geziyormuşuz DİKKAT ET
        for (int i = 0; i < 4; i++) {//satır gezmek için
            for (int j = 0; j < 3; j++) {//stun gezmek için
                System.out.println("sayı girin");
                int sayi = k.nextInt();
                dizi[i][j] = sayi;
            }
        }
        int enb = dizi[0][0];
        int enk = dizi[0][0];
        //indislerini tutuyoruym matrisi gezerken enb ve enk sayılarının ama başlangıç olarak ilk eleman oldupundan 0 atadım
        //matrislerde ilki satır ikinci parametresi ise stun olarak geçiyor 
        int enkstr = 0 , enkstun = 0;
        int enbstr = 0 , enbstun = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if(dizi[i][j] <= enk){
                    enk = dizi[i][j];
                    enkstr = i;
                    enkstun = j;
                }
                if(dizi[i][j] >= enb){
                    enb = dizi[i][j];
                    enbstr = i;
                    enbstun = j;
                    
                }
            }
        }
        System.out.println("javada 0 dan başladığı için en büyük sayı:" + enb + "satır:" + enbstr + "stun:" + enbstun);
         System.out.println("javada 0 dan başladığı için en büyük sayı:" + enk + "satır:" + enkstr + "stun:" + enkstun);
    }
}
