package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main (String[]args){
       char[][] mojaTablica = {
               {'H','e','l','l','o'},
               {' ', 'W','o','r','l','d'}
       };

       for (int i = 0; i < mojaTablica.length; i++){
           System.out.print(mojaTablica[i]);
       }

    }
    //wywołanie metody

    void wydrukujArgumenty(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
    }
}
