package com.example.backend.Domain.Entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_centro_tour")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCentroTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoCentroTour",cascade = {CascadeType.ALL})
    private List<CentroTuristico> centroTuristicos;
}
