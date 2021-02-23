


package METOTLAR_DIZILERdersKodlamalari;



public class MATRISSatırStunKontrolu {

    public static void main(String[] args) {
        galeri();
    }

    public static void galeri() {
        //satırlar markalar stunlar aylar oluyor
        int satislar[][] = {
            {300, 345, 342},
            {765, 657, 652},
            {512, 125, 444},
            {845, 765, 567},
            {458, 867, 567}};
        //toplam satıslar
        int toplam = 0;
        for (int i = 0; i < satislar.length; i++) {//satırları gezer (5 de yazabilidik)
            for (int j = 0; j < satislar[0].length; j++) {//stunları gezer (3 de yazabilirdik)
                toplam += satislar[i][j];
            }
        }
        System.out.println("toplam satıs =" + toplam);

        //özetle SATIRLARIN TOPLAMINI BULUYORUZ
        //markalara göre satıslar
        int aylık[] = new int[5];
        int hesapla = 0;
        for (int i = 0; i < satislar.length; i++) {//satırları gezer (5 de yazabilidik)

            for (int j = 0; j < satislar[0].length; j++) {//stunları gezer (3 de yazabilirdik)
                hesapla += satislar[i][j];
            }
            System.out.println(i + ". markanın satıs" + hesapla);
            aylık[i] = hesapla;
            hesapla = 0;
        }

        //ÖZELTE STUNLARIN TOPLAMINI SORUYOR
        //aylara göre satıs fiyatları
        int aylikSatis = 0;
        for (int j = 0; j < satislar[0].length; j++) {//stunları gezer
            aylikSatis = 0;
            for (int i = 0; i < satislar.length; i++) {//satırları gezer 
                aylikSatis += satislar[i][j];
            }
            System.out.println(j + ". ayın satıs" + aylikSatis);

        }

        //EN BÜYÜK SATISI BULMA
        int enb = satislar[0][0];
        int enbindexsatir = 0;
        int enbindexstun = 0;
        for (int i = 0; i < satislar.length; i++) {//satırları gezer (5 de yazabilidik)
            for (int j = 0; j < satislar[0].length; j++) {//stunları gezer (3 de yazabilirdik) 
                if (satislar[i][j] > enb) {
                    enb = satislar[i][j];
                    enbindexsatir = i+1;
                    enbindexstun = j+1;
                }
            }
        }
        System.out.println("enb =" + enb);
        System.out.println("satir"+enbindexsatir);
        System.out.println("stun"+enbindexstun);
    }

}
