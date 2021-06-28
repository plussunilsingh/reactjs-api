package com.reactjs.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reactjs.api.entities.React;
import com.reactjs.api.service.ReactService;

@RestController
public class ReactController {

	@Autowired
	ReactService reactService;

	@GetMapping("/getreactlist")
	public List<Map<String, Object>>  getreactlist(Model model) {
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	
		System.out.println(" getreactlist ");
		response.put("reactlist", reactService.findAll());
		list.add(response);
		System.out.println(" List : " + list + " [====response : " + response);
		return list;
	}
	/**
	 * @param userForm
	 * @param bindingResult
	 * @param req
	 * @return
	 */
	@PostMapping(value = "/add", consumes = "application/json")
	public List<Map<String, Object>> registraion(@RequestBody React react) {
		Map<String, Object> response = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		System.out.println(" radd   eact == " + react);
		react = reactService.save(react);
		response.put("react", react);
		response.put("message", "success");
		list.add(response);
		System.out.println(" List : " + list + " [====response : " + response);
		return list;
	}
}
