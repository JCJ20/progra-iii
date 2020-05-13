package com.example.Corona_Virus.Repo;

import com.example.Corona_Virus.Model.CoronaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoronaRepo extends JpaRepository<CoronaModel,Integer> {
}
