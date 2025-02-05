package com.javaweb.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.service.BuildingServiceProject1;

import model.BuildingDTO_request;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BuildingAPI_project1 {
	@Autowired
	private BuildingServiceProject1 bsp1 ; 
	@GetMapping(value="/api/building1/")
	public List<BuildingDTO_request> getdata(@RequestParam Map<String,Object> param 
											 
											)
											
											

	{
		System.out.println("Presentation") ; 
		List<BuildingDTO_request> data = bsp1.data_request(param) ; 
		return data ; 
	}

}
