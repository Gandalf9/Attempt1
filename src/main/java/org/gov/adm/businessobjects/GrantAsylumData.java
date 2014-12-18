package org.gov.adm.businessobjects;

public class GrantAsylumData {

	private String questionText;
	private boolean granted;

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public boolean isGranted() {
		return granted;
	}

	public void setGranted(boolean granted) {
		this.granted = granted;
	}
}
