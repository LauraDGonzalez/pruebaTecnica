package com.ias.practica.pruebatecnica.dominio.model;

public class CategoriaId {
    private String nombre;
    private String id;

    private CategoriaId(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    public static CategoriaId of(String nombre, String id){
        return new CategoriaId(nombre, id);
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}
