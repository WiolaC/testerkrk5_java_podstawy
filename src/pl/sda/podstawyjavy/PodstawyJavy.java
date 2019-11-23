package pl.sda.podstawyjavy;

public class PodstawyJavy {
    public static void main (String[]args){
        int[][] mojaTablicaInt = {{1,2,3,45},{3,4,5},{5,7,8}};

        for (int i = 0; i<mojaTablicaInt.length; i++){
            for (int j =0; j<mojaTablicaInt[i].length;j++){
                System.out.print(mojaTablicaInt[i][j]);
            }
            System.out.println();
        }


    }


    void wydrukujArgumenty(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
    }
}
