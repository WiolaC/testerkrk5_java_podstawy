package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main(String[] args) {
        KomunikatyDlaLiczb komunikatyDlaLiczb = new KomunikatyDlaLiczb();
        komunikatyDlaLiczb.przyjmijLIczbe();
        System.out.println("Poprawnie wprowadzona wartosc to: " + komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

        komunikatyDlaLiczb.ustawWartoscZmiennejLIczba(105);
        System.out.println(komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());

        komunikatyDlaLiczb.ustawWartoscZmiennejLIczba(3);
        System.out.println(komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());
        komunikatyDlaLiczb.ustawWartosciZmiennejLiczba(500,76,10,6,3);
        System.out.println(komunikatyDlaLiczb.pobierzOstatniaWartoscLiczby());
    }

}












