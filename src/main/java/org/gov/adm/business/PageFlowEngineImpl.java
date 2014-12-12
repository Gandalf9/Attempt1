package org.gov.adm.business;

import org.gov.adm.businessobjects.HomePageRuleResult;
import org.springframework.stereotype.Service;

@Service
public class PageFlowEngineImpl implements PageFlowEngine {

	@Override
	public String getNextPage(HomePageRuleResult result) {
		
		if(result.getResult().equals(RuleEngineImpl.GRANTED)) {
			return "asylum";
		} else {
			return "relevence";
		}
	}
}
