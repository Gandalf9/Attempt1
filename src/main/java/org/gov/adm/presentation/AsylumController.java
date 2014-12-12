package org.gov.adm.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AsylumController {

	@RequestMapping("/asylum")
	public String home(ModelMap model) {

		return "asylum";
	}
}
