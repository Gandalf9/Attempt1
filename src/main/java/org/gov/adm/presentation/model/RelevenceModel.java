package org.gov.adm.presentation.model;

import java.util.HashMap;

public class RelevenceModel implements Model {
	
	String [] relevence;

	public String[] getRelevence() {
		return relevence;
	}

	public void setRelevence(String[] relevence) {
		this.relevence = relevence;
	}

	@Override
	public PageData getPageData() {
		PageData data = new PageData();
		HashMap<String, String> hashData = new HashMap<String, String>();
		for (int i = 0; i < relevence.length; i++) {
			hashData.put("Q1."+i, relevence[i]);
		}
		data.setData(hashData);
		return data;
	}

	@Override
	public PageName getPageName() {
		return Model.PageName.RELEVENT;
	}
	
}
