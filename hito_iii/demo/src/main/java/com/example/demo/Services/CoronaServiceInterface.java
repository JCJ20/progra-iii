package com.example.demo.Services;

import com.example.demo.Model.CoronaModel;

public interface CoronaServiceInterface {
    public CoronaModel guardar(CoronaModel coronaModel);
    public CoronaModel actualizar(CoronaModel coronaModel, Integer IdDep);
    public Integer Delete(Integer IdDep);

}
