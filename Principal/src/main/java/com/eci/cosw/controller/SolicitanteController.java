package com.eci.cosw.controller;

import com.eci.cosw.model.Solicitante;
import com.eci.cosw.stub.SolicitanteStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/solicitante")
public class SolicitanteController {

    @Autowired
    SolicitanteStub solicitanteStub;

    @RequestMapping(method = RequestMethod.GET)
    public List<Solicitante> getSolicitantes(){
         return solicitanteStub.getSolicitantes();
        }

    @RequestMapping(value = "/{idSolicitante}", method = RequestMethod.GET)
    public Solicitante getSolicitanteById(@PathVariable("idSolicitante") Integer idSolicitante) {
        return solicitanteStub.getSolicitanteById(idSolicitante);
    }

    @RequestMapping(value = "/{cedulaSolicitante}", method = RequestMethod.GET)
    public Solicitante getSolicitantesByCedula(@PathVariable("cedulaSolicitante") Integer cedulaSolicitante){
        return solicitanteStub.getSolicitanteByCedula(cedulaSolicitante);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addSolicitante(Solicitante solicitante){
        solicitanteStub.addSolicitante(solicitante);
    }
}
