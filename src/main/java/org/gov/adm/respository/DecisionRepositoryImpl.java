package org.gov.adm.respository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.DocumentationSnippits;
import org.gov.adm.businessobjects.Section;
import org.gov.adm.businessobjects.SubSection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class DecisionRepositoryImpl implements DecisionRepository {

	Logger logger = LoggerFactory.getLogger(DecisionRepositoryImpl.class);
	
	Map<String, Decision> store = new HashMap<String, Decision>();

	@Override
	public Decision persistSubSection(String decisionId, String sectionName, SubSection subSection) {
		
		Decision decision = getDecision(decisionId);
		
		Section section = decision.getSections().get(sectionName);
		section.getSubsections().put(subSection.getName(), subSection);

		return decision;
	}

	@Override
	public Decision persistDocumentation(String decisionId, String sectionName, String subSectionName, List<DocumentationSnippits> docs) {
		
		Decision decision = getDecision(decisionId);
		decision.getSections().get(sectionName).getSubsections().get(subSectionName).getSnippits().addAll(docs);

		return decision;
	}
	
	private Decision getDecision(String decisionId) {
		
		Decision decision = store.get(decisionId);
		
		if (decision == null) {
			decision = new Decision();
			
			String id = UUID.randomUUID().toString();
			store.put(id, decision);
		}
		
		return decision;
	}
}
