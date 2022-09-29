package com.superhero.dao;

import com.superhero.dto.Power;

import java.util.List;

public interface PowerDao {
    Power getPowerById(int id);
    List<Power> getAllPowers();
    Power addPower(Power power);
    void updatePower(Power power);
    void deletePowerById(int id);
}
