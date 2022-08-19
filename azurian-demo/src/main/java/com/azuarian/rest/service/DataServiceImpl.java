package com.azuarian.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.azuarian.rest.exception.global.DataNotFoundException;
import com.azuarian.rest.model.Data;
import com.azuarian.rest.repository.DataRepository;

@Service
@Transactional
public class DataServiceImpl implements IDataService {

	@Autowired
	private DataRepository dataRepository;
	
	@Override
	public List<Data> findAll() throws DataNotFoundException {
		List<Data> data = this.dataRepository.findAll();
		
		if(data.isEmpty()) {
			throw new DataNotFoundException("Data not found");

		}
		
		return data;
	}

}
