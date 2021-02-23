

package Calismalarim;

import java.util.Scanner;

/**
Girilen kelimenin polindrom olup olmadığını bulan kodu yazınız.
 */
public class polindromlukTspiti {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("kelimeyi girin");
        String giris = k.next();
        boolean durum = true;
        int boyut = giris.length();
        for (int i = 0; i < boyut / 2; i++) {
            if (giris.charAt(i) != giris.charAt(boyut - 1 - i)) {
                durum = false;
            }
        }
        if(durum){
            System.out.println("kelime polindromdur");
        }
        else{
            System.out.println("kelime polindrom değildir");
        }
    }
}
