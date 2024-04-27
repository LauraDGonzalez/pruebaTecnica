package com.ias.practica.pruebatecnica.infrastructure.entryPoint;

import com.ias.practica.pruebatecnica.dominio.model.Constantes;
import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeliculasResponse {

    private DataReponse data;
    private Integer status;
    private String message;


    public static PeliculasResponse toPeliculasResponse(PeliculaModel peliculaModel){
        return PeliculasResponse.builder()
                .data(DataReponse.builder()
                        .id(peliculaModel.getId())
                        .titulo(peliculaModel.getTitulo())
                        .descripcion(peliculaModel.getDescripcion())
                        .duracion(peliculaModel.getDuracion())
                        .puntuacion(peliculaModel.getPuntuacion())
                        .categoriaId(CategoriaIResponse.builder()
                                .id(peliculaModel.getCategoriaId().getId())
                                .nombre(peliculaModel.getCategoriaId().getNombre())
                                .build())
                        .build())
                .status(HttpStatus.OK.value())
                .message(Constantes.RESPUESTA)
                .build();

    }
}
