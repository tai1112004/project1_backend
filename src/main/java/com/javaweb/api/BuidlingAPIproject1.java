package com.javaweb.api;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.service.BuildingService;

import model.buildingDTOproject1;

@RestController
public class BuidlingAPIproject1 {
	@Autowired
	private BuildingService buildingservice  ; 
	@GetMapping(value="/api/building/") 
	public List<buildingDTOproject1> getdata()
	{
		List<buildingDTOproject1> result = buildingservice.findAll() ; 
		return result ; 
	}
	
	
}
