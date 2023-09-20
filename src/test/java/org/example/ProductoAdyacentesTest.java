package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {
    @BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void productoAdyacentes() {

        int[] array = {1000,-1000};
        int[] array2 = ProductoAdyacentes.crearArreglo(0);
        int[] array3 = ProductoAdyacentes.crearArreglo(21);
        int[] array4 ={0,0,0,0};
        assertEquals(-1000000,ProductoAdyacentes.productoAdyacentes(array));
        assertThrows(IndexOutOfBoundsException.class , () -> ProductoAdyacentes.productoAdyacentes(array2));
        assertThrows(IndexOutOfBoundsException.class, () -> ProductoAdyacentes.productoAdyacentes(array3));
        assertEquals(0,ProductoAdyacentes.productoAdyacentes(array4));
    }
}