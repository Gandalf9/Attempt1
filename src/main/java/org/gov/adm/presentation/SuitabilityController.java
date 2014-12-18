package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.businessobjects.AC1Data;
import org.gov.adm.businessobjects.AC2Data;
import org.gov.adm.businessobjects.AC3Data;
import org.gov.adm.businessobjects.SuitabilitySubSection;
import org.gov.adm.presentation.model.Suitability1Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuitabilityController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/suitability")
	public String suitability(ModelMap model)
	{
		Suitability1Model pageModel = new Suitability1Model();
		model.addAttribute("suitabilityModel", pageModel);
		
		return "suitability";
	}
	
	@RequestMapping("/suitabilityDecision")
	public String suitabilityDecision(@ModelAttribute("suitabilityModel") Suitability1Model pageModel, ModelMap model)
	{
		SuitabilitySubSection section = new SuitabilitySubSection();
		
		AC1Data ac1Data = new AC1Data();
		ac1Data.setAnswered(pageModel.isSuitable1());
		
		AC2Data ac2Data = new AC2Data();
		ac2Data.setAnswered(pageModel.isSuitable2());
		
		AC3Data ac3Data = new AC3Data();
		ac3Data.setAnswered(pageModel.isSuitable3());
		
		section.setAc1Data(ac1Data);
		section.setAc2Data(ac2Data);
		section.setAc3Data(ac3Data);
		
		String page = service.submitSuitabilitySubSection(section);
		return "redirect:" + page;
	}
}