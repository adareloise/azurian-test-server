package com.azuarian.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azuarian.rest.model.Data;
import com.azuarian.rest.service.IDataService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class DataController {

	@Autowired
	private IDataService dataService;
	
	 /**
     * Get list data.
     *
     * @return
     */
	@GetMapping("/list")
	public ResponseEntity<?> listar(){
		List<Data> data = this.dataService.findAll();
		
		return new ResponseEntity<>(data, HttpStatus.OK);
	}	
	
}
