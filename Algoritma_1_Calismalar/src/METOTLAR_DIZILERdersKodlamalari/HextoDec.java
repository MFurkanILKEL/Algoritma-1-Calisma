

package METOTLAR_DIZILERdersKodlamalari;


//hex sayıyı decimal sayıya çeviren program
public class HextoDec {
    
    public static void main(String[] args) {
        HextoDec d = new HextoDec();
        
        System.out.println(d.donustur("A1"));
    }
    public int donustur(String hex){
        
        int taban = 1;
        int desimaldeger = 0 ;
        
        for(int i = hex.length()-1 ; i >=0 ; i--) {
           char hexChar = hex.charAt(i);
           desimaldeger = desimaldeger+taban*hexCharToDec(hexChar);
           taban = taban*16;
            }
        return desimaldeger;
    }
    
    //harf veya sayının değerini döndürüyoruz burada
    public int hexCharToDec(char ch){
        
        if(ch >= 'A'&& ch <= 'F'){
            return 10+ch-'A';
        }
        else{
            return ch-'0';
        }
    }
}
