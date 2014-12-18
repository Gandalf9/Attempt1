package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.businessobjects.ChildData;
import org.gov.adm.businessobjects.ChildSubSection;
import org.gov.adm.presentation.model.ChildModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChildController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/child")
	public String child(ModelMap model) {
		ChildModel pageModel = new ChildModel();

		model.addAttribute("childModel", pageModel);

		return "child";
	}
	
	@RequestMapping("/childDecision")
	public String whereToGo(@ModelAttribute("childModel") ChildModel homePage, ModelMap model) {

		ChildSubSection section = new ChildSubSection();
		ChildData childData = new ChildData();
		childData.setAnswered(homePage.isChild());
		section.setChildData(childData);
		
		String page = service.submitChildSubSection(section);
		
		return "redirect:" + page;
	}
}
