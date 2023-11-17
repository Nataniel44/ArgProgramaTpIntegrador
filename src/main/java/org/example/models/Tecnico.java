package org.example.models;


import java.util.ArrayList;
import java.util.List;

public class Tecnico {

    private String nombre;
    private List<Especialidad> especialidadades;

    public Tecnico(String nombre) {
        this.nombre = nombre;
        this.especialidadades = new ArrayList<>();

    }
}
