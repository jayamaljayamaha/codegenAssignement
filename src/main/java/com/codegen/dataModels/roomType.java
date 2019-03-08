package com.codegen.dataModels;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class roomType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roomTypeId")
	private int roomTypeId;
	private String roomType;
	private String price;
	private String noOfRooms;
	private String maxAddults;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "contractId")
	private Contract contracts;

	public roomType(){}

	public String getPrice() {
		return price;
	}

	public String getNoOfRooms() {
		return noOfRooms;
	}

	public String getMaxAddults() {
		return maxAddults;
	}

	public String getRoomType() {
		return roomType;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId( int hotelId ) {
		this.roomTypeId = hotelId;
	}

	public void setRoomType( String name ) {
		this.roomType = name;
	}

	public void setPrice( String price ) {
		this.price = price;
	}

	public void setNoOfRooms( String noOfRooms ) {
		this.noOfRooms = noOfRooms;
	}

	public void setMaxAddults( String maxAddults ) {
		this.maxAddults = maxAddults;
	}
	public Contract getContracts() {
		return contracts;
	}

	public void setContracts( Contract contracts ) {
		this.contracts = contracts;
	}

}
