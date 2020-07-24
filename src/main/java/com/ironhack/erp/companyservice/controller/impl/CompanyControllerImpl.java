package com.ironhack.erp.companyservice.controller.impl;

import com.ironhack.erp.companyservice.controller.interfaces.CompanyControllerInterface;
import com.ironhack.erp.companyservice.model.Company;
import com.ironhack.erp.companyservice.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyControllerImpl implements CompanyControllerInterface {

    @Autowired
    CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @GetMapping("/companies/{id}")
    public Company findById(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @PostMapping("/companies")
    public Company create(@RequestBody Company company) {
        return companyService.create(company);
    }

    @DeleteMapping("/companies/{id}")
    public void delete(@PathVariable Long id) {
        companyService.delete(id);
    }
}
