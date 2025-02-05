package com.javaweb.repository.entity;

public class BuildingEntityProject1 {
	private String id , name, district, ward,street , texture , basement, area,direction ,  brand , rent_fee, fee_desc, service_fee, car_fee, overtime_fee, motobike_fee, electric_fee , deposit , buy, rent_time, deco_time , phone_number, brokerage_fee , note , rent_area , type_building ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRent_fee() {
		return rent_fee;
	}

	public void setRent_fee(String rent_fee) {
		this.rent_fee = rent_fee;
	}

	public String getFee_desc() {
		return fee_desc;
	}

	public void setFee_desc(String fee_desc) {
		this.fee_desc = fee_desc;
	}

	public String getService_fee() {
		return service_fee;
	}

	public void setService_fee(String service_fee) {
		this.service_fee = service_fee;
	}

	public String getCar_fee() {
		return car_fee;
	}

	public void setCar_fee(String car_fee) {
		this.car_fee = car_fee;
	}

	public String getOvertime_fee() {
		return overtime_fee;
	}

	public void setOvertime_fee(String overtime_fee) {
		this.overtime_fee = overtime_fee;
	}

	public String getMotobike_fee() {
		return motobike_fee;
	}

	public void setMotobike_fee(String motobike_fee) {
		this.motobike_fee = motobike_fee;
	}

	public String getElectric_fee() {
		return electric_fee;
	}

	public void setElectric_fee(String electric_fee) {
		this.electric_fee = electric_fee;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getBuy() {
		return buy;
	}

	public void setBuy(String buy) {
		this.buy = buy;
	}

	public String getRent_time() {
		return rent_time;
	}

	public void setRent_time(String rent_time) {
		this.rent_time = rent_time;
	}

	public String getDeco_time() {
		return deco_time;
	}

	public void setDeco_time(String deco_time) {
		this.deco_time = deco_time;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getBrokerage_fee() {
		return brokerage_fee;
	}

	public void setBrokerage_fee(String brokerage_fee) {
		this.brokerage_fee = brokerage_fee;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getRent_area() {
		return rent_area;
	}

	public void setRent_area(String rent_area) {
		this.rent_area = rent_area;
	}

	public String getType_building() {
		return type_building;
	}

	public void setType_building(String type_building) {
		this.type_building = type_building;
	}

	@Override
	public String toString() {
		return "buildingDTO_request [id=" + id + ", name=" + name + ", district=" + district + ", ward=" + ward
				+ ", street=" + street + ", texture=" + texture + ", basement=" + basement + ", area=" + area
				+ ", direction=" + direction + ", brand=" + brand + ", rent_fee=" + rent_fee + ", fee_desc=" + fee_desc
				+ ", service_fee=" + service_fee + ", car_fee=" + car_fee + ", overtime_fee=" + overtime_fee
				+ ", motobike_fee=" + motobike_fee + ", electric_fee=" + electric_fee + ", deposit=" + deposit
				+ ", buy=" + buy + ", rent_time=" + rent_time + ", deco_time=" + deco_time + ", phone_number="
				+ phone_number + ", brokerage_fee=" + brokerage_fee + ", note=" + note + ", rent_area=" + rent_area
				+ ", type_building=" + type_building + "]";
	} 
}
