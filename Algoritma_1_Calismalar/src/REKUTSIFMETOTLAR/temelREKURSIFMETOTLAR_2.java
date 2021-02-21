


package REKUTSIFMETOTLAR;




public class temelREKURSIFMETOTLAR_2 {

    public static void main(String[] args) {

        //System.out.println(basamkSayisiBul(-245));
        //System.out.println(ikilikTabanaDonustur(10));
        //20 dk kaldı
        /*String mein = "denemeler";
        System.out.println(tekrarEdenSayisiBul(mein, 'e', 0));
         */
    }

    public static int basamkSayisiBul(int n) {
        if (n < 10 && n > -10) {
            return 1;
        } else {
            return 1 + basamkSayisiBul(n / 10);
        }
    }

    static String strbinary = "";

    public static String ikilikTabanaDonustur(int sayi) {

        if (sayi < 2) {
            strbinary += sayi;
            return strbinary;
        } else {//sayıyı ikiye bölerek önce 1 veya 0 olup olmadığını kontrol ettik 
            //eğer değilse de ikiye modunu alıp kalanı metin olarak ekledik.
            ikilikTabanaDonustur(sayi / 2);
            strbinary += sayi % 2;
        }

        return strbinary;
    }

    public static int tekrarEdenSayisiBul(String metin, char karakter, int i) {
        if (i >= metin.length()) {
            return 0;
        }
        int count = 0;
        if (metin.charAt(i) == karakter) {
            count++;
        }
        return count + tekrarEdenSayisiBul(metin, karakter, i + 1);
    }

}
