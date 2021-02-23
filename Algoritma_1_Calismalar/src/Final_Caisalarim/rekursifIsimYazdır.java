


package Final_Caisalarim;


public class rekursifIsimYazdır {
    public static void main(String[] args) {
       // yazdir("mfi", 5);
        System.out.println(dondur("aib12s^'%", 0, ""));
    }
    //not burada değeri göderirken ++ değil de +1 olarak yaz
    public static void yazdir(String isim , int yazilacak){
        if(0 != yazilacak){
            System.out.println(isim);
            yazdir(isim, yazilacak-1);
        }
    }
    
    
    public static String dondur(String isim , int i , String tmp){
        if(isim.length() != i){
            if(!Character.isLetter(isim.charAt(i))){
                tmp += isim.charAt(i);
            }
            return dondur(isim, i+1, tmp);
        }
        return tmp;
    }
}
