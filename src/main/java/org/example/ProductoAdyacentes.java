package org.example;


public class ProductoAdyacentes {

    public static void main(String[] args) {
        int[] arreglo = {1, -4 , 2, 2 , 5 ,-1};
        System.out.println(productoAdyacentes(arreglo));
    }
    public static int productoAdyacentes(int[] arreglo) {
        int maximo = -1000000;
        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i] * arreglo[i+1] > maximo) {
                maximo = arreglo[i] * arreglo[i+1];
            }
        }
        return maximo;
    }
}