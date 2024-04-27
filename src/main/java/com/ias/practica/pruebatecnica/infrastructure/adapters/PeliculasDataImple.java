package com.ias.practica.pruebatecnica.infrastructure.adapters;

import com.ias.practica.pruebatecnica.dominio.model.CategoriaId;
import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import com.ias.practica.pruebatecnica.dominio.model.gateway.PeliculasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class PeliculasDataImple implements PeliculasRepository {
    private final PeliculasDataRepository peliculasDataRepository;

    public PeliculasDataImple(PeliculasDataRepository peliculasDataRepository) {
        this.peliculasDataRepository = peliculasDataRepository;
    }


    @Override
    public Flux<PeliculaModel> getPeliculas() {
        return peliculasDataRepository.getAllBy()
                .map(resultRepository ->
                        PeliculaModel.of(
                                resultRepository.getId(),
                                resultRepository.getTitulo(),
                                resultRepository.getDescripcion(),
                                resultRepository.getDuracion(),
                                resultRepository.getPuntuacion(),
                                (CategoriaId.of(resultRepository.getCategoriaId().getNombre(),
                                        resultRepository.getCategoriaId().getId()))
                        ));
    }

    @Override
    public Mono<PeliculaModel> getDetalles(Integer id) {
        return peliculasDataRepository.getById(id)
                .map(PeliculasData::toDomain);
    }

    @Override
    public Mono<PeliculaModel> postPeliculas(PeliculaModel peliculaModel) {
        return peliculasDataRepository.save(peliculaModel)
                .map(PeliculasData::toDomain);
    }
}
