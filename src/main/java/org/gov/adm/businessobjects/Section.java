package org.gov.adm.businessobjects;

import java.util.Map;

public class Section {

	private String name;
	private Map<String, SubSection> subsections;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, SubSection> getSubsections() {
		return subsections;
	}

	public void setSubsections(Map<String, SubSection> subsections) {
		this.subsections = subsections;
	}

}
