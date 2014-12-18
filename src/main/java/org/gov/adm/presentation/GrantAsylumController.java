package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.businessobjects.GrantAsylumData;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.presentation.model.GrantAsylumModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrantAsylumController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/")
	public String home(ModelMap model) {
		GrantAsylumModel pageModel = new GrantAsylumModel();
		pageModel.setGrant(true);

		model.addAttribute("grantModel", pageModel);

		return "grant";
	}

	@RequestMapping("/grantDecision")
	public String whereToGo(@ModelAttribute("grantModel") GrantAsylumModel homePage, ModelMap model) {

		GrantAsylumSubSection section = new GrantAsylumSubSection();
		GrantAsylumData grantAsylumData = new GrantAsylumData();
		grantAsylumData.setGranted(homePage.isGrant());
		section.setGrantAsylumData(grantAsylumData);
		
		String page = service.submitGrantSubSection(section);
		
		return "redirect:" + page;
	}
	
	@RequestMapping("/asylum")
	public String asylum(ModelMap model) {

		return "asylum";
	}
	
	@RequestMapping("/complete")
	public String complete(ModelMap model) {

		return "complete";
	}
}
