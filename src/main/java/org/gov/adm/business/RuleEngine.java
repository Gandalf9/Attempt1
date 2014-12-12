package org.gov.adm.business;

import org.gov.adm.businessobjects.HomePageRuleResult;
import org.gov.adm.presentation.model.HomePageModel;

public interface RuleEngine {
	
	HomePageRuleResult fireRuleForHomePageData(HomePageModel section);

}
