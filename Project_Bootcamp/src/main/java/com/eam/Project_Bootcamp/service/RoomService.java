package com.eam.Project_Bootcamp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.Project_Bootcamp.model.Room;
import com.eam.Project_Bootcamp.repository.RoomRepository;


@Service
public class RoomService {
	
	@Autowired
	RoomRepository roomRepository;
	
	public List<Room> getAllRoom() {
		List<Room> rooms = new ArrayList<Room>();
		roomRepository.findAll().forEach(room -> rooms.add(room));
		return rooms;
	}
	
	public Room getRoomById(int id) {
		return roomRepository.findById(id).get();
	}
	
	public void saveOrUpdateRoom(Room room) {
		roomRepository.save(room);
	}
	
	public void deleteRoom(int id) {
		roomRepository.deleteById(id);
	}

}
