package org.gov.adm.business;

import org.gov.adm.presentation.model.Model;

public interface PageFlowEngine {

	String getNextPage(String state, Model data);
	
}
