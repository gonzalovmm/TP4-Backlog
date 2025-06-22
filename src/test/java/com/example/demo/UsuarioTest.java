package com.example.demo;

import com.example.demo.Entities.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testPuedeSimular_premium() {
        String nameExample = "UsuarioPremium";
        String mailExample = "premium@example.com";
        String passwordExample = "securePass123";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, true);
        assertTrue(usuario.puedeSimular());
    }

    @Test
    public void testPuedeSimular_gratis() {
        String nameExample = "UsuarioGratis";
        String mailExample = "gratis@example.com";
        String passwordExample = "123456";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        assertFalse(usuario.puedeSimular());
    }

    @Test
    public void testEmailValido_correcto() {
        String nameExample = "NombreValido";
        String mailExample = "valido@example.com";
        String passwordExample = "passValido";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        assertTrue(usuario.emailValido());
    }

    @Test
    public void testEmailValido_invalido() {
        String nameExample = "NombreInvalido";
        String mailExample = "invalido.com"; // falta @
        String passwordExample = "passInvalido";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        assertFalse(usuario.emailValido());
    }

    @Test
    public void testSetterNombre() {
        String nameExample = "Inicial";
        String mailExample = "nombre@example.com";
        String passwordExample = "cambioNombre";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        usuario.setNombre("Modificado");
        assertEquals("Modificado", usuario.getNombre());
    }

    @Test
    public void testSetterEsPremium() {
        String nameExample = "PremiumTest";
        String mailExample = "test@example.com";
        String passwordExample = "cambioPremium";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        usuario.setEsPremium(true);
        assertTrue(usuario.isEsPremium());
    }

    @Test
    public void testNombreValido_true(){
        String nameExample = "NombreValido";
        String mailExample = "test@example.com";
        String passwordExample = "cambioPremium";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        assertTrue(usuario.nombreValido(usuario));
    }
    @Test
    public void testNombreValido_false(){
        String nameExample = "nombreInvalido";
        String mailExample = "test@example.com";
        String passwordExample = "cambioPremium";
        Usuario usuario = new Usuario(nameExample, mailExample, passwordExample, false);
        assertFalse(usuario.nombreValido(usuario));
    }



}