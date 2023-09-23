package org.example;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class ProductoAdyacentesTest {

    @Test
    //Prueba si se lanza una excepción cuando se crea un arreglo con un tamaño negativo
    public void testCrearArregloExcepcion() {
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.crearArreglo(-1));
    }

    //Prueba si se lanza una excepcion cuando se crea un arreglo con un rango mayor
    @Test
    public void testValidarValoresExcepcion() {
        int[] arreglo = {101, -1002};
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.validarValores(arreglo));
    }

    // Verifica si la función validarArreglo retorna true cuando el arreglo tiene un tamaño entre 2 y 20
    @Test
    public void testValidarArreglo() {
        int[] arreglo = {1, 2, 3};
        assertTrue(ProductoAdyacentes.validarArreglo(arreglo));
    }

    // Comprueba si se lanza una excepción cuando se crea un arreglo con un tamaño menor a 2
    @Test
    public void testProductoAdyacentesExcepcion() {
        int[] arreglo = {1};
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.productoAdyacentes(arreglo));
    }
}
