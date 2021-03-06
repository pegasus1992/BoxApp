package com.eci.cosw.stub;

import com.eci.cosw.model.Mensajero;

import java.util.List;


public interface MensajeroStub {

    public List<Mensajero> getMensajeros();

    public Mensajero getMensajeroById(int id);

    public Mensajero getMensajeroCedula(int cedula);

    public void addMensajeros(Mensajero mensajero);
}
