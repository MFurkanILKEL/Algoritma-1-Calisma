

package METOTLAR_DIZILERdersKodlamalari;

//belirli aralıklarda rastgele karakter almayı gösteriyoruz
public class rastgeleKarakterGetirme {
    public static void main(String[] args) {
        System.out.println(
        karaktergetir());
        System.out.println(
        karaktergetir2('a', 't'));
                
    }
    //a-z arasında bir karakter döndürmesini sağladık
    //ilki başlangıç değeri 'a' dan 'z' ile 'a' arasındaki sayıları çıkararak temsil ettik
    //son olarak z nin de dahil olması için +1 ekledik
    public static char karaktergetir (){
        return (char)('a'+Math.random()*('z'-'a')+1);
    }
    //gönderilen iki karakter arasından bir karakter seçilmesini sağladık
    public static char karaktergetir2 (char ch1 , char ch2){
        return (char)(ch1+Math.random()*(ch2-ch1)+1);
    }
}
