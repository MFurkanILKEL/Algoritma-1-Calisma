
package SINAV_DENEMELERI;

import java.util.Scanner;

//dizi en büyük elemanın indisini döndüren metodu yazınız
public class cıftBul {
    
    
    public static void main(String[] args) {
        int dizi[] = new int[10];
        Scanner k = new Scanner(System.in);
        System.out.println("elemanları girin");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= k.nextInt();
        }
         int sonuc = dondur(dizi);
        
        if(sonuc == -1){
            System.out.println("dizide çift sayı blunmuyor");
            
        }
        else{
            System.out.println("sonuc = "+ sonuc);
        }
       
    }
    
    public static int dondur(int dizi[]){
        
        int sonuc = -1;
        //burada önceilk elemanı atadım eğer ilk eleman 
        //tek sayı ise aşağıda kontrol ederek dizide çift sayı yoktur anlamına geliyor
        int enb=dizi[0];
        int indisi =-1;
        
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2 == 0){
                if(enb < dizi[i]){
                    enb = dizi[i];
                    indisi = i;
                }
            }
        }
        if(enb%2 != 0){
            sonuc = -1;
        }else {
            sonuc = indisi;
        }
        return sonuc;
    }
}
