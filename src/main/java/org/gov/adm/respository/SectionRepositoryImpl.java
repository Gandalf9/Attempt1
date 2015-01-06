package org.gov.adm.respository;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.util.log.Log;
import org.gov.adm.businessobjects.Article8Section;
import org.gov.adm.businessobjects.ChildSubSection;
import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.PartnerSubSection;
import org.gov.adm.businessobjects.PrivateLifeSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.gov.adm.businessobjects.SuitabilitySubSection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SectionRepositoryImpl implements SectionRepository {

	Logger logger = LoggerFactory.getLogger(SectionRepositoryImpl.class);
	
	Map<Integer, Decision> store = new HashMap<Integer, Decision>();
	
	@Override
	public Decision persistGrantAsylumSubSection(int decisionId, GrantAsylumSubSection section) {
		
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setGrantAsylumSubSection(section);
		store.put(decisionId, decision);
		
		//logger.info("section " + section);
		
		return decision;
	}
	
	@Override
	public Decision persistRelevenceSubSection(int decisionId, RelevenceSubSection section) {
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setRelevenceSubSection(section);
		store.put(decisionId, decision);
		
		return decision;
	}
	
	@Override
	public Decision persistSuitabilitySubSection(int decisionId, SuitabilitySubSection section) {
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setSuitabilitySubSection(section);
		store.put(decisionId, decision);
		
		return decision;
	}
	
	@Override
	public Decision persistChildSubSection(int decisionId, ChildSubSection section) {
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setChildSubSection(section);
		store.put(decisionId, decision);
		logger.info("ChildSubSection " + section);
		return decision;
	}

	@Override
	public Decision persistPrivateLifeSubSection(int decisionId, PrivateLifeSubSection section) {
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setPrivateSubSection(section);
		store.put(decisionId, decision);
		logger.info("PrivateLifeSubSection " + section);
		return decision;
	}

	@Override
	public Decision persistPartnerSubSection(int decisionId, PartnerSubSection section) {
		Decision decision = checkDecisionExistsInStore(decisionId);
		decision.getArticle8Section().setPartnerSubSection(section);
		store.put(decisionId, decision);
		logger.info("persistPartnerSubSection " + section);
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
