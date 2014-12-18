package org.gov.adm.businessobjects;

public class PrivateLifeSubSection {
	
	private PrivateLifeData privateLifeData;
	private boolean completed;

	public PrivateLifeData getPrivateLifeData() {
		return privateLifeData;
	}

	public void setPrivateLifeData(PrivateLifeData privateLifeData) {
		this.privateLifeData = privateLifeData;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
