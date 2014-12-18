package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;

public interface RuleEngine {
	
	String fireRuleGrantAsylum(Decision decision);
	String fireRelevence(Decision decision);

}
