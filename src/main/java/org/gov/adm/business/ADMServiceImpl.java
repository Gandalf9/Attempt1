package org.gov.adm.business;

import org.gov.adm.presentation.model.Model;
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
	public String submit(Model data) {
		
		
		String state = ruleEngine.fireRule(data);
		
		return pageEngine.getNextPage(state, data);
		
	}

}
