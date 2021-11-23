package com.eam.Project_Bootcamp.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.Project_Bootcamp.model.Scheduling;
import com.eam.Project_Bootcamp.repository.SchedulingRepository;


@Service
public class SchedulingService {

	static SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
	
	@Autowired
	SchedulingRepository schedulingRepository;
	
	public List<Scheduling> getAllScheduling() {
		List<Scheduling> schedulings = new ArrayList<Scheduling>();
		schedulingRepository.findAll().forEach(scheduling -> schedulings.add(scheduling));
		return schedulings;
	}
	
	public Scheduling getSchedulingById(int id) {
		return schedulingRepository.findById(id).get();
	}
	
	public void saveOrUpdateScheduling(Scheduling scheduling) {
		schedulingRepository.save(scheduling);
	}
	
	public void deleteScheduling(int id) {
		schedulingRepository.deleteById(id);
	}

}
