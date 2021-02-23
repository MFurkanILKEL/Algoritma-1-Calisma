/*
klavyeden girilecek olan ondalıklı bir sayıyı aşağıdaki gibi yazdıran programı yazınız.
örneğin 2.13578 girilmişse 87531.2 yazdıracaktır.
*/
package VIZE_SINAV_CEVAPLARI;


//eğer metin olarak alırsak dönüştürme işlemi yapmadan aynı fonksiyonlar ile kodlayabiliriz

import java.util.Scanner;


public class girilenDoublesSayıyıTersCevirVizeDört {
    
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        double sayi = k.nextDouble();
        //sayı - string dönüsümü için  https://medium.com/gokhanyavas/javada-tip-d%C3%B6n%C3%BC%C5%9F%C3%BCmleri-ve-string-i%CC%87fadeler-4d5457497c78
        //bulabilirsin
        String sayYaz = Double.toString(sayi);
        String tersAl = "" ;
        int sayac = sayYaz.length()-1;
        for(int i = 0 ; i < sayYaz.length() ; i++) {
            tersAl += sayYaz.charAt(sayac);
            sayac --;
        }
        System.out.println(tersAl);
        
        
    }
    
    
}
