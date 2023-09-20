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
    public static int productoAdyacentes(int[] lista) {
        int maximo = -1000000;
        for (int i = 0; i < lista.length-1; i++) {
            if (lista[i] * lista[i+1] > maximo) {
                maximo = lista[i] * lista[i+1];
            }
        }
        return maximo;
    }

    public static void imprimirMaximo(int maximo){
        System.out.println("El maximo producto adyacente es "maximo ".");
    }
}