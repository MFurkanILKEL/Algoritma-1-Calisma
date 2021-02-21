
package SINAV_DENEMELERI;

import java.util.Scanner;


public class AlgoCalısmaSoruları {


    public static void main(String[] args) {
        
        AlgoCalısmaSoruları c = new AlgoCalısmaSoruları();
    
       // c.hesapla();
        //c.factioralWhile(4);
        //c.ustluHesapla(3, 2);
        //c.whileOrnek();
        //c.dortIslem();
        //c.negatifBul();
        //c.kareBul();
        //c.sonlandir();
        //c.Faktorial();
    }
    
    //1+4+9+...+100=?
    public void hesapla(){
        int i=0 , j=1, toplam = 0;
        while(i<100){
            
            i = i+j;
            j += 2;
            System.out.println("i" + i);
            toplam += i;
        }
        System.out.println("toplam = " +toplam );
    }
    
    //n! hesapla
    public void factioralWhile(int sayi){
        int fak=1 , i=1;
        while(i<=sayi){
            fak = fak*i;
            i++;
        }
        System.out.println(fak);
        
    }
    
    //girilen iki sayıdan birincisinin ikincisi vinsinden kuvvetini alın
    public void ustluHesapla(int a , int b){
           int sonuc=1;//hazır kütüphaneleri kullanmak yasak
        for (int i=0 ; i<b ; i++) {
            sonuc *= a;
            System.out.println(sonuc);
        }
    }
    
    //girilen sayıları toplayan ve sayı negatif olduğunda duran program
    public void whileOrnek(){
        
        int toplam = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("sayı girin");
        int sayi = k.nextInt();
        
        while(sayi>0){
            System.out.println("sayi girin");
            sayi = k.nextInt();
            toplam += sayi;
        }
        System.out.println("toplam =" +toplam);
    }
    
    //Dört işleme birer kod numarası vererek, klavyeden girilen iki sayıyı yine klavyeden girilen işlem koduna göre
    //toplayan, çıkaran, çarpan veya bölen programın 
    public void dortIslem(){
        
        Scanner k = new Scanner(System.in);
        System.out.println("ilk sayiyi girin");
        int sayi1 = k.nextInt();
        System.out.println("işlem numarasını girin 1 toplama , 2 çıkarma , 3 çarpma , 4 bölme");
        int islem = k.nextInt();
        System.out.println("ikinci sayıyı girin");
        int sayi2 = k.nextInt();
        
        int sonuc = 0;
        switch (islem){
            case 1:
                sonuc = sayi1+sayi2;
                break;
            case 2:
                if(sayi1<sayi2){
                    sonuc = sayi2-sayi1;
                }
                else{
                    sonuc = sayi1-sayi2;
                }
                break;
                
            case 3:
                sonuc = sayi1*sayi2;
                break;
                
            case 4:
                if(sayi1<sayi2){
                    sonuc = sayi2/sayi1;
                }
                else{
                    sonuc = sayi1/sayi2;
                }
                break;
                
        }
        System.out.println("sonuc = " +sonuc);
        
    }
       //Klavyeden 10 tane tamsayı girilmesini isteyen ve bu girilen tamsayılardan kaç tanesinin negatif olduğunu bulan programın 
       public void negatifBul(){
           Scanner k = new Scanner(System.in);
       
           int sayi , negatif = 0;
           for (int i = 0 ; i < 10 ; i++) {
               System.out.println("sayiyi giriniz");
               sayi = k.nextInt();
               if(sayi<0){
                   negatif++;
               }
           }
           System.out.println("negatif sayılar  = "+negatif);
       
       }
       
       //1den 25 e kadar olan sayıların kareleri toplamını bulan program
       public void kareBul(){
           int kare = 0;
           for (int i=0 ; i<25 ; i++) {
               kare = i*i;//sınavda hazır kütüphaneleri kullanmak yasak
               System.out.println(i+"nin karesi =" +kare);
               kare = 0;
           }
       }
       
       
       // Klavyeden ardı ardına sayı girişi isteyen ve bu sayı 10 ile 15 arasında olmadığı sürece bu işleme devam eden program
       public void sonlandir(){
         Scanner k = new Scanner(System.in);
         
           System.out.println("sayi giriniz");
         int sayi = k .nextInt();
         while(sayi>15 || sayi<10){
             System.out.println("sayi giriniz");
             sayi = k.nextInt();
         }
         
       }
       
       //Klavyeden girilen 1-25 arasındaki bir tamsayının faktöriyelini alan programın algoritma 
       public void Faktorial(){
           
           Scanner k = new Scanner(System.in);
           System.out.println("sayiyi girin");
           int sayi = k.nextInt();
           
           if(sayi<25 || 1>sayi ){
               int fak = 1;
               for (int i=1 ; i<=sayi ; i++) {
                   fak = fak*i;
               }
               System.out.println("faktöriyeli=" +fak);
           }
           else{
               System.out.println("sayi 1-25 arsasında değil tekrar deneyin");
           }
       }
       
}
