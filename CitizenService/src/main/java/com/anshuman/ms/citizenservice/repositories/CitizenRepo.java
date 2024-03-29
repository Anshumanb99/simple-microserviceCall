package com.anshuman.ms.citizenservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshuman.ms.citizenservice.entities.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen,Integer>{

	public List<Citizen> findByVaccinationCenterId(Integer id);
}
