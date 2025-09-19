package com.example.demo.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private boolean esPremium;

    //Métodos
    public boolean puedeSimular() {return esPremium;}
    private booleano
    public boolean emailValido() {return email != null && email.contains("@");}
    public boolean nombreValido(Usuario usuario){
        String nombre = usuario.getNombre();
        if (nombre == null || nombre.isEmpty()) {
            return false;
        }
        char primeraLetra = nombre.charAt(0);
        return Character.isUpperCase(primeraLetra);
    }
}


