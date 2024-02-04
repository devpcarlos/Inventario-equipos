package com.equipos.equiposMantenimiento.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.equipos.equiposMantenimiento.entidades.equipos;
import com.equipos.equiposMantenimiento.repositorios.Requipos;

@Service
public class Sequipos implements Iequipos{
 
    @Autowired
    Requipos re;


    @Override
    public List<equipos> findAall() {
      return re.findAll();
    }

    @Override
    public equipos save(equipos q) {
       return re.save(q);
    }

    
 
}
