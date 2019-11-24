package pl.sda.podstawyjavy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class PodstawyJavy {
    public static void main(String[] args) {
        int i = 0;
        {

            System.out.println(i); // co bez zmian
            System.out.println(++i); //1 zwiekszona wartosc zanim zostal wykonany kod
            System.out.println(i);
            System.out.println(i++); //zwiekszamy wartosc o 1 ale dopiero jak sie kod wykona wiec nie widac
            System.out.println(i); // drukuje bierzaca wartosc zmiennej ktora juz zostala zmieniona przez wczesniejszy kod
        }
    }}










