package com.upao.pe.nutricampus.serializers.usuario;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioSerializer {
    private String nombreUsuario;
    private int edad;
    private double peso;
    private double talla;
    private char genero;
    private char nivelActividad;
    private double meta;
    private char velocidadEjercicio;
}
