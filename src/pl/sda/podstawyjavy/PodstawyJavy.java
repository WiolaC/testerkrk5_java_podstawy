package pl.sda.podstawyjavy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

//ZCZYTYWANIE CZEGOS CO PODA UZYTKOWNIK NP ROK URODZENIA
public class PodstawyJavy {
    public static void main(String[] args) {
        for (int i= 0; i< 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proszę, podaj rok urodzenia:");

            int yearOfBirth = scanner.nextInt();
            String powitanie = (yearOfBirth == 1980) ?
                    "Urodziłeś się w 1980"
                    : "Nie urodziłeś się w 1980";
            System.out.println(powitanie);

        }

    }
}











