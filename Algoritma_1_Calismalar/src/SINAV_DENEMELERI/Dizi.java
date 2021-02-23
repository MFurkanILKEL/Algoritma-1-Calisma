

package SINAV_DENEMELERI;

/**
dizi elemanı kendisinden sonraki  ve önceki elemanından küçükse bu sayıyı ekrana yazdıran metodu yazınız. 
 */
public class Dizi {

    public static void main(String[] args) {

        int dizi[] = {9,7,7,2,1,3,7,5,4,7,3,3,4,8,6,9};
        goster(dizi);
    }

    public static void goster(int[] dizi) {
        for (int i = 1; i < dizi.length - 1; i++) {
            if (dizi[i] <= dizi[i + 1] && dizi[i] <= dizi[i - 1]) {
                     System.out.println(dizi[i]);
            }
        }
    }

}
