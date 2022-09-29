package com.superhero.dao;

import com.superhero.dto.Sighting;
import java.time.LocalDate;
import java.util.List;

public interface SightingDao {
    Sighting getSightingById(int id);
    List<Sighting> getAllSightings();
    Sighting addSighting(Sighting sighting);    
    void updateSighting(Sighting sighting);
    void deleteSightingById(int id);
    
    List<Sighting> getSightingsByDate(LocalDate date);
}
