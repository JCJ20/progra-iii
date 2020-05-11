package com.example.CoronaVirusPaciente.Controller;

import com.example.CoronaVirusPaciente.Model.CoronaPacienteModel;
import com.example.CoronaVirusPaciente.Services.CoronaPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class ControllerCoronaRest {

    @Autowired
    private CoronaPacienteService coronaPacienteService;

    @PostMapping("/coronap")
    public ResponseEntity save(@RequestBody CoronaPacienteModel corona){
        try{
            if(corona.getEdadPaciente()>70){
//                corona = null;
                return new ResponseEntity<>(coronaPacienteService.control(corona),HttpStatus.EXPECTATION_FAILED);
            }
            return new ResponseEntity<>(coronaPacienteService.guardar(corona), HttpStatus.CREATED);

        }catch (Exception exception) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);

        }
    }

    @GetMapping("/pacientes")
    public ResponseEntity<List<CoronaPacienteModel>> getAllPacientes() {
        try {
            List<CoronaPacienteModel> paciente = coronaPacienteService.getAllPacientes();

            if (paciente.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(paciente, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/paciente/{idCoronaVirus}")
    public ResponseEntity<CoronaPacienteModel> getPacienteByIdPer(@PathVariable("idCoronaVirus") Integer idPer) {
        try {
            CoronaPacienteModel cpModel = coronaPacienteService.getPacienteByIdPer(idPer);

            if (cpModel != null) {
                return new ResponseEntity<>(cpModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updatep/{idC}")
    public ResponseEntity<CoronaPacienteModel> update(@PathVariable("idC") Integer idCoronaVirus, @RequestBody CoronaPacienteModel corona){
        try{
            CoronaPacienteModel pacienteUpdate = coronaPacienteService.actualizar(idCoronaVirus, corona);
            if (pacienteUpdate != null) {
                return new ResponseEntity<>(pacienteUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception exception ){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/coronavirus/delete")
    public ResponseEntity<String> delete() {
        try {
            coronaPacienteService.delete();
            return new ResponseEntity<>("table successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
