package pl.sda.podstawyjavy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;


public class PodstawyJavy {
    public static void main(String[] args) {
        boolean podanoPoprawnaWarosc= false;
        Scanner scanner = new Scanner(System.in);
        while (podanoPoprawnaWarosc == false) {
            System.out.println("Podaj liczbę od 0-9");
            int licznikWykonan = 0;

            int liczba = scanner.nextInt();

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

}












