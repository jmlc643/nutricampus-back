package com.upao.pe.nutricampus.serializers.usuario;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ObtenerUsuarioRequest {
    private String token;
}
