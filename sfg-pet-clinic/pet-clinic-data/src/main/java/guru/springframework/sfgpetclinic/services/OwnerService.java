/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 3 sty 2019  21:29:38
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 *<p></p><br>3 sty 2019
 * @author RS
 *
 */
public interface OwnerService {

	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner>findAll();
	 
}
