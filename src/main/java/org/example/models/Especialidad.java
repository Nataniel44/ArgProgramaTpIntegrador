package org.example.models;

public class Especialidad {
    private String nombre;

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Especialidad setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
