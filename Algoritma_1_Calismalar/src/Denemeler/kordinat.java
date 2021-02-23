package Denemeler;

import java.util.Scanner;
/*
               |
               |
             2 | 1
      ---------|---------
             4 | 3
               |
               |


şeklindeki kordinay sisteminin hani alanda olduğunu bulan kodu yazınız
*/
public class kordinat {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("x kordinatını giriniz");
        int x = k.nextInt();
        System.out.println("y kordinatını giriniz");
        int y = k.nextInt();
        
        if(x > 0 && y > 0){
            System.out.println("bu değerlerin sonucu birinci bölgededir");
        }
        else if(x < 0 && y > 0){
            System.out.println("bu değerlerin sonucu ikinci bölgededir");
        }
        else if(x < 0 && y < 0){
            System.out.println("bu değerlerin sonucu üçüncü bölgededir");
        }
        else if(x > 0 && y < 0){
            System.out.println("bu değerlerin sonucu dördüncü bölgededir");
        }
        else if(x == 0 && y == 0){
            System.out.println("orjin noktasındasınız");
        }
        else{
            System.out.println("hatalı bir giriş yaptınız");
        }
        
        
    }

}
