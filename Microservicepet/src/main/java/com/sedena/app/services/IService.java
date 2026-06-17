package com.sedena.app.services;

import java.util.List;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.Pet;

public interface IService {
	boolean insert(Pet p);
	List<Pet> findAll();
	List<Pet> findbySpecie(String specie);
	List<Pet> findbyAdoptionStatus(AdoptionStatus status);
	boolean update(Pet p);
	boolean updateAdoptionStatus(long id, AdoptionStatus status);
	boolean ddelete(long id);
	Pet findById(long id);

}
