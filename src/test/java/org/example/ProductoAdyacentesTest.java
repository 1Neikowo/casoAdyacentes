package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class ProductoAdyacentesTest {


    @Test
    //Prueba que la función productoAdyacentes retorne el valor correcto
    public void testProductoAdyacentesCasoDePrueba() {
    int[] arreglo = {1, -4, 2, 2, 5, -1};

    assertEquals(10, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    //Prueba si se lanza una excepción cuando se crea un arreglo con un tamaño mayor a 20
    public void testProductoAdyacentesExcepcionLargoMayorA20() {
        int[] arreglo = new int[21]; // Crear un arreglo con una longitud mayor a 20
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.productoAdyacentes(arreglo));
    }


    @Test
    // Comprueba si se lanza una excepción cuando se crea un arreglo con un tamaño menor a 2
    public void testProductoAdyacentesExcepcion() {
        int[] arreglo = {1};
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    //Prueba si se lanza una excepción cuando se crea un arreglo con un tamaño negativo
    public void testCrearArregloExcepcion() {
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.crearArreglo(-1));
    }



    @Test
    //Prueba si la función validarArreglo retorna true cuando el arreglo tiene un tamaño entre 2 y 20
    public void testValidarArreglo() {
        int[] arreglo = {1, 2, 3};
        assertTrue(ProductoAdyacentes.validarArreglo(arreglo));
    }




}

