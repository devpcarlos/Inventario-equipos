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
@Table(name="app")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class app {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "antivirus", nullable = false)
    private String antivirus;

    @Column(name = "office", nullable = false)
    private String office;

    @Column(name = "sistema_Op", nullable = false)
    private String sistema_Op;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idequip")
    private equipos equipoApp;
    
}
