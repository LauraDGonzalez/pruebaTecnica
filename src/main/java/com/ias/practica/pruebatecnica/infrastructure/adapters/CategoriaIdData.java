package com.ias.practica.pruebatecnica.infrastructure.adapters;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaIdData {
    private String nombre;
    private String id;
}
