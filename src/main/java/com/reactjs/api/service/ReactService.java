package com.reactjs.api.service;

import java.util.List;

import com.reactjs.api.entities.React;

public interface ReactService {
	React save(React react);
	List<React> findAll();
}
