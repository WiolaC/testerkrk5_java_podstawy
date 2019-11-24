package pl.sda.podstawyjavy.samochod;

public class UkladHamulcowy {
    private boolean ukladZablokowany = true;
    void zablokuj(){
        ukladZablokowany = true;
    }

    void odblokuj(){
       ukladZablokowany = false;
    }

    boolean stan(){
        return ukladZablokowany;
    }
}
