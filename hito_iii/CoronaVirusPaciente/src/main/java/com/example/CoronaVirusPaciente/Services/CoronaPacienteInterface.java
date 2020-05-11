package com.example.CoronaVirusPaciente.Services;

import com.example.CoronaVirusPaciente.Model.CoronaPacienteModel;

import java.util.List;

public interface CoronaPacienteInterface {
    public CoronaPacienteModel guardar(CoronaPacienteModel cpModel);
    public CoronaPacienteModel actualizar(Integer idCoronaVirus, CoronaPacienteModel cpModel);
    public List<CoronaPacienteModel> getAllPacientes();
    public CoronaPacienteModel getPacienteByIdPer(Integer idPer);
    public String control(CoronaPacienteModel cpModel);
    public void delete();

}

