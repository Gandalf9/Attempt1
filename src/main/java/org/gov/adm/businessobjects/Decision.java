package org.gov.adm.businessobjects;

import java.util.Map;

public class Decision {

	private int id;
	private String currentSection;
	private Map<String, Section> sections;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurrentSection() {
		return currentSection;
	}

	public void setCurrentSection(String currentSection) {
		this.currentSection = currentSection;
	}

	public Map<String, Section> getSections() {
		return sections;
	}

	public void setSections(Map<String, Section> sections) {
		this.sections = sections;
	}
}
