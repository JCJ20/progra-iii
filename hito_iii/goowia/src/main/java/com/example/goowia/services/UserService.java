package com.example.goowia.services;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {
    @Override
    public String getName(String name) {
        return "mi primer servicio rest by: "+name;
    }
}
