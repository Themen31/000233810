package com.example.backend.Implements.repository.ImpJPA;

import com.example.backend.Domain.Entities.CentroTuristico;
import com.example.backend.Domain.Repository.CentroTuristicoRepository;
import com.example.backend.Implements.repository.OfertaRepositoryJPA;
import com.example.backend.controller.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CentroTuristicoRepositoryJPAImp implements CentroTuristicoRepository {

    private final OfertaRepositoryJPA db;

    public CentroTuristicoRepositoryJPAImp(OfertaRepositoryJPA db) {
        this.db = db;
    }

    @Override
    public CentroTuristico save(CentroTuristico centroTuristico) {
        return db.save(centroTuristico);
    }



    @Override
    public List<CentroTuristico> getByTipo(Integer tipo) {
        return db.getBytipo(tipo);
    }

    @Override
    public CentroTuristico getbyId(Integer id) {
        return db.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("No Existe el comprador: "+id));
    }

    @Override
    public List<CentroTuristico> getAll() {
        return db.findAll();
    }

    @Override
    public void delete(Integer id) {
        db.deleteById(id);
    }
}
