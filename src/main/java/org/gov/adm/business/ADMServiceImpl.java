package org.gov.adm.business;

import org.gov.adm.businessobjects.ChildSubSection;
import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.PartnerSubSection;
import org.gov.adm.businessobjects.PrivateLifeSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.gov.adm.businessobjects.SuitabilitySubSection;
import org.gov.adm.respository.RuleRepository;
import org.gov.adm.respository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ADMServiceImpl implements ADMService {

	@Autowired
	private SectionRepository subSectionRepo;
	
	@Autowired
	private RuleEngine ruleEngine;
	
	//@Autowired
	//private RuleRepository ruleRepo;
	
	@Autowired 
	private NavigationEngine pageEngine;
	
	@Override
	public String submitGrantSubSection(GrantAsylumSubSection section) {
		
		//Persist the sectionData and retrieve a Decision
		Decision decision = subSectionRepo.persistGrantAsylumSubSection(1, section);
		
		//String state = ruleEngine.fireRuleGrantAsylum(decision);
		RuleEngineDrools ruleEngineDrools = new RuleEngineDrools();
		ruleEngineDrools.fireRuleGrantAsylum(decision);
		String state= ruleEngineDrools.getUtil().getStrings().get(0);
		System.out.println("Stste Returned----->"+state);
		
		//If the page returned is a document page
		//Go to the document store and retreive relevent documentation
		//Send documentation to the front end to be edited
		return pageEngine.submitGrantAsylum(state, decision);
	}
	
	//METHOD - submitGrantSubSectionDocumentation
	//Store the documentation against the decision in a sensible place
	
	//METHOD - produceDocumentation
	// Call the publishing service

	@Override
	public String submitRelevenceSubSection(RelevenceSubSection section) {
		//Persist the sectionData and retrieve a Decision
		Decision decision = subSectionRepo.persistRelevenceSubSection(1, section);
		
		String state = ruleEngine.fireRuleGrantAsylum(decision);
		return pageEngine.submitRelevence(state, decision);
	}

	@Override
	public String submitSuitabilitySubSection(SuitabilitySubSection section) {
		//Persist the sectionData and retrieve a Decision
		Decision decision = subSectionRepo.persistSuitabilitySubSection(1, section);
		
		String state = ruleEngine.fireSuitability(decision);
		return pageEngine.submitSuitability(state, decision);
	}

	@Override
	public String submitChildSubSection(ChildSubSection section) {
		//Persist the sectionData and retrieve a Decision
		section.setCompleted(true);
		Decision decision = subSectionRepo.persistChildSubSection(1, section);
		
		String state = ruleEngine.fireChild(decision);
		return pageEngine.submitChild(state, decision);
	}

	@Override
	public String submitPartnerSubSection(PartnerSubSection section) {
		//Persist the sectionData and retrieve a Decision
		section.setCompleted(true);
		Decision decision = subSectionRepo.persistPartnerSubSection(1, section);
		
		String state = ruleEngine.firePartner(decision);
		return pageEngine.submitPartner(state, decision);
	}

	@Override
	public String submitPrivateLifeSubSection(PrivateLifeSubSection section) {
		//Persist the sectionData and retrieve a Decision
		section.setCompleted(true);
		Decision decision = subSectionRepo.persistPrivateLifeSubSection(1, section);
		
		String state = ruleEngine.firePrivateLife(decision);
		return pageEngine.submitPrivateLife(state, decision);		

	}

}
