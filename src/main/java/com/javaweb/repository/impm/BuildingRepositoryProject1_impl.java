package com.javaweb.repository.impm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository_project1;
import com.javaweb.repository.entity.BuildingEntityProject1;

@Repository
public class BuildingRepositoryProject1_impl implements BuildingRepository_project1 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/project1" ; 
	static final String USER = "root" ; 
	static final String PASS = "01112004" ;  

	@Override
	public List<BuildingEntityProject1> FindRequest(Map<String,Object> param) {
		// TODO Auto-generated method stub
		System.out.println("repository") ; 
		List<BuildingEntityProject1> data_repository = new ArrayList<>() ; 
		StringBuilder sql = new StringBuilder("select * from toa_nha where 1=1 ") ;
		if (param.get("name") != null && !((String) param.get("name")).isEmpty() && !param.get("name").equals("")) {
		    sql.append("and toa_nha.ten_toa_nha like '%" + param.get("name") + "%'"); 
		}

		if (param.get("district") != null && !((String) param.get("district")).isEmpty() && !param.get("district").equals(" ")) {
			sql.insert(21, " JOIN quan ON quan.id = toa_nha.quan ") ;
		    sql.append("  and LOWER(quan.ten) LIKE '%" + param.get("district") + "%' ");
		}
		if (param.get("area_from") != null && ! ((String) param.get("area_from")).isEmpty() && !param.get("area_from") .equals(" ")&& param.get("area_to")!= null && !((String) param.get("area_to")).isEmpty() && !param.get("area_to").equals(" ")) {
			long dientichtu =Long.parseLong(param.get("area_from").toString())  ;
			long  dientichden =Long.parseLong(param.get("area_to").toString())  ;
			sql.insert(21, " JOIN dientichthue as dtt ON dtt.id = toa_nha.dientichthue ") ;
		    sql.append(" and CAST(REPLACE(dtt.cod, 'm2', '') AS UNSIGNED) > " + dientichtu + " and CAST(REPLACE(dtt.cod, 'm2', '') AS UNSIGNED) < " + dientichden );
		    System.out.println(sql) ; 
		}
		if (param.get("area") != null && !((String) param.get("area")) .isEmpty() && !param.get("area") .equals(" ")) {
			int dientichsan = Integer.parseInt(param.get("area").toString())  ;
		    sql.append(" and toa_nha.dientichsan <" + dientichsan) ;
		}
		if (param.get("street")  != null && !((String) param.get("street")) .isEmpty() && !param.get("street") .equals(" ")) {
		    sql.append(" and toa_nha.duong like '%" + param.get("street")  + "%' ");
		}
		if (param.get("basement")  != null && !((String) param.get("basement")) .isEmpty() && !param.get("basement") .equals(" ")) {
			int sotangham = Integer.parseInt(param.get("basement").toString() ) ;
		    sql.append(" and toa_nha.sotangham < " + sotangham );
		}
		if (param.get("direction")  != null && !((String) param.get("direction")).isEmpty() && !param.get("direction") .equals(" ")) {
		    sql.append(" and toa_nha.huong like '%" + param.get("direction")  + "%' ");
		}
		if (param.get("rank")!= null && !((String) param.get("rank")).isEmpty() && !param.get("rank").equals(" ")) {
		    sql.append(" and toa_nha.hang like '%" + param.get("rank") + "%' ");
		}
		if (param.get("price_from") != null && !((String) param.get("price_from")).isEmpty() && !param.get("price_from").equals(" ")&& param.get("price_to") != null && !((String) param.get("price_to")).isEmpty() && !param.get("price_to").equals(" ")) {
			long giatu =Long.parseLong(param.get("price_from").toString()) ;
			long  giaden =Long.parseLong(param.get("price_to").toString()) ;
		    sql.append(" and toa_nha.giathue > " + giatu + " and toa_nha.giathue < " + giaden);
		}
		if (param.get("manager_phone") != null && !((String) param.get("manager_phone")).isEmpty() && !param.get("manager_phone").equals(" ")) {
		    sql.append(" and toa_nha.sdtquanly like '%" + param.get("manager_phone") + "%' ");
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
