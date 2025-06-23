package com.example.demo;

import com.example.demo.Entities.Habitat;
import com.example.demo.Entities.Pato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PatoTest {

    //Comprobación de métodos
    @Test
    void existeClasePato() {
        Pato pato = new Pato();
        assertNotNull(pato);
    }
    @Test
    void existeSwim(){
        Pato pato = new Pato();
        pato.swim();
    }
    @Test
    void existeWalk(){
        Pato pato = new Pato();
        pato.walk();
    }

    @Test
    void existeFly() {
        Pato pato = new Pato();
        String nada = pato.fly();
    }
    
    //Chequeo de retornos
    @Test
    void valorSwim(){
        Pato pato = new Pato();
        String nada = pato.swim();
        rama-nueva
        assertEquals("Nadando...", nada);
    }
    
    @Test
    void valorWalk(){
        Pato pato = new Pato();
        String nada = pato.walk();
        assertEquals(nada, "Caminando...");
    }

    @Test
    void valorFly(){
        Pato pato = new Pato();
        String nada = pato.fly();
        assertEquals(nada, "Volando...");
    }


    @Test
    public void testEsDeRegion_true() {
        Pato pato = new Pato();
        pato.setRegion(Habitat.Ríos);

        assertTrue(pato.esDeRegion(Habitat.Ríos));
    }
    @Test
    public void testEsDeRegion_false() {
        Pato pato = new Pato();
        pato.setRegion(Habitat.Ciénagas);

        assertFalse(pato.esDeRegion(Habitat.Ríos));
    }
    @Test
    public void testTamañoEnRango_true() {
        Pato pato = new Pato();
        pato.setTamañoPromedio(55.0);

        assertTrue(pato.tamañoEnRango(50, 60));
    }
    @Test
    public void testTamañoEnRango_false() {
        Pato pato = new Pato();
        pato.setTamañoPromedio(45.0);

        assertFalse(pato.tamañoEnRango(50, 60));
    }
    @Test
    public void testEsMigratorio_true() {
        Pato pato = new Pato();
        pato.setMigratorio(true);

        assertTrue(pato.esMigratorio());
    }
    @Test
    public void testEsMigratorio_false() {
        Pato pato = new Pato();
        pato.setMigratorio(false);

        assertFalse(pato.esMigratorio());
    }

    @Test
    public void testNombreFormatoFicha() {
        Pato pato = new Pato();
        pato.setNombreComun("Maicero");
        pato.setNombreCientifico("Anas georgica");
        String resultado = pato.nombreFormatoFicha();
        assertEquals("MAICERO (Anas georgica)", resultado);
    }


    @Test
    void testSetterNombreComun(){
        Pato pato = new Pato();
        pato.setNombreComun("Overo");
        assertEquals("Overo", pato.getNombreComun());
    }

    @Test
    void testSetterTamañoPromedio(){
        Pato pato = new Pato();
        pato.setTamañoPromedio(61.5);
        assertEquals(61.5, pato.getTamañoPromedio());
    }


}
