/*
 *  Company: RS
 *  Project: pet-clinic-web
 *  Created: 22 sty 2019  21:16:28
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<p></p><br>22 sty 2019
 * @author RS
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners() {
		return "owners/index";
	}
}
