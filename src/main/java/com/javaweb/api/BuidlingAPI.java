package com.javaweb.api;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.ErrorDTO;
import model.buildingDTO;
import model.product;
@RestController

public class BuidlingAPI {
	

//	@RequestMapping(value="/api/building/" , method=RequestMethod.GET) 
//	@ResponseBody
//	public buildingDTO Getbuilding(@RequestParam(value="name" , required =false) String name)
//	{
//		buildingDTO data = new buildingDTO() ; 
//		data.setName("Tai ngu");
//		data.setLocation("Ha Noi");
//		return data ; 
//	}
	
	
	
//	@RequestMapping(value="/api/building/" , method=RequestMethod.POST) 
//	public void POSTbuilding(@RequestParam Map<String,String> dulieu)
//	{
//		System.out.println(dulieu) ; 
//	}
	
	
	
//	 lấy dữ liệu ơ body có 2 cách 
//	@RequestMapping(value="/api/building/" , method=RequestMethod.POST) 
//	public void POSTbodybuilding(@RequestBody Map<String,String> dulieu)
//	{
//		System.out.println(dulieu) ; 
//	}
	
	
//	@RequestMapping(value="/api/building/" , method=RequestMethod.POST) 
//	public void POSTbodybuilding1(@RequestBody buildingDTO data)
//	{
//		System.out.println(data) ; 
//	}
	
//	 hien ra danh sach  
//	@RequestMapping(value="/api/building/" , method=RequestMethod.GET) 
//	
//	public List<buildingDTO> Getbuilding1()
//	{
//		List<buildingDTO> arr = new ArrayList<>() ;
//		buildingDTO item1 = new buildingDTO() ; 
//		item1.setName("Hoang Van Tai");
//		item1.setLocation("Nghe An ");
//		buildingDTO item2 = new buildingDTO() ; 
//		item2.setName("Dinh Viet Quang");
//		item2.setLocation("Nghe An");
//		buildingDTO item3 = new buildingDTO() ; 
//		item3.setName("Dinh Viet Hung");
//		item3.setLocation("Nghe An");
//		buildingDTO item4 = new buildingDTO() ; 
//		item4.setName("Ngoo Minh Cuong");
//		item4.setLocation("Thai Binh");
//		arr.add(item1) ; 
//		arr.add(item2) ; 
//		arr.add(item3) ; 
//		arr.add(item4) ; 
//		return arr ; 
//	}
//	
	
	
// tra ve chi tiet loi 	
//	@RequestMapping(value="/api/building/" , method=RequestMethod.GET) 
//	@ResponseBody
//	public Object getbuiding (@RequestParam(value="name",required=false ) String name )
//	{
//		try {
//			System.out.println(5/0) ; 
//		}
//		catch(Exception e) {
//			ErrorDTO error = new ErrorDTO() ; 
//			error.setError("sai phep tinh");
//			List<String> detail = new ArrayList<String>() ; 
//			detail.add("khong chia duoc cho 0") ; 
//			error.setDetail(detail);
//			return error  ; 
//			
//		}
//		List<buildingDTO> arr = new ArrayList<>() ;
//		buildingDTO item1 = new buildingDTO() ; 
//		item1.setName("Hoang Van Tai");
//		item1.setLocation("Nghe An ");
//		buildingDTO item2 = new buildingDTO() ; 
//		item2.setName("Dinh Viet Quang");
//		item2.setLocation("Nghe An");
//		buildingDTO item3 = new buildingDTO() ; 
//		item3.setName("Dinh Viet Hung");
//		item3.setLocation("Nghe An");
//		buildingDTO item4 = new buildingDTO() ; 
//		item4.setName("Ngoo Minh Cuong");
//		item4.setLocation("Thai Binh");
//		arr.add(item1) ; 
//		arr.add(item2) ; 
//		arr.add(item3) ; 
//		arr.add(item4) ; 
//		return arr ; 
//	}
	
//	on tap
	
	
//	lay du lieu tu client ve server 
//	@RequestMapping(value="/api/building/" , method=RequestMethod.GET)
//	public buildingDTO solieu(@RequestParam Map<String,String> dulieu_client)
//	{
//		buildingDTO item4 = new buildingDTO() ; 
//		item4.setName("Ngoo Minh Cuong");
//		item4.setLocation("Thai Binh"); 
//		System.out.println(dulieu_client) ; 
//		return item4;
//	}
	
	@RequestMapping(value="/api/building/", method=RequestMethod.POST) 
	public List<product> hienthiveserver(@RequestBody List<product> dulieu)
	{
		ArrayList<product> arr = new ArrayList() ; 
		for(product item:dulieu)
		{
			product e = new product(); 
			e.setId(item.getId()) ; 
			e.setBody(item.getBody());
			e.setTitle(item.getTitle());
			e.setUserId(item.getUserId());
			arr.add(e) ; 
		}
		return arr ; 
	}
	
}
	
	
	

