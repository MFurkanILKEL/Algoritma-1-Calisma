package METOTLAR_DIZILERdersKodlamalari;

//en az 8 karakter olmalı
//en az 1 harf ve 1 sayı olmalı
//en az 1 küçük harf ve 1 büyük harf olmalı

//kurallarını içeren bir kotnrol kodu yazıldı
public class sifreKontrolEdenKod {

    public static void main(String[] args) {
        sifreKontrolEdenKod s = new sifreKontrolEdenKod();
        System.out.println(s.sifregecermi("Dene23"));
    }

    public static boolean sifregecermi(String s) {

        boolean sifredurum = true;

        if (s.length() < 8) {
            System.out.println("en az 8 karakter olmalı");
            sifredurum = false;
        }
        int rakamsay = 0, harfsay = 0, buyukharf = 0, kucukharf = 0;

        for (int i = 0; i < s.length(); i++) {
            //işaret vs girişi yapılmaması gerekliliği kontroıl ediliyor
            if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                System.out.println("sifre harf ve rakam içermeli");
                sifredurum = false;
            }
            //harf ise
            if (Character.isLetter(s.charAt(i))) {
                harfsay++;

                if (Character.isUpperCase(s.charAt(i))) {
                    buyukharf++;
                }
                if (Character.isLowerCase(s.charAt(i))) {
                    kucukharf++;
                }
            }
            //sayı ise
            if (Character.isDigit(s.charAt(i))) {
                rakamsay++;
            }
        }

        if (harfsay == 0) {
            System.out.println("en az bir harf içerlemli");
            sifredurum = false;
        }
        if (rakamsay == 0) {
            System.out.println("en az bir sayı içerlemli");
            sifredurum = false;
        }
        if (buyukharf == 0) {
            System.out.println("en az bir büyük harf içerlemli");
            sifredurum = false;
        }
        if (kucukharf == 0) {
            System.out.println("en az bir kucuk harf içerlemli");
            sifredurum = false;
        }
        return sifredurum;
    }

}
