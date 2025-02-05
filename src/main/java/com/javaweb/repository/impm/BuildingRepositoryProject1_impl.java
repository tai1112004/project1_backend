package com.javaweb.repository.impm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository_project1;
import com.javaweb.repository.entity.BuildingEntityProject1;

@Repository
public class BuildingRepositoryProject1_impl implements BuildingRepository_project1 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/project1" ; 
	static final String USER = "root" ; 
	static final String PASS = "01112004" ;  

	@Override
	public List<BuildingEntityProject1> FindRequest(String name, String district) {
		// TODO Auto-generated method stub
		System.out.println("repository") ; 
		List<BuildingEntityProject1> data_repository = new ArrayList<>() ; 
		StringBuilder sql = new StringBuilder("select * from toa_nha where 1=1 ") ;
		if (name != null && !name.isEmpty() && !name.equals("")) {
		    sql.append("and toa_nha.ten_toa_nha like '%" + name + "%'"); 
		}

		if (district != null && !district.isEmpty() && !district.equals(" ")) {
		    sql.append("and toa_nha.duong like '%" + district + "%' ");
		}

		try(
				Connection conn =  DriverManager.getConnection(DB_URL,USER,PASS) ; 
				Statement sttm = conn.createStatement() ; 
				ResultSet rs = sttm.executeQuery(sql.toString()) ; 
				)
		{
			while(rs.next())
			{
				
				BuildingEntityProject1 data = new BuildingEntityProject1() ; 
				data.setId(rs.getString("id"));
				data.setName(rs.getString("ten_toa_nha"));
				data.setDistrict(rs.getString("quan"));
				data.setWard(rs.getString("phuong")) ; 
				data.setStreet(rs.getString("duong"));
				data.setTexture(rs.getString("ketcau"));
				data.setBasement(rs.getString("sotangham"));
				data.setArea(rs.getString("dientichsan"));
				data.setDirection(rs.getString("huong")) ; 
				data.setBrand(rs.getString("hang"));
				data.setRent_fee(rs.getString("giathue"));
				data.setFee_desc(rs.getString("motagia"));
				data.setService_fee(rs.getString("phidichvu"));
				data.setCar_fee(rs.getString("phioto"));
				data.setOvertime_fee(rs.getString("phingoaigio"));
				data.setMotobike_fee(rs.getString("phimoto"));
				data.setElectric_fee(rs.getString("tiendien"));
				data.setDeposit(rs.getString("datcoc"));
				data.setBuy(rs.getString("thanhtoan"));
				data.setRent_time(rs.getString("thoihanthue"));
				data.setDeco_time(rs.getString("thoigiantrangtri")); 
				data.setPhone_number(rs.getString("sdtquanly"));
				data.setBrokerage_fee(rs.getString("phimoigioi")) ; 
				data.setNote(rs.getString("ghichu"));
				data.setRent_area(rs.getString("dientichthue"));
				data.setType_building(rs.getString("loai_toa_nha"));
				System.out.println(data) ; 
				if(data== null) System.out.println("danh sach trong") ; 
				data_repository.add(data) ; 
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace(); 
			System.out.println("loi roi nhe , xin nhap lai di") ; 
		}
		
		
		
		return data_repository;
	}

}
