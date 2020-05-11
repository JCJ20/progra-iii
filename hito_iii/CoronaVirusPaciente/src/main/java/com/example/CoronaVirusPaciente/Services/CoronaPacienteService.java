package com.example.CoronaVirusPaciente.Services;

import com.example.CoronaVirusPaciente.Model.CoronaPacienteModel;
import com.example.CoronaVirusPaciente.Repo.CoronaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoronaPacienteService implements CoronaPacienteInterface {
    @Autowired
    private CoronaRepo coronaRepo;

    @Override
    public CoronaPacienteModel guardar(CoronaPacienteModel cpModel) {

        if(cpModel.getEdadPaciente()<10) {
            cpModel.setCategoria("NIÑO");
        }
        if(cpModel.getEdadPaciente()>10 && cpModel.getEdadPaciente()<20) {
                cpModel.setCategoria("ADOLESCENTE");
        }
        if (cpModel.getEdadPaciente()>20) {
                 cpModel.setCategoria("ADULTO");
        }

        cpModel.setFullname(cpModel.getNombrePaciente()+" "+cpModel.getApellidosPaciente());
        return coronaRepo.save(cpModel);
    }

    @Override
    public CoronaPacienteModel actualizar(Integer idCoronaVirus, CoronaPacienteModel cpModel) {
        Optional<CoronaPacienteModel> corona = coronaRepo.findById(idCoronaVirus);
        CoronaPacienteModel pacienteUpdate = null;

        if (corona.isPresent()) {
            pacienteUpdate = corona.get();
            pacienteUpdate.setNombreDepartamento(cpModel.getNombreDepartamento());
            pacienteUpdate.setNombrePaciente(cpModel.getNombrePaciente());
            pacienteUpdate.setApellidosPaciente(cpModel.getApellidosPaciente());
            pacienteUpdate.setEdadPaciente(cpModel.getEdadPaciente());

            if (cpModel.getEdadPaciente()<10)
            {
                cpModel.setCategoria("NINO");

            } else if (cpModel.getEdadPaciente()<20){

                cpModel.setCategoria("ADOLECENTE");
            }
            else
            {
                cpModel.setCategoria("Adulto");
            }

            cpModel.setFullname(cpModel.getNombrePaciente()+" "+cpModel.getApellidosPaciente());

            pacienteUpdate.setCasosSospechosos(cpModel.getCasosSospechosos());
            pacienteUpdate.setCasosConfirmados(cpModel.getCasosConfirmados());
            pacienteUpdate.setCasosRecuperados(cpModel.getCasosRecuperados());

            coronaRepo.save(pacienteUpdate);
        }
        return pacienteUpdate;
    }

    @Override
    public List<CoronaPacienteModel> getAllPacientes() {
        List<CoronaPacienteModel> pacientes = new ArrayList<CoronaPacienteModel>();
        coronaRepo.findAll().forEach(pacientes::add);

        return pacientes;
    }

    @Override
    public CoronaPacienteModel getPacienteByIdPer(Integer idPer) {
        Optional<CoronaPacienteModel> person = coronaRepo.findById(idPer);
        CoronaPacienteModel cpModel = null;

        if (person.isPresent()) {
            cpModel = person.get();
        }
        return cpModel;
    }

    @Override
    public String control(CoronaPacienteModel cpModel) {
        if(cpModel.getEdadPaciente()>70) {
            cpModel.setError("No se puede insertar a la base de datos usted es Mayor de 70 años");
         }
        return cpModel.getError();
    }

    public void delete(){
         coronaRepo.deleteAll();
    }

}