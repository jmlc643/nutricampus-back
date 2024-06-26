package com.upao.pe.nutricampus.controladores;

import com.upao.pe.nutricampus.serializers.rutina.CrearRutinaRequest;
import com.upao.pe.nutricampus.serializers.rutina.EditarRutinaRequest;
import com.upao.pe.nutricampus.serializers.rutina.RutinaSerializer;
import com.upao.pe.nutricampus.servicios.RutinaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rutina")
//@CrossOrigin
public class RutinaControlador {

    @Autowired private RutinaServicio rutinaServicio;

    @GetMapping("/listar/")
    public List<RutinaSerializer> listarRutinas(){
        return rutinaServicio.listarRutinas();
    }

    @PostMapping("/crear/")
    public RutinaSerializer crearRutina(@RequestBody CrearRutinaRequest request){
        return rutinaServicio.crearRutina(request);
    }

    @PutMapping("/editar/")
    public RutinaSerializer editarRutina(@RequestBody EditarRutinaRequest request){
        return rutinaServicio.editarRutina(request);
    }

    @DeleteMapping("/eliminar/")
    public List<RutinaSerializer> eliminarRutina(@RequestBody Long id){
        return rutinaServicio.eliminarRutina(id);
    }
}
