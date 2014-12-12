package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.presentation.model.HomePageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	ADMService service;

	@RequestMapping("/")
	public String home(ModelMap model) {
		HomePageModel pageModel = new HomePageModel();
		pageModel.setQualify(true);

		model.addAttribute("yatin", pageModel);

		return "index";
	}

	@RequestMapping("/decision")
	public String whereToGo(@ModelAttribute("yatin") HomePageModel homePage, ModelMap model) {

		String page = service.submitHomePage(homePage);
		
		return "redirect:" + page;
	}
}
