package com.equipos.equiposMantenimiento.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipos.equiposMantenimiento.entidades.equipos;
import com.equipos.equiposMantenimiento.servicios.Sequipos;

@RequestMapping("equipos")
@RestController
@CrossOrigin("http://localhost:3000")
public class Cequipos {

    @Autowired
    Sequipos sq;

    @GetMapping
    public List<equipos> getEquipos(){
        return sq.findAall();
    }

    @PostMapping
    public equipos saveequipos(@RequestBody equipos equipos){
        return sq.save(equipos);
    }
    
}
