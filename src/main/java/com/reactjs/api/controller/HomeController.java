package com.reactjs.api.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.reactjs.api.service.ReactService;

@Controller
public class HomeController {

	@Autowired
	ReactService reactService;
	
	@GetMapping("/react")
	public String getReact(HttpServletRequest req,Map map) {
		List reactList = reactService.findAll();
		System.out.println("reactList : "+ reactList);
		map.put("reactList", reactList);
		return "react";
	}
	
}
