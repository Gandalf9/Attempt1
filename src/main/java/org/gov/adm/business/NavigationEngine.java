package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;

public interface NavigationEngine {

	String submitGrantAsylum(String state, Decision data);
	String submitRelevence(String state, Decision data);
	String submitSuitability(String state, Decision data);
	String submitChild(String state, Decision data);
	String submitPrivateLife(String state, Decision data);
	String submitPartner(String state, Decision data);
	
}
