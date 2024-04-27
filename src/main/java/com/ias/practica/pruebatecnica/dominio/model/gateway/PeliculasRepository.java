package com.ias.practica.pruebatecnica.dominio.model.gateway;

import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PeliculasRepository {

    Flux<PeliculaModel> getPeliculas ();
    Mono<PeliculaModel> getDetalles(Integer id);
    Mono<PeliculaModel> postPeliculas(PeliculaModel peliculaModel);

}
