package org.gov.adm.businessobjects;

public class QuestionReference {

	private String questionId;
	private String questionText;
	private Object answer;
	private Class answerType;

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public Object getAnswer() {
		return answer;
	}

	public void setAnswer(Object answer) {
		this.answer = answer;
	}

	public Class getAnswerType() {
		return answerType;
	}

	public void setAnswerType(Class answerType) {
		this.answerType = answerType;
	}
}
