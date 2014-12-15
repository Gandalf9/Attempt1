package org.gov.adm.business;

import org.gov.adm.presentation.model.Model;
import org.springframework.stereotype.Service;

@Service
public class PageFlowEngineImpl implements PageFlowEngine {

	@Override
	public String getNextPage(String state, Model data) {

		if (data.getPageName().equals(Model.PageName.HOME_PAGE)) {
			if (state.equals(RuleEngineImpl.GRANTED)) {
				return "asylum";
			} else {
				return "relevence";
			}
		}
		
		if (data.getPageName().equals(Model.PageName.RELEVENT)) {
			if (state.equals(RuleEngineImpl.FAILED_ARTICE_8)) {
				return "failed8";
			} else {
				return "suitability";
			}
		}

		return null;
	}
}
