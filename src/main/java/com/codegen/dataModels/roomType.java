package com.codegen.dataModels;

import javax.persistence.Id;

public class roomType {

	@Id
	private String roomTypeId;
	private String roomType;

	public roomType( String hotelId, String name ) {
		this.roomTypeId = hotelId;
		this.roomType = name;
	}

	public String getRoomType() {
		return roomType;
	}

	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId( String hotelId ) {
		this.roomTypeId = hotelId;
	}

	public void setRoomType( String name ) {
		this.roomType = name;
	}

}
