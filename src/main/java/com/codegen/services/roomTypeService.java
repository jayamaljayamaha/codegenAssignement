package com.codegen.services;

import com.codegen.dataModels.roomType;
import com.codegen.repositaries.roomTypeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class roomTypeService {

	@Autowired
	private roomTypeRepositary roomtyperepositary;

	public List<roomType> getAllRoomTypes(){
		List<roomType> allRoomTypes = new ArrayList<>();
		roomtyperepositary.findAll().forEach(allRoomTypes::add);
		return allRoomTypes;
	}

	public void addRoomType(roomType roomtype){
		roomtyperepositary.save(roomtype);
	}

	public Optional<roomType> getRoomType(int id){
		return roomtyperepositary.findById(id);
	}

	public void updateRoomType(roomType roomtype){
		roomtyperepositary.save(roomtype);
	}

	public void deleteRoomType(int id){
		roomtyperepositary.deleteById(id);
	}
}
