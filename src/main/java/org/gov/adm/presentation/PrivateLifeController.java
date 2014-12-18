package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.businessobjects.PrivateLifeData;
import org.gov.adm.businessobjects.PrivateLifeSubSection;
import org.gov.adm.presentation.model.GrantAsylumModel;
import org.gov.adm.presentation.model.PrivateLifeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrivateLifeController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/privateLife")
	public String partner(ModelMap model) {
		GrantAsylumModel pageModel = new GrantAsylumModel();
		pageModel.setGrant(true);

		model.addAttribute("grantModel", pageModel);

		return "privateLife";
	}
	
	@RequestMapping("/privateLifeDecision")
	public String whereToGo(@ModelAttribute("privateLifeModel") PrivateLifeModel homePage, ModelMap model) {

		PrivateLifeSubSection section = new PrivateLifeSubSection();
		PrivateLifeData privateLifeData = new PrivateLifeData();
		privateLifeData.setAnswered(homePage.isPrivateLife());
		section.setPrivateLifeData(privateLifeData);
		
		String page = service.submitPrivateLifeSubSection(section);
		
		return "redirect:" + page;
	}
}
