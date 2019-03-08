package com.codegen.dataModels;

import javax.persistence.*;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotelId")
	private int id;

	private String name;

	@OneToOne(mappedBy = "hotel")
	private Contract contract;

	public Hotel(){}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public void setName( String name ) {
		this.name = name;
	}


}
