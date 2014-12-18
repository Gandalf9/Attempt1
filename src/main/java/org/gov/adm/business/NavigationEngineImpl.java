package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.springframework.stereotype.Service;

@Service
public class NavigationEngineImpl implements NavigationEngine {

	@Override
	public String submitGrantAsylum(String state, Decision data) {
		if (state.equals(RuleEngineJava.GRANTED)) {
			return "asylum";
		} else {
			return "relevence";
		}
	}

	@Override
	public String submitRelevence(String state, Decision data) {
		if (state.equals(RuleEngineJava.FAILED_ARTICE_8)) {
			return "failed8";
		} else {
			return "suitability";
		}
	}

	@Override
	public String submitSuitability(String state, Decision data) {
		
		boolean child = data.getArticle8Section().getRelevenceSubSection().getRelevenceData().isChildFlag();
		boolean partner = data.getArticle8Section().getRelevenceSubSection().getRelevenceData().isPartnerFlag();
		boolean privateLife = data.getArticle8Section().getRelevenceSubSection().getRelevenceData().isPrivateFlag();
		
		if(child && !data.getArticle8Section().getChildSubSection().isCompleted()) {
			return "child";
		} else if (partner && !data.getArticle8Section().getPartnerSubSection().isCompleted()) {
			return "partner";
		} else if (privateLife && !data.getArticle8Section().getPrivateSubSection().isCompleted()) {
			return "privateLife";
		}
		
		return "complete";
	}

	@Override
	public String submitChild(String state, Decision data) {
		return submitSuitability(state, data);
	}

	@Override
	public String submitPrivateLife(String state, Decision data) {
		return submitSuitability(state, data);
	}

	@Override
	public String submitPartner(String state, Decision data) {
		return submitSuitability(state, data);
	}
}
