package com.equipos.equiposMantenimiento.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "perifericos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class perifericos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", length = 12,nullable = false)
    private String nombre;

    @Column(name = "referencia", length =15, nullable = false)
    private String referencia;

    @Column(name = "fuente",length = 20,nullable = false)
    private String fuente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idequipo")
    private equipos equipoP;

    
}