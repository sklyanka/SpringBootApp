/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vacancy {
    @Id
    private Integer id;
    private String name;
    private Long salary;
    private String requiredExp;
    private String city;
    
    public Vacancy() {        
    }
    
    public Vacancy(Integer id, String name, Long salary, String requiredExp, String city) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.requiredExp = requiredExp;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getRequiredExp() {
        return requiredExp;
    }

    public void setRequiredExp(String requiredExp) {
        this.requiredExp = requiredExp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
}
