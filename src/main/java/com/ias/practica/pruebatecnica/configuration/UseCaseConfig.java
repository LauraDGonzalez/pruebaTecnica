package com.ias.practica.pruebatecnica.configuration;

import com.ias.practica.pruebatecnica.dominio.model.gateway.PeliculasRepository;
import com.ias.practica.pruebatecnica.dominio.useCase.PeliculasUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public PeliculasUseCase beanUseCase(PeliculasRepository peliculasRepository) {
        return new PeliculasUseCase(peliculasRepository);
    }
}
