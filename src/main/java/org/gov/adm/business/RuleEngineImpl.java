package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.springframework.stereotype.Service;

@Service
public class RuleEngineImpl implements RuleEngine {

	public static final String GO_TO_NEXT_PAGE = "GoToNextPage";
	public static final String GRANTED = "Granted";
	public static final String FAILED_ARTICE_8 = "Failed";
	public static final String SUITABILE = "Suitable";

	
	@Override
	public String fireRuleGrantAsylum(Decision decision) {
		if (decision.getArticle8Section().getGrantAsylumSubSection().getGrantAsylumData().isGranted()) {
			return GRANTED;
		} else {
			return GO_TO_NEXT_PAGE;
		}
	}
	
	@Override
	public String fireRelevence(Decision decision) {
		
		boolean child = decision.getArticle8Section().getRelevenceSubSection().getRelevenceData().isChildFlag();
		boolean partner = decision.getArticle8Section().getRelevenceSubSection().getRelevenceData().isPartnerFlag();
		boolean privateLife = decision.getArticle8Section().getRelevenceSubSection().getRelevenceData().isPrivateFlag();
		
		if (child || partner || privateLife) {
			return SUITABILE;
		} else {
			return FAILED_ARTICE_8;
		}
	}
}
