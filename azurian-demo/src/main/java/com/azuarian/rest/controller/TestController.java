package com.azuarian.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azuarian.rest.model.Data;

@RestController
public class TestController {	

	 /**
     * Get list data.
     *
     * @return
     */
	@GetMapping("/test")
	public Data listar(){
		
		Data data = new Data();
		data.setId(1);
		data.setName("Dato 1");
		data.setNum(159753852);
		
		return data;
	}	
}
