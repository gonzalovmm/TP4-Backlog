package com.example.demo.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pato {
    private String nombreComun;
    private String nombreCientifico;
    private Double tamañoPromedio;
    private Habitat region;
    private Boolean migratorio;
    private TipoVuelo tipoVuelo;
    private String plumaje;

//Metodos
    public Boolean esDeRegion(Habitat regionBuscada) {return this.region.equals(regionBuscada);}
    public Boolean tamañoEnRango(double min, double max) {return tamañoPromedio >= min && tamañoPromedio <= max;}
    public boolean esMigratorio() {return migratorio;}
    public String nombreFormatoFicha() {return nombreComun.toUpperCase() + " (" + nombreCientifico + ")";}
    public String swim(){return "Nadando...";}
    public String walk(){return "Caminando...";}
    public String fly(){return "Volando...";}
}



