package com.ias.practica.pruebatecnica.infrastructure.adapters;

import com.ias.practica.pruebatecnica.dominio.model.CategoriaId;
import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeliculasData {

    private Integer id;
    private String titulo;
    private String descripcion;
    private Integer duracion;
    private Integer puntuacion;
    private CategoriaIdData categoriaId;


    public static PeliculaModel toDomain(PeliculasData peliculasData) {
        var categoriaId = CategoriaId.of(peliculasData.getCategoriaId().getNombre(), peliculasData.getCategoriaId().getId());
        return PeliculaModel.of(peliculasData.getId(), peliculasData.getTitulo(),
                peliculasData.getDescripcion(), peliculasData.getDuracion(), peliculasData.getPuntuacion(), categoriaId);

    }
}
