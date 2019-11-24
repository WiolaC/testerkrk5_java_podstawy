package pl.sda.podstawyjavy.samochod;

public class SamochodCiezarowy extends Samochod{
    boolean czyPrzyczepaZapieta = false;

    public SamochodCiezarowy (String typSilnika, String model, String marka, String kolor) {
        super(typSilnika, model, marka, kolor);
    }//klasa ktora nazywa sie samciez ktory robi to samo co samochod

    public void doczepPrzyczepe(){
        czyPrzyczepaZapieta = true;
    }

    public void odczepPrzyczepe(){
        czyPrzyczepaZapieta = false;
    }
}
