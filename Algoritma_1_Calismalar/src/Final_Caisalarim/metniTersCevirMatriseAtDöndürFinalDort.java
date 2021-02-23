/*

kendisine parametre olarak gelen 20 tane stringi her bir stringi kendi içinde ters çevirip
5x4 şeklinde iki boyutlu matris içine yerleştiren be oluşan bu iki boyutlu string matrisini geri döndüren
methodu yazınız . Not sadece methodu yazınız

 */
package Final_Caisalarim;

import java.util.Scanner;

public class metniTersCevirMatriseAtDöndürFinalDort {

    public static void main(String[] args) {

        metniTersCevirMatriseAtDöndürFinalDort f = new metniTersCevirMatriseAtDöndürFinalDort();
        f.cevir();

    }

    public String[][] cevir() {
        Scanner k = new Scanner(System.in);
        String dizi[][] = new String[5][4];
        String cevir = "";
        int sayac ;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("metin girin");
                String metin = k.next();
                cevir = "";
                sayac = metin.length();
                //burada sayaç kullanmam olayı çözdü metodu unutma
                for (int l = 0; l < metin.length(); l++) {
                    cevir += metin.charAt(sayac-1);
                    sayac --;
                }
                
                dizi[i][j] = cevir;
            }
            
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(dizi[i][j]);
            }
        }
        return dizi;
    }

}
