/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METOTLAR_DIZILERdersKodlamalari;

/**
 *
 * @author MFİ
 */
public class MATRISTOPLAMI {

    public static void main(String[] args) {
            int [][] a = {{2,8,5},{3,4,7}};
            int [][] b = {{6,4,2},{1,9,0}};
            int [][] c = new int[a.length][a[0].length];
            c = matrisTopla(a, b);
            goster(c);
    }

    public static int[][] matrisTopla(int a[][], int b[][]) {
        int[][] sonuc = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sonuc[i][j] = a[i][j] + b[i][j];
            }
        }
        return sonuc;
    }
    
    
        public static void goster(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
