/*
SORU
klavyeden girilen sayıları sayılar girildiği andan ihtibaren küçükten büyüğe doğru sıralayıp
ekrana yazan ve girilen sayı -999 ise duran programı yazınız. Sadece main metodu yeterlidir.

 */
package Final_Caisalarim;

import java.util.Scanner;

//ki bu durumda verileri bir diziden baska yerde tutamam
//bu kısmı dizi sıralamasını gördükten sontra kodlayacağım
//sıralama kısmını tamamladıktan sonra giriş yapan sayıyı 
public class girilenSayılarıSıralayarakYazdır_999DaDurFinalUc {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int dizi[] = new int[100];
        System.out.println("sayıyı giriniz");
        int giris = k.nextInt();
        int temp , size = 0;
        while(giris != -999){
            dizi[size] = giris;
            size ++;
            //diziyi sıralıyorum
            for (int i = 0; i < dizi.length-2; i++) {
                for (int j = i+1; j < dizi.length-1; j++) {
                    if(dizi[i] > dizi[i+1]){
                        temp = dizi[i];
                        dizi[i] = dizi[i+1];
                        dizi[i+1] = temp;
                    }   
                }
            }
            //diziyi yazdırıyorum
            for (int i = 0; i < dizi.length; i++) {
                if(dizi[i] != 0){
                System.out.print(dizi[i] +",");
                }
            }
            //yeni girisi alarak while nin kontrolünü yapıyorum
            System.out.println("sayıyı giriniz");
            giris = k.nextInt();
        }
        
        
    }
}
