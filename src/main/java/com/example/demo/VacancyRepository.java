/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Марго
 */
public interface VacancyRepository extends CrudRepository<Vacancy, String>{
    
}
