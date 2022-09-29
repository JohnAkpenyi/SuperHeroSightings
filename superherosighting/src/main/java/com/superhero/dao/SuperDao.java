package com.superhero.dao;

import com.superhero.dto.Super;
import com.superhero.dto.Location;
import com.superhero.dto.Organization;
import com.superhero.dto.Power;

import java.util.List;

public interface SuperDao {
    Super getSuperById(int id);
    List<Super> getAllSupers();
    Super addSuper(Super heroVillain);
    void updateSuper(Super heroVillain);
    void deleteSuperById(int id);
    
    List<Super> getSupersByLocation(Location location);
    List<Super> getSupersByOrganization(Organization organization);
    
    List<Location> getLocationsForSuper(int id);
    List<Power> getPowersForSuper(int id);
    List<Organization> getOrganizationsForSuper(int id);
    
    void removePowerForSuper(int superId, int powerId);
    void removeOrganizationForSuper(int superId, int organizationId);
}