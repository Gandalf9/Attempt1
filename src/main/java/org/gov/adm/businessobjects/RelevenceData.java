package org.gov.adm.businessobjects;

public class RelevenceData {

	private String questionText;
	private boolean childFlag;
	private boolean partnerFlag;
	private boolean privateFlag;

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public boolean isChildFlag() {
		return childFlag;
	}

	public void setChildFlag(boolean childFlag) {
		this.childFlag = childFlag;
	}

	public boolean isPartnerFlag() {
		return partnerFlag;
	}

	public void setPartnerFlag(boolean partnerFlag) {
		this.partnerFlag = partnerFlag;
	}

	public boolean isPrivateFlag() {
		return privateFlag;
	}

	public void setPrivateFlag(boolean privateFlag) {
		this.privateFlag = privateFlag;
	}
}
