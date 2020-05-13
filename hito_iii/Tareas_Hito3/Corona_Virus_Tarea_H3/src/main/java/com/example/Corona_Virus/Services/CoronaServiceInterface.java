package com.example.Corona_Virus.Services;

import com.example.Corona_Virus.Model.CoronaModel;

import java.util.List;

public interface CoronaServiceInterface {
    public CoronaModel guardar(CoronaModel cModel);
    public CoronaModel actualizar(Integer IdDep, CoronaModel cModel);
    public Integer delete(Integer IdDep);
    public List<CoronaModel> getAllCoronaDeps();
    public CoronaModel getCoronaById(Integer IdDep);
}
