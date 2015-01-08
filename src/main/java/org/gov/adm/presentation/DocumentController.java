package org.gov.adm.presentation;

import org.gov.adm.business.ADMService;
import org.gov.adm.presentation.model.DocumentationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocumentController {

	@Autowired
	ADMService service;

	@RequestMapping("/documentation")
	public String relevence(ModelMap model) {
		
		//TODO: extract out the subSection, Section and decision ID and ask ADM service for documentation data
		//TODO: Add the documentaion data to model and return
		
		return null;
	}

	@RequestMapping("/documentationSubmitted")
	public String decision(@ModelAttribute("documentationModel") DocumentationModel documentationModel, ModelMap model) {
		
		//TODO: Send down to the ADM service the subsection with the Documentation data
		//TODO: it will return a redirect to new subsection. Store the returned, subsection, section and decision ID in model and redirect
		
		return null;
	}

}
