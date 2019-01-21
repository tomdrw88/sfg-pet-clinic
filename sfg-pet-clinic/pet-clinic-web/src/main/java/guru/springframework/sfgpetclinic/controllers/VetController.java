/*
 *  Company: RS
 *  Project: pet-clinic-web
 *  Created: 21 sty 2019  22:32:35
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<p></p><br>21 sty 2019
 * @author RS
 *
 */
@Controller
public class VetController {

	

	@RequestMapping({"vets", "vets/index", "vets/index.html"})
	public String listVets() {
		return "vets/index";
	}
}
