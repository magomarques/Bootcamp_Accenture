package com.eam.Project_Bootcamp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eam.Project_Bootcamp.model.Room;
import com.eam.Project_Bootcamp.service.RoomService;


@RestController
public class RoomController {
	
	@Autowired
	RoomService roomService;

	@GetMapping("/room")
	private List<Room> getAllRoom() {
		return roomService.getAllRoom();
	}
	
	@GetMapping("/room/{id}")
	private Room getRoom(@PathVariable("id") int id) {
		return roomService.getRoomById(id);
	}
	
	@PostMapping("/room")
	private int saveRoom(@RequestBody Room room) {
		roomService.saveOrUpdateRoom(room);
		return room.getIdRoom();
	}
	
	@DeleteMapping("/room/{id}")
	private void deleteRoom(@PathVariable("id") int id) {
		roomService.deleteRoom(id);
	}

}
