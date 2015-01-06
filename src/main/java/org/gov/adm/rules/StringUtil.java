package org.gov.adm.rules;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
	
	private List<String> listOfStrings = new ArrayList<String>();

	public void addString(String str) {
		listOfStrings.add(str);
	}
	
	public List<String> getStrings() {
		return listOfStrings;
	}
}
