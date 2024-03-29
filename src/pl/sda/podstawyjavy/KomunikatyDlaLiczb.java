package pl.sda.podstawyjavy;

import java.util.Scanner;

public class KomunikatyDlaLiczb {
    private int liczba = -1; //zmienna z metody zdefiniowana w klasie

    void przyjmijLIczbe(){  //zaczyna sie metoda
        boolean podanoPoprawnaWarosc= false;
        Scanner scanner = new Scanner(System.in);
        while (podanoPoprawnaWarosc == false) {
            System.out.println("Podaj liczbę od 0-9");
            int licznikWykonan = 0;

            liczba = scanner.nextInt(); //java wie ze chodzi nam o zmienna zdefiniowana na poziomie klasy
            if (liczba >= 0 && liczba <= 9) {
                podanoPoprawnaWarosc= true;
                if (liczba == 3) {
                    System.out.println("Dzień dobry");
                } else if (liczba == 5) {
                    System.out.println("Dobranoc");
                } else {
                    System.out.println("Standardowa wiadomość");
                }
            } else {
                System.out.println("Podana wartość jest nieprawidłowa");
            }

        }
    }

    int pobierzOstatniaWartoscLiczby (){
        return liczba;
    }
    void ustawWartoscZmiennejLIczba(int nowaWartoscLiczby) {
        if (nowaWartoscLiczby >= 0 && nowaWartoscLiczby <= 9) {
            liczba = nowaWartoscLiczby;
        } else {
            System.out.println("Nowa wartość jest nieprawidłowa");
        }
    }
    void ustawWartosciZmiennejLiczba(int...liczby){
        for (int argument: liczby){
            if (argument >= 0 && argument <= 9){
                liczba = argument;
                break;
            }
        }
    }
}
