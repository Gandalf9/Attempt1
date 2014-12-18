package org.gov.adm.business;

import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.gov.adm.respository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ADMServiceImpl implements ADMService {

	@Autowired
	private SectionRepository subSectionRepo;
	
	@Autowired
	private RuleEngine ruleEngine;
	
//	@Autowired
//	private RuleRepository ruleRepo;
	
	@Autowired NavigationEngine pageEngine;
	
	@Override
	public String submitGrantSubSection(GrantAsylumSubSection section) {
		
		//Persist the sectionData and retrieve a Decision
		Decision decision = subSectionRepo.persistGrantAsylumSubSection(1, section);
		
		String state = ruleEngine.fireRuleGrantAsylum(decision);
		return pageEngine.submitGrantAsylum(state, decision);
	}

	@Override
	public String submitRelevenceSubSection(RelevenceSubSection section) {
		//Persist the sectionData and retrieve a Decision
		Decision decision = subSectionRepo.persistRelevenceSubSection(1, section);
		
		String state = ruleEngine.fireRuleGrantAsylum(decision);
		return pageEngine.submitRelevence(state, decision);
	}

}
