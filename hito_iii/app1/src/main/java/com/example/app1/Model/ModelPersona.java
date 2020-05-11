package com.example.app1.Model;

import org.springframework.stereotype.Repository;

@Repository

public class ModelPersona implements InterfaceModelPersona {
    @Override
    public void insertar(String nombre) {
        System.out.print("nombre insertado: "+nombre);
    }
}
