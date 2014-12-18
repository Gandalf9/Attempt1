package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.businessobjects.PartnerData;
import org.gov.adm.businessobjects.PartnerSubSection;
import org.gov.adm.presentation.model.PartnerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartnerController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/partner")
	public String partner(ModelMap model) {
		PartnerModel pageModel = new PartnerModel();

		model.addAttribute("partnerModel", pageModel);

		return "partner";
	}
	
	@RequestMapping("/partnerDecision")
	public String whereToGo(@ModelAttribute("partnerModel") PartnerModel homePage, ModelMap model) {

		PartnerSubSection section = new PartnerSubSection();
		PartnerData partnerData = new PartnerData();
		partnerData.setAnswered(homePage.isPartner());
		section.setPartnerData(partnerData);
		
		String page = service.submitPartnerSubSection(section);
		
		return "redirect:" + page;
	}
}
