package com.example.backend.Apllication.controller;

import com.example.backend.Domain.Entities.CentroTuristico;
import com.example.backend.Domain.Entities.TipoCentroTour;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("")
public interface Controller  {
    @GetMapping("Tipos")
    public ResponseEntity<List<TipoCentroTour>> getAllTipos();
    @GetMapping("CentroTour")
    public ResponseEntity<List<CentroTuristico>> getAllOfertas();
    @PostMapping("CentroTour")
    public ResponseEntity<CentroTuristico> createCentroTour(@RequestBody CentroTuristico centroTuristico);
    @GetMapping("CentroTour/tipo/{id}")
    public ResponseEntity<List<CentroTuristico>> getAllTourbyTipo(@PathVariable("id") Integer id);
}
