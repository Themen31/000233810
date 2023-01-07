package com.example.backend.Domain.service;

import com.example.backend.Domain.Entities.TipoCentroTour;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



public interface UsuarioService {

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public TipoCentroTour createOrder(TipoCentroTour tipoCentroTour);
    public List<TipoCentroTour> findAllOrders();
    public void  delete(Integer id);

}
