package SINAV_DENEMELERI;


//içerisinde bulunan aaa dizesini sayan uygulamayı rekürsif olarak yazınız
// örnek olarak aaaacvaaa içi 2 döndürmeli
public class rekursif {

    public static void main(String[] args) {
        System.out.println(dondur("aaayazaaaaaaaa", 0, 0));
    }

    public static int dondur(String isim, int i, int tmp) {
        if (isim.length()-2 != i) {
            if (isim.charAt(i) == 'a') {
                if (isim.charAt(i + 1) == 'a') {
                    if (isim.charAt(i + 2) == 'a') {

                        tmp = tmp + 1;
                    }
                }
            }
            return dondur(isim, i + 3, tmp);
        }
        return tmp;
    }
}
