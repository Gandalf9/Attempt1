package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;

public interface RuleEngine {
	
	public static final String CONTINUE = "Continue";
	public static final String GRANTED = "Granted";
	public static final String FAILED_ARTICE_8 = "Failed";
	public static final String SUITABILE = "Suitable";
	public static final String NO_RULE_NEEDED = "NoRule";
	
	String fireRuleGrantAsylum(Decision decision);
	String fireRelevence(Decision decision);
	String fireSuitability(Decision decision);
	String fireChild(Decision decision);
	String firePartner(Decision decision);
	String firePrivateLife(Decision decision);
}
