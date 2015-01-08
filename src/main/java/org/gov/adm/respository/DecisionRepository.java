package org.gov.adm.respository;

import java.util.List;

import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.DocumentationSnippits;
import org.gov.adm.businessobjects.SubSection;

public interface DecisionRepository {
	
	Decision persistSubSection(String decisionId, String sectionName, SubSection section);
	Decision persistDocumentation(String decisionId, String sectionName, String subSectionName, List<DocumentationSnippits> docs);
	
}
