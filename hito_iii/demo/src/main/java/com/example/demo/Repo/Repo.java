package com.example.demo.Repo;

import com.example.demo.Model.CoronaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<CoronaModel, Integer> {
}
