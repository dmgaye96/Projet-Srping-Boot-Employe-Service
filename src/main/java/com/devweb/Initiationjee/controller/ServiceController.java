package com.devweb.Initiationjee.controller;

import com.devweb.Initiationjee.model.Service;
import com.devweb.Initiationjee.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

 @RestController
 @CrossOrigin
 @RequestMapping(value = "/service")
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;
    @GetMapping(value = "/list")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    public List<Service> list(){
        return serviceRepository.findAll();
    }



     @PostMapping (value = "/add" ,consumes = MediaType.APPLICATION_JSON_VALUE)
     @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
     public Service add(@RequestBody Service s){
         return serviceRepository.save(s);
     }
}
