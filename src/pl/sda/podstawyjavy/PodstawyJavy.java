package pl.sda.podstawyjavy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class PodstawyJavy {
    public static void main(String[] args) {
        int yearOfBirth =1980;
        if(yearOfBirth < 1980){
            System.out.println("Rok poniżej 1980");
        }
        else if (yearOfBirth > 1990){
            System.out.println("Rok powyżej 1990");
        }
        else {
            System.out.println("Rok pomiedzy 1980 a 1990");
        }


    }
}











