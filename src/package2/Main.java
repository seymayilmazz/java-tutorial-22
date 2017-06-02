package package2;

import java.util.ArrayList;

/**
 * Created by Şeyma Yılmaz on 2.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> isimListesi = new ArrayList<>();
        isimListesi.add("Şeyma Yılmaz");
        isimListesi.add("Burak Köken");
        isimListesi.add("Berkan Yılmaz");

        for(String isim : isimListesi){
            System.out.println("kisi ismi : " + isim);
        }

        System.out.println("isim sayisi : " + isimListesi.size());
        System.out.println();

        if(isimListesi.contains("Şeyma Yılmaz")){
            System.out.println("listede var");
        }
        else{
            System.out.println("listede yok");
        }

        isimListesi.remove("Berkan Yılmaz");
        System.out.println("isim sayisi : " + isimListesi.size());

    }

}
