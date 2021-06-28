package com.reactjs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactjs.api.entities.React;
import com.reactjs.api.repository.ReactRepository;

@Service
public class ReactServiceImpl implements ReactService {
@Autowired
ReactRepository	reactRepository;
	
@Override
	public List<React> findAll() {
		return reactRepository.findAll();
	}

@Override
	public React save(React react) {
		return reactRepository.save(react);
	}
}
