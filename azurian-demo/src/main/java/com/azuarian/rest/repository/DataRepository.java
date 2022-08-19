package com.azuarian.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azuarian.rest.model.Data;

public interface DataRepository  extends JpaRepository<Data, Integer>{

}
