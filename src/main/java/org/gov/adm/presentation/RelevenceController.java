package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.businessobjects.RelevenceData;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.gov.adm.presentation.model.RelevenceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RelevenceController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/relevence")
	public String home(ModelMap model)
	{
		RelevenceModel pageModel = new RelevenceModel();
		pageModel.setRelevence(new String[] {"child"});
		
		model.addAttribute("relevenceModel", pageModel);
		
		return "relevence";
	}
	
	@RequestMapping("/decisionRelevence")
	public String decision(@ModelAttribute("relevenceModel") RelevenceModel pageModel, ModelMap model)
	{
		
		String[] relevence = pageModel.getRelevence();
			
		RelevenceSubSection relevenceModel = new RelevenceSubSection();
		RelevenceData relevenceData = new RelevenceData();
		if (relevence.length > 0 && relevence[0] != null) relevenceData.setChildFlag(true);
		if (relevence.length > 1 && relevence[1] != null) relevenceData.setPartnerFlag(true);
		if (relevence.length > 2 && relevence[2] != null) relevenceData.setPrivateFlag(true);
		relevenceModel.setRelevenceData(relevenceData);
		
		String page = service.submitRelevenceSubSection(relevenceModel);
		return "redirect:" + page;
	}

}
