package com.example.backend.Domain.service.Imp;

import com.example.backend.Domain.Entities.TipoCentroTour;
import com.example.backend.Domain.Repository.TipoCentroTourRepository;
import com.example.backend.Domain.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {
    private final TipoCentroTourRepository tipoCentroTourRepository;


    public UsuarioServiceImp(TipoCentroTourRepository tipoCentroTourRepository) {
        this.tipoCentroTourRepository = tipoCentroTourRepository;
    }

    @Override
    public TipoCentroTour createOrder(TipoCentroTour tipoCentroTour){
        TipoCentroTour newUser= new TipoCentroTour();
        newUser.setNombre(tipoCentroTour.getNombre());
        return tipoCentroTourRepository.save(newUser);
    }

    @Override
    public void delete(Integer id) {
        tipoCentroTourRepository.delete(id);
    }
    @Override
    public List<TipoCentroTour> findAllOrders(){
        return tipoCentroTourRepository.getAll();
    }
}
