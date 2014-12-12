package org.gov.adm.presentation;

import org.gov.adm.presentation.model.RelevenceModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RelevenceController {

	@RequestMapping("/relevence")
	public String home(ModelMap model)
	{
		
		RelevenceModel pageModel = new RelevenceModel();
		pageModel.setRelevence(new String[] {"child"});
		
		model.addAttribute("yatin", pageModel);
		
		return "relevence";
	}

}
