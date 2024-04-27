package com.ias.practica.pruebatecnica.infrastructure.entryPoint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaIResponse {
    private String nombre;
    private String id;
}
