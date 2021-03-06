package org.gov.adm.presentation;

import java.util.Arrays;
import java.util.List;

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
	public String relevence(ModelMap model) {
		RelevenceModel pageModel = new RelevenceModel();
		pageModel.setRelevence(new String[] { "child" });

		model.addAttribute("relevenceModel", pageModel);

		return "relevence";
	}

	@RequestMapping("/decisionRelevence")
	public String decision(@ModelAttribute("relevenceModel") RelevenceModel pageModel, ModelMap model) {
		String[] relevence = pageModel.getRelevence();
		RelevenceSubSection relevenceModel = new RelevenceSubSection();

		if (relevence.length > 0) {
			List<String> rel = Arrays.asList(relevence);

			RelevenceData relevenceData = new RelevenceData();
			if (rel.contains("child"))
				relevenceData.setChildFlag(true);
			if (rel.contains("partner"))
				relevenceData.setPartnerFlag(true);
			if (rel.contains("privateLife"))
				relevenceData.setPrivateFlag(true);
			relevenceModel.setRelevenceData(relevenceData);
		}

		String page = service.submitRelevenceSubSection(relevenceModel);
		return "redirect:" + page;
	}

}
