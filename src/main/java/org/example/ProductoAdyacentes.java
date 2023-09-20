package org.example;
import java.util.Random;

public class ProductoAdyacentes {
    public static int productoAdyacentes(int[] arreglo) {

        int maximo = -1000000;
        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i] * arreglo[i+1] >= maximo) {
                maximo = arreglo[i] * arreglo[i+1];
            }
        }
        return maximo;
    }

        public static boolean comprobacionDimension(int n) throws IllegalArgumentException{
            if(18>=n && n>=0){
                return true;
            }else{
                throw new IllegalArgumentException("Ingresa un largo valido para el arreglo de ");
            }
        }
        public static boolean entradas_arreglo(int[] arreglo) {
            for(int i=0; i<arreglo.length; i++){
                if(arreglo[i]<-1000 || arreglo[i]>1000){
                    throw new IllegalArgumentException("Se ha detectado un valor invalido para el arreglo de productos de adyacentes");
                }


            }

        } return

        public static int[] crer_arreglo(int n) {
            Random r = new Random();
            int length= new Random().nextInt(n)+2 ;
            int [] arreglo = new int[length] ;
            for (int i = 0; i < length; i++) {
                arreglo[i] = r.nextInt(2000)-1000;
            }
            return arreglo;
        }



    public static void main(String[] args) {
    }
}