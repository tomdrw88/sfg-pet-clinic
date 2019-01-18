/*
 *  Company: RS
 *  Project: pet-clinic-data
 *  Created: 18 sty 2019  22:39:03
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *<p></p><br>18 sty 2019
 * @author RS
 *
 */
public abstract class AbstractMapService<T, ID> {

	protected Map<ID, T>map = new HashMap<>();
	
	Set<T>findAll(){
		return new HashSet<>(map.values());
	}
	
	
	T findById(ID id) {
		return map.get(id);
	}
	
	
	T save(ID id, T object) {
		map.put(id, object);
		return object;
	}
	
	
	void deleteById(ID id) {
		map.remove(id);
	}
	 
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
