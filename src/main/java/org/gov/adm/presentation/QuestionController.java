package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.presentation.model.QuestionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionController {

	@Autowired
	ADMService service;
	
	@RequestMapping("/question")
	public String displayQuestions(ModelMap model, String subSection) {
		
		//TODO: Extract the subSection and ask ADM service for subSection Data
		
		return null;
	}
	
	@RequestMapping("/questionSubmitted")
	public String submitQuestions(@ModelAttribute("questionModel") QuestionModel questinModel, ModelMap model) {
		
		//TODO: Submit the QuestionModel
		//TODO: if return is Document then store the current section and subsection and then redirect to document
		//TODO: if return is subSection then store the new section and new subsection and redirect to subSection
		
		return null;
	}
}
