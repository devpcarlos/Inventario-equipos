package com.equipos.equiposMantenimiento.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "equipo")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class equipos {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_equipo", nullable = false)
    private String nombre_equipo;

    @Column(name = "serial", nullable = false)
    private String serial;

    @Column(name = "codigo_hsd", nullable = false)
    private String codigo_hsd;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "ip", nullable = false)
    private String ip;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "equipoApp")
    private List<app> apps;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="equipoP")
    private List<perifericos> perifericos;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "equipoArea")
    private area ar;
    
}
