package com.ias.practica.pruebatecnica.infrastructure.adapters;

import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PeliculasDataRepository extends ReactiveMongoRepository<PeliculasData, Integer> {
    Flux<PeliculasData> getAllBy();
    Mono<PeliculasData> getById(Integer id); // Todo buscar por detalle
    Mono<PeliculasData> save(PeliculaModel peliculaMode);

}


