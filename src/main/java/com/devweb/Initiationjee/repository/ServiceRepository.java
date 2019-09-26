package com.devweb.Initiationjee.repository;

import com.devweb.Initiationjee.model.Service;
import com.devweb.Initiationjee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

}