package com.ias.practica.pruebatecnica.infrastructure.entryPoint;

import com.ias.practica.pruebatecnica.dominio.model.CategoriaId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataReponse {
    private Integer id;
    private String titulo;
    private String descripcion;
    private Integer duracion;
    private Integer puntuacion;
    private CategoriaIResponse categoriaId;

}


