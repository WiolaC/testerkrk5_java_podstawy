package pl.sda.podstawyjavy;

import pl.sda.podstawyjavy.samochod.Samochod;

public class PodstawyJavy {
    public static void main(String[] args) {
        Samochod bmw = new Samochod("benzynowy", "e60",
                "BMW","czarny");
        Samochod fiat = new Samochod("diesiel","Yaris",
                "Toyota","srebrny");

        bmw.jedz();
        fiat.jedz();
        bmw.jedz();
        fiat.jedz();
        bmw.jedz();
        //System.out.println(bmw.modelIMarka()); //1 sposob
        System.out.println(bmw.modelIMarka() +" "+ bmw.stanLicznika()+" km"); //2 sposob

        System.out.println(fiat.modelIMarka() + " "+ fiat.stanLicznika()+" km");
    }


}












