package com.example.CoronaVirusPaciente.Repo;

import com.example.CoronaVirusPaciente.Model.CoronaPacienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoronaRepo extends JpaRepository<CoronaPacienteModel,Integer> {

}
