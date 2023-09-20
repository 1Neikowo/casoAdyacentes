package org.example;
import java.util.Random;

public class ProductoAdyacentes {



        public static int[] crer_arreglo() {
            Random r = new Random();
            int length= new Random().nextInt(18)+2 ;
            int [] arreglo = new int[length] ;
            for (int i = 0; i < length; i++) {
                arreglo[i] = r.nextInt(2000)-1000;
            }
            return arreglo;
        }


    public static void main(String[] args) {
    }
}