package com.example.backend.Implements.repository;

import com.example.backend.Domain.Entities.CentroTuristico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfertaRepositoryJPA extends JpaRepository <CentroTuristico,Integer> {

    @Query("SELECT o FROM CentroTuristico o WHERE o.tipoCentroTour.id=:id")
    public List<CentroTuristico> getBytipo(@Param("id") Integer id);

}
