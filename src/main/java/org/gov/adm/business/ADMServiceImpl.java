package org.gov.adm.business;

import org.gov.adm.businessobjects.HomePageRuleResult;
import org.gov.adm.presentation.model.HomePageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ADMServiceImpl implements ADMService {

//	@Autowired
//	private SubSectionRepo subSectionRepo;
	
	@Autowired
	private RuleEngine ruleEngine;
	
//	@Autowired
//	private RuleRepository ruleRepo;
	
	@Autowired PageFlowEngine pageEngine;
	
	@Override
	public String submitHomePage(HomePageModel data) {
		
//		subSectionRepo.persistHomePageData(data);
		
		HomePageRuleResult result = ruleEngine.fireRuleForHomePageData(data);
//		ruleRepo.persistHomePageResult(result);
		
		return pageEngine.getNextPage(result);
		
	}

}
