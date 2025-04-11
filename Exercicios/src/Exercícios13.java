import java.util.ArrayList;
import java.util.Arrays;

public class Exercícios13 {
    public static void main(String[] args) {


        // 13. Maior e menor números

        ArrayList <Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // maior número

        int maior = 0;
            for ( int i = 0; i < lista.size(); i++) {
                if (lista.get(i) > maior) {
                    maior = lista.get(i);
                }
            }
        System.out.println(maior);

        // menor número

        ArrayList <Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int menor = 1000;
         for ( int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        System.out.println(menor);






    }
    }
