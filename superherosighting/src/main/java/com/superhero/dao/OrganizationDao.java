package com.superhero.dao;

import com.superhero.dto.Organization;

import java.util.List;

public interface OrganizationDao {
    Organization getOrganizationById(int id);
    List<Organization> getAllOrganizations();
    Organization addOrganization(Organization organization);
    void updateOrganization(Organization organization);
    void deleteOrganizationById(int id);    
}