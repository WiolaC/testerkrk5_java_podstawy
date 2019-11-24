package pl.sda.podstawyjavy;

import pl.sda.podstawyjavy.samochod.Samochod;
import pl.sda.podstawyjavy.samochod.SamochodCiezarowy;

public class PodstawyJavy {
    public static void main(String[] args) {
        Samochod bmw = new Samochod("benzynowy", "e60",
                "BMW","czarny");
        Samochod fiat = new Samochod("diesiel","Yaris",
                "Toyota","srebrny");

        SamochodCiezarowy volvo = new SamochodCiezarowy("diesiel","xxx",
                "volvo","srebrny");

        volvo.doczepPrzyczepe();
        volvo.jedz();
        volvo.jedz();

        bmw.jedz();
        fiat.jedz();
        bmw.jedz();
        fiat.jedz();
        bmw.jedz();
        volvo.stoj(); //dopisac metode zwracajaca stan przyczepy
        volvo.odczepPrzyczepe();
        //System.out.println(bmw.modelIMarka()); //1 sposob
        System.out.println(bmw.modelIMarka() +" "+ bmw.stanLicznika()+" km"); //2 sposob

        System.out.println(fiat.modelIMarka() + " "+ fiat.stanLicznika()+" km");

        System.out.println(volvo.modelIMarka()+ " " + volvo.stanLicznika()+" km");
    }


}












