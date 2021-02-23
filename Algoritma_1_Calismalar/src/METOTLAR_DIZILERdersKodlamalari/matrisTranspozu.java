package METOTLAR_DIZILERdersKodlamalari;


//bir matrisin traspozunu alan kodu yazdık
public class matrisTranspozu {

    public static void main(String[] args) {
        int dizi[][] = new int[3][3];
    
     dizi[0][0]=5;
     dizi[0][1]=6;
     dizi[0][2]=7;
     dizi[1][0]=8;
     dizi[1][1]=9;
     dizi[1][2]=0;
     dizi[2][0]=1;
     dizi[2][1]=2;
     dizi[2][2]=3;
        
        göster(dizi);
        System.out.println("sonuç");
        göster(transpozal(dizi));
    }

    public static int[][] transpozal(int matris[][]) {
        int olusum[][] = new int[matris.length][matris[0].length];

        for (int i = 0; i < matris.length; i++) {//satır geziyor
            for (int j = 0; j < matris[0].length; j++) {//stun geziyor [0]ile gösterilebiliyor 
                olusum[j][i] = matris[i][j];
            }
        }
        return olusum;
    }
    public static void göster(int matris[][]) {
        int olusum[][] = new int[matris.length][matris[0].length];

        for (int i = 0; i < matris.length; i++) {
            System.out.println("");
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]);
            }
        }
    }
}
