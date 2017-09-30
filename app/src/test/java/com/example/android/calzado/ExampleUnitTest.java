package com.example.android.calzado;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void hombre_zapatilla_nike_correcto() {
        assertEquals(120000, Metodos.calcular(1,0,0,1),0);
    }
    @Test
    public void hombre_zapatilla_nike_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(1,0,0,1),0);
    }
    @Test
    public void hombre_zapatilla_adidas_correcto() {
        assertEquals(140000, Metodos.calcular(1,0,1,1),0);
    }
    @Test
    public void hombre_zapatilla_adidas_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(1,0,1,1),0);
    }
    @Test
    public void hombre_zapatilla_puma_correcto() {
        assertEquals(130000, Metodos.calcular(1,0,2,1),0);
    }
    @Test
    public void hombre_zapatilla_puma_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(1,0,2,1),0);
    }


    @Test
    public void hombre_clasico_nike_correcto() {
        assertEquals(50000, Metodos.calcular(1,1,0,1),0);
    }
    @Test
    public void hombre_clasico_nike_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(1,1,0,1),0);
    }
    @Test
    public void hombre_clasico_adidas_correcto() {
        assertEquals(80000, Metodos.calcular(1,1,1,1),0);
    }
    @Test
    public void hombre_clasico_adidas_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(1,1,1,1),0);
    }
    @Test
    public void hombre_clasico_puma_correcto() {
        assertEquals(100000, Metodos.calcular(1,1,2,1),0);
    }
    @Test
    public void hombre_clasico_puma_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(1,1,2,1),0);
    }

    @Test
    public void mujer_zapatilla_nike_correcto() {
        assertEquals(100000, Metodos.calcular(0,0,0,1),0);
    }
    @Test
    public void mujer_zapatilla_nike_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(0,0,0,1),0);
    }
    @Test
    public void mujer_zapatilla_adidas_correcto() {
        assertEquals(130000, Metodos.calcular(0,0,1,1),0);
    }
    @Test
    public void mujer_zapatilla_adidas_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(0,0,1,1),0);
    }
    @Test
    public void mujer_zapatilla_puma_correcto() {
        assertEquals(110000, Metodos.calcular(0,0,2,1),0);
    }
    @Test
    public void mujer_zapatilla_puma_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(0,0,2,1),0);
    }

    @Test
    public void mujer_clasico_nike_correcto() {
        assertEquals(60000, Metodos.calcular(0,1,0,1),0);
    }
    @Test
    public void mujer_clasico_nike_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(0,1,0,1),0);
    }
    @Test
    public void mujer_clasico_adidas_correcto() {
        assertEquals(70000, Metodos.calcular(0,1,1,1),0);
    }
    @Test
    public void mujer_clasico_adidas_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(0,1,1,1),0);
    }
    @Test
    public void mujer_clasico_puma_correcto() {
        assertEquals(120000, Metodos.calcular(0,1,2,1),0);
    }
    @Test
    public void mujer_clasico_puma_incorrecto() {
        assertNotEquals(200000, Metodos.calcular(0,1,2,1),0);
    }

    @Test
    public void validar_cantidad_correcta(){
        assertTrue(Metodos.validarCantidad(0));
    }
    @Test
    public void validar_cantidad_incorrecta(){
        assertFalse(Metodos.validarCantidad(1));
    }



}