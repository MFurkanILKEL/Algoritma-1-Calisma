/*


klavyedeen 10 elemanlı iki diziye sayılar giriliyor . bu dizilerin 
aynı indislerindeki sayıalrı karşılaştırarak büyük olan
b dizisine küçük olanı a dizisine yazan programı kodlayınız.
örn: a[3,5,23,6,7,8,59,5,8,34]
     b[6,2,3,5,6,1,2,23,64] sonuçta 

     a[3,2,3,5,6,1,2,5,8,34]
     b[6,5,23,6,7,8,59,23,64] haline gelmelidir

 */
package ikibinOnAltiVizeSorulari;

import java.util.Scanner;


public class diziIndislerindekiDegerleriBuyukKucukOlarakAta {
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        
       int a[] = new int[10];
       int b[] = new int[10];
       
       int aEkle ;
       int bEkle ;
        for (int i = 0; i < 10; i++) {
           aEkle = k.nextInt();
           a[i] = aEkle;
        }
        
        for (int i = 0; i < 10; i++) {
           bEkle = k.nextInt();
           b[i] = bEkle;
        }
        int temp;
        for (int i = 0; i < 10; i++) {
            if(a[i] >= b[i]){
                temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i] +" a vs b " + b[i]);
        }
       
        
    }
}
