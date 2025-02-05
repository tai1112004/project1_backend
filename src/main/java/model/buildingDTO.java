package model;

public class buildingDTO {
	 private String name , Location ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "buildingDTO [name=" + name + ", Location=" + Location + "]";
	} 
	
	 
}
