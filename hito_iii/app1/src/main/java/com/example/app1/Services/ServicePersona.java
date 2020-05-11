package com.example.app1.Services;

import com.example.app1.Model.ModelPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicePersona implements InterfaceServicePersona {
    @Autowired
    private ModelPersona modelPersona;
    @Override
    public void insertar(String nombre) {
        modelPersona.insertar(nombre);

    }
}
