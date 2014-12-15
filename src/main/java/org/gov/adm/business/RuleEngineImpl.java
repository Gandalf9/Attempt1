package org.gov.adm.business;

import org.gov.adm.presentation.model.Model;
import org.gov.adm.presentation.model.Model.PageName;
import org.gov.adm.presentation.model.PageData;
import org.springframework.stereotype.Service;

@Service
public class RuleEngineImpl implements RuleEngine {

	public static final String GO_TO_NEXT_PAGE = "GoToNextPage";
	public static final String GRANTED = "Granted";
	public static final String FAILED_ARTICE_8 = "Failed";
	public static final String SUITABILE = "Suitable";

	@Override
	public String fireRule(Model section) {
		
		RuleRepo rulesRepo = new RuleRepo();
		RunRuleEngine rulesEngine = new RunRuleEngine();
		
		String ruleToApply = rulesRepo.getRules(section.getPageName());
		String state = rulesEngine.fireRule(ruleToApply, section.getPageData());
		
		return state;
	}
	
	//Simulates the database to select a rule
	private class RuleRepo {

		public String getRules(PageName pageName) {
			if (pageName.equals(Model.PageName.HOME_PAGE)) {
				return "RuleFile1";
			} else if (pageName.equals(Model.PageName.RELEVENT)) {
				return "RuleFileRelevent";
			}
			return null;
		}
	}
	
	//Simulates the actual firing of a rule
	private class RunRuleEngine {
		
		public String fireRule(String pageName, PageData data) {
			
			if (pageName.equals("RuleFile1")) {
				if ("true".equals(data.getData().get("Q1"))) {
					return GRANTED;
				} else {
					return GO_TO_NEXT_PAGE;
				}
			} else if (pageName.equals("RuleFileRelevent")) {
				
				if (data.getData().isEmpty()) {
					return FAILED_ARTICE_8;
				} else {
					return SUITABILE;
				}
			}
			return null;
		}
	}
	
}
