package com.javaweb.repository.impm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

import model.buildingDTOproject1;
@Repository
public class BuildingRepository_impm implements BuildingRepository {
	static final String DB_URL = "jdbc:mysql://localhost:3306/project1" ; 
	static final String USER = "root" ; 
	static final String PASS = "01112004" ; 
	@Override
	public List<BuildingEntity> FindAll() {
		// TODO Auto-generated method stub
		String sql = "select * from toa_nha" ; 
		List<BuildingEntity> result = new ArrayList<>() ;
		try	(
				Connection conn = DriverManager.getConnection(DB_URL,USER,PASS) ;
				Statement stmt = conn.createStatement() ; 
				ResultSet rs = stmt.executeQuery(sql) ; 
			)
			{
				while(rs.next())
				{
					BuildingEntity data = new BuildingEntity() ; 
					data.setTen_toa_nha(rs.getString("ten_toa_nha"));
					data.setQuan(rs.getString("quan")); 
					data.setPhuong(rs.getString("phuong"));
					data.setDuong(rs.getString("duong"));
					data.setKetcau(rs.getString("ketcau"));
					data.setSotangham(rs.getString("sotangham"));
					result.add(data) ; 
				}
			}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("ket noi bi loi . xin kiem tra lai") ; 
		}
		return result;
	}

}
