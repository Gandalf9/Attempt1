package org.gov.adm.businessobjects;

import java.util.List;

public class SubSection {

	private String name;

	private List<QuestionReference> questions;
	private List<DocumentationSnippits> snippits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<QuestionReference> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionReference> questions) {
		this.questions = questions;
	}

	public List<DocumentationSnippits> getSnippits() {
		return snippits;
	}

	public void setSnippits(List<DocumentationSnippits> snippits) {
		this.snippits = snippits;
	}
	
}
