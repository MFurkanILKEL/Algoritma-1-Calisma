/*

kalvyeden girilen tam sayını sonunda kaç tane 0 olduğunu bulup ekrana yazdıran pprogramı yazınız
örn: 1050 için = 1 tane sıfır vardır 


 */
package ikibinOnAltiVizeSorulari;

import java.util.Scanner;

public class sonBasamaktakiSifirinSayisiniBulYaz {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
    
        System.out.println("sayıyı girin");
        String sayi = k.next();
        boolean bitis = true;
        //burada bir azaltmamızın nedeni java 0 dan saymaya başladığı için
        int size = sayi.length()-1;
        int sayac = 0;
        while(bitis){
            if(sayi.charAt(size) != '0'){
                bitis = false;
            }
            
            if(sayi.charAt(size) == '0'){
                sayac++;
                size--;
            }
        }
        System.out.println(sayac + "tane sıfır vardır sonunda");
            
        
    }
 
}
