package org.example;


public class ProductoAdyacentes {

    public static void main(String[] args) {
        int[] arreglo = crearArreglo(2);
        int[] arreglo2 = {101,-1002};
        System.out.println(productoAdyacentes(arreglo));
        System.out.println(productoAdyacentes(arreglo2));
    }
    public static int[] crearArreglo(int n) {
        if (n >= 0){
            int[] arreglo = new int[n];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int) (Math.random() * 2001 - 1000);
            }
            return arreglo;
        }else {
            throw new IndexOutOfBoundsException("El arreglo debe tener entre 2 y 20 elementos");
        }
    }
    public static boolean validarValores(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]<-1000 || arreglo[i]>1000){
                throw new IndexOutOfBoundsException("El arreglo debe tener valores que no sean menores a -1000 y mayores a 1000");
            }
        }return true;
    }
    public static boolean validarArreglo(int[] arreglo) {
        if (arreglo.length >=2 && arreglo.length<=20){
            return true;
        }else{
            return false;
        }
    }
    public static int productoAdyacentes(int[] arreglo) {
        int maximo = -1000000;
        if (validarArreglo(arreglo) && validarValores(arreglo)) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] * arreglo[i + 1] > maximo) {
                    maximo = arreglo[i] * arreglo[i + 1];
                }
            }
            return maximo;
        }else {
            throw new IndexOutOfBoundsException("El arreglo debe tener entre 2 y 20 elementos");
        }
    }
}
