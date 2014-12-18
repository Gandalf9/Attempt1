package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;

public interface RuleEngine {
	
	String fireRuleGrantAsylum(Decision decision);
	String fireRelevence(Decision decision);
	String fireSuitability(Decision decision);
	String fireChild(Decision decision);
	String firePartner(Decision decision);
	String firePrivateLife(Decision decision);
}
