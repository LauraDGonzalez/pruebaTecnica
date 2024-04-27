package com.ias.practica.pruebatecnica.dominio.useCase;

import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import com.ias.practica.pruebatecnica.dominio.model.gateway.PeliculasRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class PeliculasUseCase {
    @NonNull
    private final PeliculasRepository peliculasRepository;

    public Flux<PeliculaModel> getPelis (){
        return peliculasRepository.getPeliculas();

    }
    public Mono<PeliculaModel>  getDetalles (Integer id){
        return peliculasRepository.getDetalles(id);

    }

public Mono<PeliculaModel>  postPelis (PeliculaModel peliculaModel){
        return peliculasRepository.postPeliculas(peliculaModel);

    }

}
