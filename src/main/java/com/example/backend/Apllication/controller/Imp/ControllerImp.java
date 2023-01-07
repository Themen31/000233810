package com.example.backend.Apllication.controller.Imp;

import com.example.backend.Apllication.controller.Controller;
import com.example.backend.Domain.Entities.CentroTuristico;
import com.example.backend.Domain.Entities.TipoCentroTour;
import com.example.backend.Domain.service.OfertaService;
import com.example.backend.Domain.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerImp implements Controller {
    private final UsuarioService usuarioService;
    private final OfertaService ofertaService;

    public ControllerImp(UsuarioService usuarioService, OfertaService ofertaService) {
        this.usuarioService = usuarioService;
        this.ofertaService = ofertaService;
    }

    @Override
    public ResponseEntity<List<TipoCentroTour>> getAllTipos() {
        List<TipoCentroTour> tipoCentroTours = usuarioService.findAllOrders();
        return new ResponseEntity<List<TipoCentroTour>>(tipoCentroTours, HttpStatus.OK);
    }
    @Override
    public ResponseEntity<List<CentroTuristico>> getAllOfertas() {
        List<CentroTuristico> usuarios = ofertaService.findAllOferta();
        return new ResponseEntity<List<CentroTuristico>>(usuarios, HttpStatus.OK);
    }
    @Override
    public ResponseEntity<CentroTuristico> createCentroTour(@RequestBody CentroTuristico centroTuristico) {
        CentroTuristico usuarioNew = ofertaService.createOferta(centroTuristico);
        return new ResponseEntity<CentroTuristico>(usuarioNew, HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<List<CentroTuristico>> getAllTourbyTipo(@PathVariable("id") Integer id) {
        List<CentroTuristico> usuarios = ofertaService.findByTipo(id);
        return new ResponseEntity<List<CentroTuristico>>(usuarios, HttpStatus.OK);
    }
}
