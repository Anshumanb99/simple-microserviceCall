package com.anshuman.ms.VaccinationCenter.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anshuman.ms.VaccinationCenter.model.Citizen;

@FeignClient("CITIZEN-SERVICE")
public interface CitizenServiceClient {

	@GetMapping("/citizen/id/{id}")
    List<Citizen> getCitizensById(@PathVariable Integer id);
}
