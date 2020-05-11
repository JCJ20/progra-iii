package com.example.Corona_Virus.Services;

import com.example.Corona_Virus.Model.CoronaModel;
import com.example.Corona_Virus.Repo.CoronaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoronaService implements CoronaServiceInterface {
    @Autowired
    private CoronaRepo coronaRepo;

    @Override
    public CoronaModel guardar(CoronaModel cModel) {
        return coronaRepo.save(cModel);

    }

    @Override
    public CoronaModel actualizar(Integer IdDep, CoronaModel coronaModel) {
        Optional<CoronaModel> corona = coronaRepo.findById(IdDep);
        CoronaModel depUpdate = null;

        if (corona.isPresent()) {
            depUpdate = corona.get();
            depUpdate.setNombreDepartamento(coronaModel.getNombreDepartamento());
            depUpdate.setCasosSospechosos(coronaModel.getCasosSospechosos());
            depUpdate.setCasosConfirmados(coronaModel.getCasosConfirmados());
            depUpdate.setCasosRecuperados(coronaModel.getCasosRecuperados());

            coronaRepo.save(depUpdate);
        }
        return depUpdate;
    }

    @Override
    public Integer delete(Integer IdDep) {
        coronaRepo.deleteById(IdDep);
        return 1;
    }

    @Override
    public List<CoronaModel> getAllCoronaDeps() {
        List<CoronaModel> coronaDeps = new ArrayList<CoronaModel>();
        coronaRepo.findAll().forEach(coronaDeps::add);

        return coronaDeps;
    }

    @Override
    public CoronaModel getCoronaById(Integer idPer) {
        Optional<CoronaModel> corona = coronaRepo.findById(idPer);
        CoronaModel cdModel = null;

        if (corona.isPresent()) {
            cdModel = corona.get();
        }
        return cdModel;
    }

}
