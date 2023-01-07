package com.example.backend.Domain.service.Imp;

import com.example.backend.Domain.Entities.CentroTuristico;
import com.example.backend.Domain.Entities.TipoCentroTour;
import com.example.backend.Domain.Repository.CentroTuristicoRepository;
import com.example.backend.Domain.Repository.TipoCentroTourRepository;
import com.example.backend.Domain.service.OfertaService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OfertaServiceImp implements OfertaService {
    private final CentroTuristicoRepository centroTuristicoRepository;

    private final TipoCentroTourRepository tipoCentroTourRepository;

    public OfertaServiceImp(CentroTuristicoRepository centroTuristicoRepository, TipoCentroTourRepository tipoCentroTourRepository) {
        this.centroTuristicoRepository = centroTuristicoRepository;
        this.tipoCentroTourRepository = tipoCentroTourRepository;
    }

    @Override
    public CentroTuristico createOferta(CentroTuristico centroTuristico) {
        TipoCentroTour user= tipoCentroTourRepository.getbyId(centroTuristico.getTipoCentroTour().getId());
        CentroTuristico newCentroTuristico = new CentroTuristico();
        newCentroTuristico.setTarifaIngreso(centroTuristico.getTarifaIngreso());
        newCentroTuristico.setDistanciaCentro(centroTuristico.getDistanciaCentro());
        newCentroTuristico.setTipoCentroTour(user);
        return centroTuristicoRepository.save(newCentroTuristico);
    }

    @Override
    public List<CentroTuristico> findAllOferta() {
        return centroTuristicoRepository.getAll();
    }

    @Override
    public List<CentroTuristico> findByTipo(Integer id) {
        return centroTuristicoRepository.getByTipo(id);
    }

    @Override
    public void delete(Integer id) {
        centroTuristicoRepository.delete(id);
    }
}
