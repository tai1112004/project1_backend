"use client";

import { useParams } from "next/navigation";
import { useEffect, useState } from "react";

export default  function Search(){
    interface Building {
        name: string;
        area: string;
        district: string;
        street: string;
        basement: string;
        direction: string;
        rank: string;
        area_from: string;
        area_to: string;
        price_from: string;
        price_to: string;
        manager: string;
        manager_phone: string;
        staff: string;
        option: string;
      }
    const [posts, setPosts] = useState([])
    // useEffect(()=>{
    //     console.log(api) ; 
    //     if(building)
    //     {
    //         const updatedApi = `${api}?name=${building.name}&area=${building.area}&district=${building.district}&street=${building.street}&basement=${building.basement}&direction=${building.direction}&rank=${building.rank}&area_from=${building.area_from}&area_to=${building.area_to}&price_from=${building.price_from}&price_to=${building.price_to}&manager=${building.manager}&manager_phone=${building.manager_phone}&staff=${building.staff}&option=${building.option}`
    //         fetch(updatedApi) 
    //         .then(res=>res.json())
    //         .then(data=>{
    //             setPosts(data)
    //         })
        
    //     }
    // console.log(posts)
    
    // },[building])  
    
    const handleSubmit = async(e:any)=>{
        e.preventDefault();
        console.log("button") 
        const item={
            "name":e.target.tentoanha.value,
            "area":e.target.dientichsan.value,
            "district":e.target.quan.value,
            "street":e.target.duong.value,
            "basement":e.target.tangham.value,
            "direction":e.target.huong.value,
            "rank":e.target.hang.value,
            "area_from":e.target.dientichtu.value,
            "area_to":e.target.dientichden.value,
            "price_from":e.target.giathuetu.value,
            "price_to":e.target.giathueden.value,
            "manager":e.target.tenquanly.value,
            "manager_phone":e.target.dienthoaiquanly.value,
            "staff":e.target.nhanvienphutrach.value,
            "option":e.target.lua_chon.value

        }  
        const api = `http://localhost:8081/api/building1/?name=${item.name}&area=${item.area}&district=${item.district}&street=${item.street}&basement=${item.basement}&direction=${item.direction}&rank=${item.rank}&area_from=${item.area_from}&area_to=${item.area_to}&price_from=${item.price_from}&price_to=${item.price_to}&manager=${item.manager}&manager_phone=${item.manager_phone}&staff=${item.staff}&option=${item.option}`;
        
        fetch(api)
            .then(res => res.json())
            .then(data => {
                setPosts(data);
                console.log(data);
            });
    }
    return (
        <>
            <div className="search-container ml-[40px]">
                <h1 className="font-bold text-2xl mt-[11px] mb-[40px] flex text-center justify-center">Tìm Kiếm Tòa Nhà</h1>
                <div className="search-form">
                    <form action="" method="post" className="grid gap-[40px] grid-cols-3 " onSubmit={handleSubmit}>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Tên tòa nhà: </label>
                            <input type="text" name="tentoanha" id="" placeholder="nhập tên tòa nhà" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Diện tích sàn </label>
                            <input type="text" name="dientichsan" id="" placeholder="nhập diện tích sàn" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Quận hiện có: </label>
                            <input type="text" name="quan" id="" placeholder="nhập Quận hiện có " className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Tên Đường: </label>
                            <input type="text" name="duong" id="" placeholder="nhập tên Đường" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Số tầng hầm: </label>
                            <input type="text" name="tangham" id="" placeholder="nhập số tầng hầm" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Tên Hướng: </label>
                            <input type="text" name="huong" id="" placeholder="nhập Hướng" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Tên Hạng: </label>
                            <input type="text" name="hang" id="" placeholder="nhập hạng" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Diện tích từ: </label>
                            <input type="text" name="dientichtu" id="" placeholder="nhập diện tích từ" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Diện tích đến : </label>
                            <input type="text" name="dientichden" id="" placeholder="nhập Diện tích đến " className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Giá thuê từ: </label>
                            <input type="text" name="giathuetu" id="" placeholder="Giá thuê từ" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Giá thuê đến: </label>
                            <input type="text" name="giathueden" id="" placeholder="Giá thuê đến" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Tên quản lý: </label>
                            <input type="text" name="tenquanly"id="" placeholder="nhập tên Quản lý:" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Diện thoại quản lý: </label>
                            <input type="text" name="dienthoaiquanly" id="" placeholder="Diện thoại quản lý" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        <div className="form-group flex gap-[2px] flex-col  ">
                            <label htmlFor="" >Nhân Viên phụ trách: </label>
                            <input type="text" name="nhanvienphutrach" id="" placeholder="nhập tên Nhân viên phụ trách" className="p-[10px] bg-[#F8FAFC] font-400 text-[16px] outline-none w-[300px] rounded-[14px] "/>
                        </div>
                        
                        <select name="lua_chon" id="" className=" bg-[#F8FAFC] font-400 text-[16px] outline-none rounded-[14px]  w-[300px] p-[10px]">
                            <option value="noithat">nội thất</option>
                            <option value="tangtret">tầng trệt</option>
                            <option value="nguyencan">nguyên căn</option>
                        </select>
                        <button className="text-white bg-blue-700 w-[300px] rounded-[20px] h-[50px] items-center flex justify-center text-center  "  >Search</button>
                        
                        

                    </form>
                </div>
                <table className="w-full mt-[40px]">
                    <thead>
                        <tr>
                            <th>Tên Tòa Nhà</th>
                            <th>Địa Chỉ</th>
                            <th>Số Tầng Hầm</th>
                            <th>Số Điện Thoại</th>
                            <th>Diện Tích Sàn</th>
                            <th>Diện Tích Trong</th>
                            <th>Giá Thuê</th>
                            <th>Phí Dịch Vụ</th>
                            <th>Phí Môi Giới</th>
                            <th>Thao Tác</th>
                        </tr>
                    </thead>
                    {
                        posts.map((post:Building)=>(
                            <>
                            
                                <tbody>
                                    <tr>
                                        <td>{post.name}</td>
                                        <td>{post.street}/{post.ward}/{post.district}</td>
                                        <td>{post.basement}</td>
                                        <td>{post.phone_number}</td>
                                        <td>{post.area}</td>
                                        <td>{post.area_rent}</td>
                                        <td>{post.price_rent}</td>
                                        <td>{post.service_fee}</td>
                                        <td>{post.brokerage_fee}</td>
                                        <td><button className="text-white bg-blue-700 w-[100px] rounded-[20px] h-[50px] items-center flex justify-center text-center  "  >Edit</button></td>
                                    </tr>
                                </tbody>
                             </>
                    ))
                }
                </table>   
                        
            </div>
            
            
        </>
    )
}