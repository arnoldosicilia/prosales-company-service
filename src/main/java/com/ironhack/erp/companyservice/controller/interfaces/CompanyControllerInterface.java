package com.ironhack.erp.companyservice.controller.interfaces;

import com.ironhack.erp.companyservice.exception.NotFoundException;
import com.ironhack.erp.companyservice.model.Company;

import java.util.List;

public interface CompanyControllerInterface {
    public List<Company> findAll();
    public Company findById(Long id);
    public Company create(Company company);
    public void delete(Long id);
}
