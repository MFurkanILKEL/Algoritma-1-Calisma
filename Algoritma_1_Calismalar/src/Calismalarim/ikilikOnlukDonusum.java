package Calismalarim;

import java.util.Scanner;

//onluk tabandan ikilik tabana dönüştüren kod parçasını yazınız
public class ikilikOnlukDonusum {

    public static void main(String[] args) {
        //ONLUKTAN İKİLİE DÜNÜSÜM KODU
           Scanner k = new Scanner(System.in);
        //sonucu stringe dönüştürüp stringe de depolayaabilirdim ama direkt diziye aratarak depoladım
        int dizi[] = new int[50];
        System.out.println("sayıyı onluk olarak grin");
        int onluk = k.nextInt();
        int i = 0;
        //ikiye modunu alıp kaydederek int ile ikiye bölüyorum ki tekssayının yarısında küçük sayıya yuvarlaması için
        //örnek olarak 11/2 =5 alıyor
        while (onluk > 0) {

            dizi[i] = onluk % 2;
            onluk = onluk / 2;
            i++;
        }
        //indis 0 dan başladığı için dizinin son elemenı dizi uzunluğu-1 oluyor
        for (int j = dizi.length-1; j>=0; j--) {
            System.out.print(dizi[j]);
        }
         



    }

}
