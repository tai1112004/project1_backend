package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

import model.buildingDTOproject1;
@Service
public class BuildingServiceimpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingreposity  ;
 
	@Override
	public List<buildingDTOproject1> findAll() {
		// TODO Auto-generated method stub
		List<BuildingEntity> data_goc = buildingreposity.FindAll() ; 
		List<buildingDTOproject1> data = new ArrayList<buildingDTOproject1>() ; 
		for(BuildingEntity item : data_goc) 
		{
			buildingDTOproject1 data_item = new buildingDTOproject1() ; 
			data_item.setTen_toa_nha(item.getTen_toa_nha());
			data_item.setDuong(item.getDuong());
			data_item.setKetcau(item.getKetcau());
			data_item.setPhuong(item.getPhuong());
			data_item.setQuan(item.getQuan());
			data_item.setSotangham(item.getSotangham()); 
			data.add(data_item) ; 
		}
		return data;
	}

}
