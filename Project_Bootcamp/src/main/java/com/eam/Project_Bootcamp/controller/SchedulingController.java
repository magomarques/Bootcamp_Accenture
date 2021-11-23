package com.eam.Project_Bootcamp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eam.Project_Bootcamp.model.Scheduling;
import com.eam.Project_Bootcamp.service.SchedulingService;


@RestController
public class SchedulingController {
	
	@Autowired
	SchedulingService schedulingService;

	@GetMapping("/scheduling")
	private List<Scheduling> getAllScheduling() {
		return schedulingService.getAllScheduling();
	}
	
	@GetMapping("/scheduling/{id}")
	private Scheduling getScheduling(@PathVariable("id") int id) {
		return schedulingService.getSchedulingById(id);
	}
	
	@PostMapping("/scheduling")
	private int saveScheduling(@RequestBody Scheduling scheduling) {
		schedulingService.saveOrUpdateScheduling(scheduling);
		return scheduling.getIdScheduling();
	}
	
	@DeleteMapping("/scheduling/{id}")
	private void deleteScheduling(@PathVariable("id") int id) {
		schedulingService.deleteScheduling(id);
	}

}
