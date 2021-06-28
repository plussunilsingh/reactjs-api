package com.reactjs.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactjs.api.entities.React;

public interface ReactRepository extends JpaRepository<React, Long> {

}
