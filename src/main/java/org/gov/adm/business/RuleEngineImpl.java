package org.gov.adm.business;

import org.gov.adm.businessobjects.HomePageRuleResult;
import org.gov.adm.presentation.model.HomePageModel;
import org.springframework.stereotype.Service;

@Service
public class RuleEngineImpl implements RuleEngine {

	public static final String GO_TO_NEXT_PAGE = "GoToNextPage";
	public static final String GRANTED = "Granted";

	@Override
	public HomePageRuleResult fireRuleForHomePageData(HomePageModel section) {
		
		HomePageRuleResult result;
		
		if (section.isQualify()) {
			result = new HomePageRuleResult(GRANTED);
		} else {
			result = new HomePageRuleResult(GO_TO_NEXT_PAGE);
		}
		
		return result;
	}
}
