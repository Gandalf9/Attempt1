package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.presentation.model.HomePageModel;
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
		
		model.addAttribute("yatin", pageModel);
		
		return "relevence";
	}
	
	@RequestMapping("/decision1")
	public String decision(@ModelAttribute("yatin") RelevenceModel pageModel, ModelMap model)
	{
		String page = service.submit(pageModel);
		return "redirect:" + page;
	}

}
