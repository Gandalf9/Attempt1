package org.gov.adm.business;

import org.gov.adm.businessobjects.DocumentationSnippits;
import org.gov.adm.businessobjects.SubSection;

public interface ADMService {
	
	Object submitDocument(String decisionId, DocumentationSnippits documentation);
	Object submitSubsection(String decisionId, String sectionName, SubSection documentation);
	Object getSubsection(String decisionId, String sectionName, String subSectionName);
	Object getSubsectionDocumentation(String decisionId, String sectionName, String subSectionName);
}
