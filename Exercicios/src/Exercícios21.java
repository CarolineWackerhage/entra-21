import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercícios21 {
    public static void main(String[] args) {



        // 21. ordenar lista decrecente

        ArrayList <Integer> lista = new ArrayList<>(Arrays.asList(59, 17 , 4, 25 ));
        Collections.sort(lista);

        for (int i = lista.size() -1 ; i >= 0; i--) {


            System.out.println(lista.get(i));

        }











    }
    }
