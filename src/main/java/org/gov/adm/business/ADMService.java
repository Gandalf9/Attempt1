package org.gov.adm.business;

import org.gov.adm.businessobjects.ChildSubSection;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.PartnerSubSection;
import org.gov.adm.businessobjects.PrivateLifeSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.gov.adm.businessobjects.SuitabilitySubSection;

public interface ADMService {
	
	String submitGrantSubSection(GrantAsylumSubSection section);
	String submitRelevenceSubSection(RelevenceSubSection section);
	String submitSuitabilitySubSection(SuitabilitySubSection section);
	String submitChildSubSection(ChildSubSection section);
	String submitPartnerSubSection(PartnerSubSection section);
	String submitPrivateLifeSubSection(PrivateLifeSubSection section);
	
}
