/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Марго
 */
@RestController
public class VacancyController {
    
    @Autowired
    VacancyService vacancyService;
    
    @RequestMapping("/vacancies")
    public List<Vacancy> getAllVacancies() {
        return vacancyService.getAllVacancies();
    }
    
    @RequestMapping("/vacancies/{id}")
    public Vacancy getVacancy(@PathVariable Integer id) {
        return vacancyService.getVacancy(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/vacancies")
    public void addVacancy(@RequestBody Vacancy vacancy) {
        vacancyService.addVacancy(vacancy);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/vacancies/{id}")
    public void deleteVacancy(@PathVariable Integer id) {
        vacancyService.deleteVacancy(id);
    }
    
    
    
    
}
