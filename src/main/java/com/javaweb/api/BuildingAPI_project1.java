package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.service.BuildingServiceProject1;

import model.BuildingDTO_request;

@RestController
public class BuildingAPI_project1 {
	@Autowired
	private BuildingServiceProject1 bsp1 ; 
	@GetMapping(value="/api/building1/")
	public List<BuildingDTO_request> getdata(@RequestParam(name="name",required=false) String name ,
											 @RequestParam(name ="district", required=false) String district)
	{
		System.out.println("Presentation") ; 
		List<BuildingDTO_request> data = bsp1.data_request(name, district) ; 
		return data ; 
	}

}
