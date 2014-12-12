package org.gov.adm.business;

import org.gov.adm.businessobjects.HomePageRuleResult;

public interface PageFlowEngine {

	String getNextPage(HomePageRuleResult result);
	
}
