package com.equipos.equiposMantenimiento.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "area")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class area {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "area", length = 15, nullable = false)
    private String are;

    @Column(name = "responseble", length = 20, nullable = false)
    private String responsable;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idequi")
    private equipos equipoArea;
    
}
