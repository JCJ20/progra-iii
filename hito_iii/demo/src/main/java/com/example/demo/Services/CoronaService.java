package com.example.demo.Services;

import com.example.demo.Model.CoronaModel;
import com.example.demo.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoronaService implements CoronaServiceInterface {
    @Autowired
    public Repo repo;

    @Override
    public CoronaModel guardar(CoronaModel coronaModel) {
        return repo.save(coronaModel);
    }

    @Override
    public CoronaModel actualizar(CoronaModel coronaModel, Integer IdDep) {
        return null;
    }

    @Override
    public Integer Delete(Integer IdDep) {
        return null;
    }
}
