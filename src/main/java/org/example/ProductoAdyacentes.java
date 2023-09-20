package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ProductoAdyacentes {

    public static List<Integer> generarLista() {
        Random rand = new Random();
        int longitud = rand.nextInt(19) + 2;
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < longitud; i++) {
            int valor = rand.nextInt(2001) - 1000;
            lista.add(valor);
        }

        return lista;
    }



}