package org.gov.adm.presentation.model;

public class QuestionModel {

	private String quesitionText;
	private Class answerType;
	private Object answer;
	private String questionIdentifier;

	public String getQuesitionText() {
		return quesitionText;
	}

	public void setQuesitionText(String quesitionText) {
		this.quesitionText = quesitionText;
	}

	public Class getAnswerType() {
		return answerType;
	}

	public void setAnswerType(Class answerType) {
		this.answerType = answerType;
	}

	public Object getAnswer() {
		return answer;
	}

	public void setAnswer(Object answer) {
		this.answer = answer;
	}

	public String getQuestionIdentifier() {
		return questionIdentifier;
	}

	public void setQuestionIdentifier(String questionIdentifier) {
		this.questionIdentifier = questionIdentifier;
	}
}
