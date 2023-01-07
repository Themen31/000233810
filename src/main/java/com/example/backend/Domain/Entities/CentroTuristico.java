package com.example.backend.Domain.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "centros_turisticos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CentroTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float  tarifaIngreso;
    private String distanciaCentro;
    @ManyToOne
    @JoinColumn( name = "tipo_tour", foreignKey = @ForeignKey(name = "FK_tipo_tour_centro_turistico"),nullable = false)
    TipoCentroTour tipoCentroTour;
}
