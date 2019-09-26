package com.devweb.Initiationjee.controller;

import com.devweb.Initiationjee.model.Employe;

import com.devweb.Initiationjee.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/employe")
public class EmployeController {

    @Autowired
    private EmployeRepository employeRepository;
    @GetMapping(value = "/list")
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public List<Employe> list(){
        return employeRepository.findAll();
    }
}

