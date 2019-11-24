package pl.sda.podstawyjavy.samochod;

public class Samochod {
    private Silnik silnik;
    private UkladHamulcowy ukladHamulcowy = new UkladHamulcowy();
    private int licznikKilometrow = 0;
    private String model;     //this model to odwolanie do pola klasy
    private String marka;
    private String kolor;

    public Samochod(String typSilnika, String model, String marka, String kolor){
        silnik = new Silnik (typSilnika);
        this.model = model;
        this.marka = marka;
        this.kolor = kolor;
    }
    public void jedz(){
        ukladHamulcowy.odblokuj();
        silnik.uruchom();
        silnik.zwiekszObroty();
        licznikKilometrow++;


    }

    public void stoj(){
        silnik.zatrzymaj();
        ukladHamulcowy.zablokuj();
    }

    public String modelIMarka (){
        return marka + " "+ model;

    }

    public int stanLicznika(){
        return licznikKilometrow;
    }
    public String pobierzKolor(){
        return kolor;
    }
}
