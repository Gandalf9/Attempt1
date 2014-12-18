package org.gov.adm.respository;

import java.util.HashMap;
import java.util.Map;

import org.gov.adm.businessobjects.Article8Section;
import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.springframework.stereotype.Repository;

@Repository
public class SectionRepositoryImpl implements SectionRepository {

	Map<Integer, Decision> store = new HashMap<Integer, Decision>();
	
	@Override
	public Decision persistGrantAsylumSubSection(int decisionId, GrantAsylumSubSection section) {
		
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setGrantAsylumSubSection(section);
		store.put(decisionId, decision);
		
		return decision;
	}
	
	@Override
	public Decision persistRelevenceSubSection(int decisionId, RelevenceSubSection section) {
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setRelevenceSubSection(section);
		store.put(decisionId, decision);
		
		return decision;
	}
	
	private Decision checkDecisionExistsInStore(int decisionId) {
		Decision decision = store.get(decisionId);
		
		if (decision == null) {
			Decision  newDecision = new Decision();
			newDecision.setId(decisionId);
			Article8Section section = new Article8Section();
			newDecision.setArticle8Section(section);
			store.put(decisionId, newDecision);
			return newDecision;
		}
		
		return decision;
	}
}
