package org.gov.adm.businessobjects;

public class Article8Section {

	public GrantAsylumSubSection grantAsylumSubSection;
	public RelevenceSubSection relevenceSubSection;
	public SuitabilitySubSection suitabilitySubSection;
	public PartnerSubSection partnerSubSection;
	public PrivateLifeSubSection privateSubSection;
	public ChildSubSection childSubSection;

	public Article8Section() {
		grantAsylumSubSection = new GrantAsylumSubSection();
		relevenceSubSection = new RelevenceSubSection();
		suitabilitySubSection = new SuitabilitySubSection();
		partnerSubSection = new PartnerSubSection();
		privateSubSection = new PrivateLifeSubSection(); 
		childSubSection = new ChildSubSection();
	}
	
	public GrantAsylumSubSection getGrantAsylumSubSection() {
		return grantAsylumSubSection;
	}

	public void setGrantAsylumSubSection(GrantAsylumSubSection grantAsylumSubSection) {
		this.grantAsylumSubSection = grantAsylumSubSection;
	}

	public RelevenceSubSection getRelevenceSubSection() {
		return relevenceSubSection;
	}

	public void setRelevenceSubSection(RelevenceSubSection relevenceSubSection) {
		this.relevenceSubSection = relevenceSubSection;
	}

	public SuitabilitySubSection getSuitabilitySubSection() {
		return suitabilitySubSection;
	}

	public void setSuitabilitySubSection(SuitabilitySubSection suitabilitySubSection) {
		this.suitabilitySubSection = suitabilitySubSection;
	}

	public PartnerSubSection getPartnerSubSection() {
		return partnerSubSection;
	}

	public void setPartnerSubSection(PartnerSubSection partnerSubSection) {
		this.partnerSubSection = partnerSubSection;
	}

	public PrivateLifeSubSection getPrivateSubSection() {
		return privateSubSection;
	}

	public void setPrivateSubSection(PrivateLifeSubSection privateSubSection) {
		this.privateSubSection = privateSubSection;
	}

	public ChildSubSection getChildSubSection() {
		return childSubSection;
	}

	public void setChildSubSection(ChildSubSection childSubSection) {
		this.childSubSection = childSubSection;
	}
}
