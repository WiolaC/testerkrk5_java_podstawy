package pl.sda.podstawyjavy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

//ZCZYTYWANIE CZEGOS CO PODA UZYTKOWNIK NP ROK URODZENIA
public class PodstawyJavy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int licznikWykonan= 0;
        int yearOfBirth = -1;
        while (yearOfBirth <  2019 && licznikWykonan < 9) {
            System.out.println((licznikWykonan + 1) + ".Proszę, podaj rok urodzenia:");

            yearOfBirth = scanner.nextInt();
            String powitanie = (yearOfBirth == 1980) ?
                    "Urodziłeś się w 1980 - Brawo!"
                    : "Urodziles sie w "+ yearOfBirth + " roku naszej ery";
            System.out.println(powitanie);
            licznikWykonan++;


        }
    }
}











