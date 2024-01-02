package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Loads;
import com.springrest.springrest.services.LoadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController

public class MyController {
	
	@Autowired
	private LoadService loadService;
	
	// checking server is running
	@GetMapping("/home")
	public String home() {
		return "Welcome to the home";
	}
	
	//get all the loads
	@GetMapping("/loads")
	public List<Loads> getLoads() {
		return this.loadService.getLoads();
	}
	
	@GetMapping("/load/{loadId}")
	public Loads getLoad(@PathVariable String loadId) {
		return this.loadService.getLoad(Long.parseLong(loadId));
	}
	
	@PostMapping("/load")
	public Loads addLoad(@RequestBody Loads load) {
		return this.loadService.addLoad(load);
	}
	
	@PutMapping("/load/{loadId}")
	public Loads updateLoad(@RequestBody Loads load, @PathVariable String loadId) {
		return this.loadService.updateLoad(load, Long.parseLong(loadId));
	}
	
	
	
}
