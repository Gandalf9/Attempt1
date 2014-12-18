package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.springframework.stereotype.Service;

@Service
public class NavigationEngineImpl implements NavigationEngine {

	@Override
	public String submitGrantAsylum(String state, Decision data) {
		if (state.equals(RuleEngineImpl.GRANTED)) {
			return "asylum";
		} else {
			return "relevence";
		}
	}

	@Override
	public String submitRelevence(String state, Decision data) {
		if (state.equals(RuleEngineImpl.FAILED_ARTICE_8)) {
			return "failed8";
		} else {
			return "suitability";
		}
	}
}
