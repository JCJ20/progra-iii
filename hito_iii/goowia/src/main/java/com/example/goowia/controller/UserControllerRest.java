package com.example.goowia.controller;

import com.example.goowia.model.PersonaModel;
import com.example.goowia.services.PersonaService;
import com.example.goowia.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/")

public class UserControllerRest {
    @Autowired
    private UserService userService;
    @Autowired
    private PersonaService personaService;

    @GetMapping("/nameApp")
    public String nameApp(){
        return "First App";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World") String name) {
        return userService.getName(name);
    }

    @PostMapping("/person")
    public ResponseEntity save(@RequestBody PersonaModel persona){
        try {
            return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/person/{idPer}")
    public ResponseEntity<String> delete(@PathVariable("idPer") Integer idPer) {
        try {
            personaService.delete(idPer);
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
