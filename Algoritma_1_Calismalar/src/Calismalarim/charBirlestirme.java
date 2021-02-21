/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calismalarim;

import java.util.Scanner;

/**
 *
 * @author MFİ
 */
public class charBirlestirme {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        char dizi[]={'a','b','c'};
        String metin = "";
        for (int i = 0; i < dizi.length; i++) {
            metin += dizi[i];
        }
    
        System.out.println(metin);
    }
    
}
