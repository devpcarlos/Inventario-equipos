package com.equipos.equiposMantenimiento.servicios;

import java.util.List;

import com.equipos.equiposMantenimiento.entidades.equipos;

public interface Iequipos {

public
    List<equipos>findAall();
    public equipos save(equipos qs);
}
