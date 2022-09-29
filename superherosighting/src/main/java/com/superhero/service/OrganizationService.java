package com.superhero.service;

import com.superhero.dao.OrganizationDao;
import com.superhero.dto.Organization;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
        
    private final OrganizationDao organizationDao;
    
    public OrganizationService(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;
    }
    
    
    public Organization getOrganizationById(int id) {
        Organization organization = organizationDao.getOrganizationById(id);
        return organization;
    }
    
    public List<Organization> getAllOrganizations(){
        List<Organization> organizations = organizationDao.getAllOrganizations();
        return organizations;
    }
    
    public Organization addOrganization(Organization organization) {
        Organization newOrganization = organizationDao.addOrganization(organization);
        return newOrganization;
    }
    
    public void updateOrganization(Organization organization) {
        organizationDao.updateOrganization(organization);
    }
    
    public void deleteOrganizationById(int id) {
        organizationDao.deleteOrganizationById(id);
    }
      
}
