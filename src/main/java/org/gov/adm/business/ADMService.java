package org.gov.adm.business;

import org.gov.adm.businessobjects.GrantAsylumSubSection;
import org.gov.adm.businessobjects.RelevenceSubSection;

public interface ADMService {
	
	String submitGrantSubSection(GrantAsylumSubSection section);
	String submitRelevenceSubSection(RelevenceSubSection section);
	
}
