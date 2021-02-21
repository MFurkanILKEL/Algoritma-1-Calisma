


package METOTLAR_DIZILERdersKodlamalari;

//overloading olayını göstermek adına yazılan kod 

public class overloadingOrnegi {
    public static void main(String[] args) {
        
        System.out.println(max(2, 3));
        System.out.println(max(7.7, 5.0));
    }
    public static double max (double sayi1 , double  sayi2){
        if(sayi1>sayi2){
            return sayi1;
        }
        else {
            return sayi2;
        }
    }
        public static int  max (int  sayi1 , int  sayi2){
        if(sayi1>sayi2){
            return sayi1;
        }
        else {
            return sayi2;
        }
    }
    
    
}
