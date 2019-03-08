package com.codegen.dataModels;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contract {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contractId")
	private int contractId;
	private String contractStartDate;
	private String contractEndDate;

	@OneToMany (mappedBy = "contracts",cascade = CascadeType.ALL)
	private List<roomType> roomTypes = new ArrayList<roomType>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelid", referencedColumnName = "hotelId")
	private Hotel hotel;

	public Contract(){}


	public void setRoomTypes( List<roomType> roomTypes ) {
		roomTypes.forEach( x->x.setContracts( this ) );
		this.roomTypes = roomTypes;

	}
	@JsonManagedReference
	public List<roomType> getRoomTypes() {
		return roomTypes;
	}

	public int getContractId() {
		return contractId;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractId( int contractId ) {
		this.contractId = contractId;
	}

	public void setContractStartDate( String contractStartDate ) {
		this.contractStartDate = contractStartDate;
	}

	public void setContractEndDate( String contractEndDate ) {
		this.contractEndDate = contractEndDate;
	}
	public void setHotel( Hotel hotel ) {
		this.hotel = hotel;
	}

	public Hotel getHotel() {
		return hotel;
	}

}
