package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.gov.adm.presentation.model.Model;

public interface NavigationEngine {

	String submitGrantAsylum(String state, Decision data);
	String submitRelevence(String state, Decision data);
	
}
