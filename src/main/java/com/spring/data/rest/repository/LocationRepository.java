package com.spring.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.rest.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{

}
