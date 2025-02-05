package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.repository.BuildingRepository_project1;
import com.javaweb.repository.entity.BuildingEntityProject1;
import com.javaweb.service.BuildingServiceProject1;

import model.BuildingDTO_request;
@Service
public class BuildingServiceProject1_impl implements BuildingServiceProject1 {
 @Autowired
 	private BuildingRepository_project1 repository  ; 
	@Override
	public List<BuildingDTO_request> data_request(String name, String district) {
		System.out.println("Service") ; 
		List<BuildingEntityProject1> source = repository.FindRequest(name, district) ;  
		List<BuildingDTO_request> front = new ArrayList<>() ; 
		for(BuildingEntityProject1 rs:source)
		{
			BuildingDTO_request data = new BuildingDTO_request() ; 
			data.setId(rs.getId());
			data.setName(rs.getName());
			data.setDistrict(rs.getDistrict());
			data.setWard(rs.getWard()) ; 
			data.setStreet(rs.getStreet());
			data.setTexture(rs.getTexture());
			data.setBasement(rs.getBasement());
			data.setArea(rs.getArea());
			data.setDirection(rs.getDirection()) ; 
			data.setBrand(rs.getBrand());
			data.setRent_fee(rs.getRent_fee());
			data.setFee_desc(rs.getFee_desc());
			data.setService_fee(rs.getService_fee());
			data.setCar_fee(rs.getCar_fee());
			data.setOvertime_fee(rs.getOvertime_fee());
			data.setElectric_fee(rs.getElectric_fee());
			data.setDeposit(rs.getDeposit());
			data.setBuy(rs.getBuy());
			data.setRent_time(rs.getRent_time());
			data.setDeco_time(rs.getDeco_time()); 
			data.setPhone_number(rs.getPhone_number());
			data.setBrokerage_fee(rs.getBrokerage_fee()) ; 
			data.setNote(rs.getNote());
			data.setRent_area(rs.getRent_area());
			data.setType_building(rs.getType_building());
			front.add(data) ;
		}
		// TODO Auto-generated method stub
		return front;
	}
	
}
