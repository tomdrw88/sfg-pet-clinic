/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 3 sty 2019  21:32:01
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

/**
 *<p></p><br>3 sty 2019
 * @author RS
 *
 */
public interface PetService {

	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet>findAll();
}
