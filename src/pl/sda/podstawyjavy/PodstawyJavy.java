package pl.sda.podstawyjavy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class PodstawyJavy {
    public static void main(String[] args) {
        int yearOfBirth =1980;
        String powitanie = (yearOfBirth == 1980) ?
                "Urodziłeś się w 1980"
                : "Nie urodziłeś się w 1980";
        System.out.println(powitanie);


    }
}











