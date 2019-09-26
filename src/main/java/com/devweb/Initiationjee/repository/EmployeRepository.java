package com.devweb.Initiationjee.repository;

import com.devweb.Initiationjee.model.Employe;
import com.devweb.Initiationjee.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}