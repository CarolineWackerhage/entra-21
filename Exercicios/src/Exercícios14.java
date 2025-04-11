import java.util.ArrayList;
import java.util.Arrays;

public class Exercícios14 {
    public static void main(String[] args) {


        //14. Pares de um array

        ArrayList <Integer> lista = new ArrayList<>(Arrays.asList(1, 10, 3, 16, 38, 5));

        int QuantPares = 0;

            for ( int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 == 0) {
                    QuantPares++;

                }
            }
        System.out.println(QuantPares);






    }
    }
