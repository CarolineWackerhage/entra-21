import java.util.ArrayList;
import java.util.Arrays;

public class Exercícios18 {
    public static void main(String[] args) {



        // 18. Remover números negativos

        int negativo = 0;
        ArrayList <Integer> lista = new ArrayList<>(Arrays.asList(1, 10, -3, -8));
            for (int i = lista.size() -1 ; i >= 0; i--) {
                if (lista.get(i) < negativo ) {
                    lista.remove(i);

                }
            }
        System.out.println(lista);











    }
    }
