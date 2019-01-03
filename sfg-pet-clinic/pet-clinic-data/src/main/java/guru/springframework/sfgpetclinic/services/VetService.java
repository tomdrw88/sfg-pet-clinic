/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 3 sty 2019  21:31:52
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

/**
 *<p></p><br>3 sty 2019
 * @author RS
 *
 */
public interface VetService {

	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet>findAll();
}
