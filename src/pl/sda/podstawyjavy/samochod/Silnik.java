package pl.sda.podstawyjavy.samochod;

public class Silnik {
    private String poleRodzajSilnika;
    private boolean silnikDziala = false;
    private long obroty = 0;

    public Silnik(String rodzajsilnika){
        poleRodzajSilnika = rodzajsilnika;
    }

    String typSilnika(){
        return poleRodzajSilnika;
    }

    void uruchom(){
        obroty = 750;
        silnikDziala = true;
    }

    void zatrzymaj(){
        obroty = 0;
        silnikDziala = false;
    }
    boolean czySilnikDziała() {
        return silnikDziala;
    }

    void zwiekszObroty(){
        if (obroty <5000) {
            obroty = obroty + 100;
            //lub obroty += 100;
            System.out.println("zwiekszam obroty + 100");
        }

    }

    void zmniejszObroty(){
        if(obroty >100) {
            obroty = obroty - 100;
        } else {
            obroty = 0;
        }
        System.out.println("zmniejszam obroty +100 "+ obroty);

    }

}
