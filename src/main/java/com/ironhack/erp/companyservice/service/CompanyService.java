package com.ironhack.erp.companyservice.service;

import com.ironhack.erp.companyservice.exception.NotFoundException;
import com.ironhack.erp.companyservice.model.Company;
import com.ironhack.erp.companyservice.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<Company> findAll(){ return companyRepository.findAll();}
    public Company findById(Long id){ return companyRepository.findById(id).orElseThrow(()-> new NotFoundException("Company with id: "+ id + " not found"));}
    public Company create(Company company){ return companyRepository.save(company);}
    public void delete(Long id){ companyRepository.deleteById(id);}
}
