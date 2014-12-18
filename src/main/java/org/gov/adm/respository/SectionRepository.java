package org.gov.adm.respository;

import org.gov.adm.businessobjects.ChildSubSection;
import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.PartnerSubSection;
import org.gov.adm.businessobjects.PrivateLifeSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;
import org.gov.adm.businessobjects.SuitabilitySubSection;

public interface SectionRepository {
	
	Decision persistGrantAsylumSubSection(int decisionId, GrantAsylumSubSection section);
	Decision persistRelevenceSubSection(int decisionId, RelevenceSubSection section);
	Decision persistSuitabilitySubSection(int decisionId, SuitabilitySubSection section);
	Decision persistChildSubSection(int decisionId, ChildSubSection section);
	Decision persistPrivateLifeSubSection(int decisionId, PrivateLifeSubSection section);
	Decision persistPartnerSubSection(int decisionId, PartnerSubSection section);
}
