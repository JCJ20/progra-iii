package com.example.demo.Controller;

import com.example.demo.Model.CoronaModel;
import com.example.demo.Services.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v2/")
public class CoronaControllerRest {
    @Autowired
    private CoronaService coronaService ;


    @PostMapping("/corona")
    public ResponseEntity save(@RequestBody CoronaModel corona){
        try{
            return new ResponseEntity<>(coronaService.guardar(corona), HttpStatus.CREATED);

        }catch (Exception exception) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);

        }
//        return new ResponseEntity<>(null,HttpStatus.ACCEPTED);
    }

}
