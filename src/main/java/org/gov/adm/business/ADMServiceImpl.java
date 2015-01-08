package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.DocumentationSnippits;
import org.gov.adm.businessobjects.SubSection;
import org.gov.adm.respository.DecisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ADMServiceImpl implements ADMService {

	@Autowired
	private DecisionRepository decisionRepo;
	
	@Autowired
	private RuleEngine ruleEngine;
	
	@Autowired NavigationEngine pageEngine;

	@Override
	public Object submitDocument(String decisionId, DocumentationSnippits documentation) {
		//TODO : persist documentation against subsection
		//TODO : find out from flow engine next section to be displayed
		//TODO : return next subsection
		
		return null;
	}

	@Override
	public Object submitSubsection(String decisionId, String sectionName, SubSection subSectionData) {

		Decision decision = decisionRepo.persistSubSection(decisionId, sectionName, subSectionData);
		
		//TODO : String rule = ruleFinder.getRuleFor(subSectionData);
		//TODO : String state = ruleEngine.fireRuleFor(rule, decision, subSectionData.getName());
		//TODO : decisionRepo.persistState(decision, decisionId, sectionName, subSectionName)
		//TODO : String nextSection = flowEngine.getNextSubsection(state, decision, currentSubSection??)
		/*
		 * TODO:
		 *  if (nextSection ofType DocumentationType)
		 *  	List<DocumentSnippits> docs = documentStore(decision, state, currentSubSection??)
		 * 		subSection.add(docs)
		 * 		return subSection;
		 *  else if (nextSection ofType subSectionType)
		 *      decisionRepo.getSubSection(decisionId, subSection)
		 *      return subSection;
		 */
		
		return null;
	}

	@Override
	public Object getSubsection(String decisionId, String sectionName, String subSectionName) {
		
		//TODO: retrieve requested subsection and send return it
		return null;
	}

	@Override
	public Object getSubsectionDocumentation(String decisionId, String sectionName, String subSectionName) {
		//TODO: retrieve requested subsection documentation and send return it as part of subSection
		return null;
	}
	
	
}
