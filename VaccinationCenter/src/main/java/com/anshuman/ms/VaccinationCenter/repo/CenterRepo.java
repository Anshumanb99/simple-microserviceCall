package com.anshuman.ms.VaccinationCenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anshuman.ms.VaccinationCenter.entities.VaccinationCenter;

@Repository
public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer>{

}
