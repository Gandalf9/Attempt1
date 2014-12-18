package org.gov.adm.respository;

import org.gov.adm.businessobjects.Decision;
import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;

public interface SectionRepository {
	
	Decision persistGrantAsylumSubSection(int decisionId, GrantAsylumSubSection section);
	Decision persistRelevenceSubSection(int decisionId, RelevenceSubSection section);
}
