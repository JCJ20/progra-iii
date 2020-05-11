package com.example.Corona_Virus.Controller;

import com.example.Corona_Virus.Model.CoronaModel;
import com.example.Corona_Virus.Services.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class CoronaControllerRest {
    @Autowired
    private CoronaService coronaService;


    @PostMapping("/corona")
    public ResponseEntity save(@RequestBody CoronaModel corona) {
        try {
            return new ResponseEntity<>(coronaService.guardar(corona), HttpStatus.CREATED);

        } catch (Exception exception) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);

        }
    }


    @PutMapping("/updep/{idDep}")
    public ResponseEntity<CoronaModel> update(@PathVariable("idDep") Integer idDep, @RequestBody CoronaModel corona) {
        try {
            CoronaModel dUpdate = coronaService.actualizar(idDep, corona);
            if (dUpdate != null) {
                return new ResponseEntity<>(dUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception exception) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/corona/{idc}")
    public ResponseEntity<String> delete(@PathVariable("idc") Integer idDep) {
        try {
            coronaService.delete(idDep);
            return new ResponseEntity<>("departamento eliminado", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/deps")
    public ResponseEntity<List<CoronaModel>> getDeps() {
        try {
            List<CoronaModel> persons = coronaService.getAllCoronaDeps();

            if (persons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(persons, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/corona/{idDep}")
    public ResponseEntity<CoronaModel> getPersonByIdPer(@PathVariable("idDep") Integer idDep) {
        try {
            CoronaModel cdModel = coronaService.getCoronaById(idDep);

            if (cdModel != null) {
                return new ResponseEntity<>(cdModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
