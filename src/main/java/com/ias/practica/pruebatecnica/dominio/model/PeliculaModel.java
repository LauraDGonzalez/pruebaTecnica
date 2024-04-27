package com.ias.practica.pruebatecnica.dominio.model;

import com.ias.practica.pruebatecnica.infrastructure.adapters.CategoriaIdData;
import com.ias.practica.pruebatecnica.infrastructure.adapters.PeliculasData;

public class PeliculaModel {

    private Integer id;
    private String titulo;
    private String descripcion;
    private Integer duracion;
    private Integer puntuacion;
    private CategoriaId categoriaId;


    private PeliculaModel(Integer id, String titulo, String descripcion, Integer duracion, Integer puntuacion, CategoriaId categoriaId) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.puntuacion = puntuacion;
        this.categoriaId = categoriaId;
    }

    public static PeliculaModel of(Integer id, String titulo, String descripcion, Integer duracion, Integer puntuacion, CategoriaId categoriaId) {
        return new PeliculaModel(id, titulo, descripcion, duracion, puntuacion, categoriaId);

    }

    public static PeliculasData fromDomain(PeliculaModel peliculaModel) {
        var categoriaId = CategoriaIdData.builder()
                .nombre(peliculaModel.getCategoriaId().getNombre())
                .id(peliculaModel.getCategoriaId().getId())
                .build();
       return  PeliculasData.builder()
                .id(peliculaModel.getId())
                .titulo(peliculaModel.getTitulo())
                .descripcion(peliculaModel.getDescripcion())
                .duracion(peliculaModel.getDuracion())
                .puntuacion(peliculaModel.getPuntuacion())
                .categoriaId(categoriaId)
                .build();

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public Integer getDuracion() {
        return duracion;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Integer getId() {
        return id;
    }

}
