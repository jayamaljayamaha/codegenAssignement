package com.codegen.dataModels;

import javax.persistence.Id;

public class Contract {

	@Id
	private String contractId;
	private String hotelId;
	private String maxAdults;
	private String noOfRooms;
	private String price;
	private String contractStartDate;
	private String contractEndDate;

	public Contract( String contractId, String hotelId, String maxAdults, String noOfRooms, String price,
			String contractStartDate, String contractEndDate )
	{
		this.contractId = contractId;
		this.hotelId = hotelId;
		this.maxAdults = maxAdults;
		this.noOfRooms = noOfRooms;
		this.price = price;
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
	}

	public String getContractId() {
		return contractId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public String getMaxAdults() {
		return maxAdults;
	}

	public String getNoOfRooms() {
		return noOfRooms;
	}

	public String getPrice() {
		return price;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractId( String contractId ) {
		this.contractId = contractId;
	}

	public void setHotelId( String hotelId ) {
		this.hotelId = hotelId;
	}

	public void setMaxAdults( String maxAdults ) {
		this.maxAdults = maxAdults;
	}

	public void setNoOfRooms( String noOfRooms ) {
		this.noOfRooms = noOfRooms;
	}

	public void setPrice( String price ) {
		this.price = price;
	}

	public void setContractStartDate( String contractStartDate ) {
		this.contractStartDate = contractStartDate;
	}

	public void setContractEndDate( String contractEndDate ) {
		this.contractEndDate = contractEndDate;
	}
}
