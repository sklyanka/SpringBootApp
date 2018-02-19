/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacancyService {
    
    @Autowired
    VacancyRepository vacancyRepository;
    
    public List<Vacancy> getAllVacancies() {
        List<Vacancy> vacansies = new ArrayList<Vacancy>();
        vacancyRepository.findAll().forEach(vacansies::add);
        Collections.sort(vacansies , new Comparator<Vacancy>() {
            public int compare(Vacancy v1, Vacancy v2) {
              return v1.getName().compareTo(v2.getName());
            }
        });
        return vacansies;
    }
    
    public Vacancy getVacancy(Integer id) {
        return vacancyRepository.findOne(String.valueOf(id));
    }
    
    public void addVacancy(Vacancy vacancy) {
        vacancyRepository.save(vacancy);
    }
    
    public void deleteVacancy(Integer id) {
        vacancyRepository.delete(String.valueOf(id));
    }
    
    
}
