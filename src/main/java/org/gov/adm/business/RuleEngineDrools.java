package org.gov.adm.business;

import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.StatelessKnowledgeSession;
import org.drools.runtime.rule.FactHandle;
import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumData;
import org.gov.adm.rules.RuleLookUp;
import org.gov.adm.rules.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class RuleEngineDrools  {
	@Autowired
	private RuleLookUp ruleLookUp1;
	//to do read from properties file will do later 
	public static final String  GrantAsylumDRL="org/gov/adm/rules/Asylum.drl";
	 public StringUtil util = new StringUtil();
	
	
	public String fireRuleGrantAsylum(Decision decision) {
		GrantAsylumData grantAsylumData= decision.getArticle8Section().getGrantAsylumSubSection().getGrantAsylumData();
		RuleLookUp ruleLookUp= new RuleLookUp(); 
		//ruleLookUp.getSession(GrantAsylumDRL);
		StatefulKnowledgeSession session = ruleLookUp.getSession(GrantAsylumDRL);
		session.setGlobal("util", util);
		FactHandle purchaseFact = session.insert(grantAsylumData);
        session.fireAllRules();
        System.out.println("----------------");
		
		return null;
	}

	
	public String fireRelevence(Decision decision) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String fireSuitability(Decision decision) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String fireChild(Decision decision) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String firePartner(Decision decision) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String firePrivateLife(Decision decision) {
		// TODO Auto-generated method stub
		return null;
	}
	public StringUtil getUtil() {
		return util;
	}
}
