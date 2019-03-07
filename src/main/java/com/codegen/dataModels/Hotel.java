package com.codegen.dataModels;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	private String hotelId;
	private String name;

	public Hotel( String hotelId, String name ) {
		this.hotelId = hotelId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId( String hotelId ) {
		this.hotelId = hotelId;
	}

	public void setName( String name ) {
		this.name = name;
	}


}
