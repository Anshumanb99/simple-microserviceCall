package com.anshuman.ms.citizenservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshuman.ms.citizenservice.entities.Citizen;
import com.anshuman.ms.citizenservice.repositories.CitizenRepo;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepo citizenRepo;

	@RequestMapping("/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<>("hello",HttpStatus.OK);
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id){
		List<Citizen> listCitizens=citizenRepo.findByVaccinationCenterId(id);
		return new ResponseEntity<>(listCitizens,HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
		Citizen citizen=citizenRepo.save(newCitizen);
		return new ResponseEntity<>(citizen,HttpStatus.OK);
	}
	
}
