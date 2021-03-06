package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.springframework.stereotype.Service;

@Service
public class RuleEngineJava implements RuleEngine {

	@Override
	public String fireRuleGrantAsylum(Decision decision) {
		
		if (decision.getArticle8Section().getGrantAsylumSubSection().getGrantAsylumData().isGranted()) {
			return GRANTED;
		} else {
			return CONTINUE;
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

	@Override
	public String fireSuitability(Decision decision) {
		
		boolean ac1 = decision.getArticle8Section().getSuitabilitySubSection().getAc1Data().isAnswered();
		boolean ac2 = decision.getArticle8Section().getSuitabilitySubSection().getAc2Data().isAnswered();
		boolean ac3 = decision.getArticle8Section().getSuitabilitySubSection().getAc3Data().isAnswered();
		
		if (ac1 || ac2 || ac3) {
			return FAILED_ARTICE_8;
		} else {
			return SUITABILE;
		}
	}

	@Override
	public String fireChild(Decision decision) {
		return NO_RULE_NEEDED;
	}

	@Override
	public String firePartner(Decision decision) {
		return NO_RULE_NEEDED;
	}

	@Override
	public String firePrivateLife(Decision decision) {
		return NO_RULE_NEEDED;
	}
	
	
}
