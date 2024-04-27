package com.ias.practica.pruebatecnica.infrastructure.entryPoint;

import com.ias.practica.pruebatecnica.dominio.model.Constantes;
import com.ias.practica.pruebatecnica.dominio.model.PeliculaModel;
import com.ias.practica.pruebatecnica.dominio.useCase.PeliculasUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(Constantes.PATH)
public class PeliculasController {

    public final PeliculasUseCase peliculasUseCase;

    public PeliculasController(PeliculasUseCase peliculasUseCase) {
        this.peliculasUseCase = peliculasUseCase;
    }

    @GetMapping(Constantes.ID)
    public Flux<DataReponse> getPelis() {
//       return  peliculasUseCase.getPelis();
        return null;
    }

    @GetMapping(Constantes.DETALLES)
    public Mono<PeliculasResponse> getDetalles(Integer id) {
        return peliculasUseCase.getDetalles(id)
                .map(PeliculasResponse::toPeliculasResponse);
    }

    @PostMapping(Constantes.ALMACENAR)
    public Mono<DataReponse> postPelis(PeliculaModel peliculaModel) {
//  return peliculasUseCase.postPelis(peliculaModel);
        return null;


    }
}

