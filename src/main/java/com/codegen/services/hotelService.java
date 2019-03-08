package com.codegen.services;

import com.codegen.dataModels.Hotel;
import com.codegen.repositaries.hotelRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class hotelService {

	@Autowired
	private hotelRepositary hotelrepositary;

	public List<Hotel> getAllHotels(){
		List<Hotel> allHotels = new ArrayList<>();
		hotelrepositary.findAll().forEach(allHotels::add);
		return allHotels;
	}

	public void addHotel(Hotel hotel){
		hotelrepositary.save(hotel);
	}

	public Optional<Hotel> getHotel(int id){
		return hotelrepositary.findById(id);
	}

	public void updateHotel(Hotel hotel){
		hotelrepositary.save(hotel);
	}

	public void deleteHotel(int id){
		hotelrepositary.deleteById(id);
	}

}
