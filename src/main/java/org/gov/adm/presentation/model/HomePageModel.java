package org.gov.adm.presentation.model;

import java.util.HashMap;

public class HomePageModel implements Model {
	
	private boolean qualify;

	public boolean isQualify() {
		return qualify;
	}

	public void setQualify(boolean qualify) {
		this.qualify = qualify;
	}

	@Override
	public PageData getPageData() {
		PageData data = new PageData();
		HashMap<String, String> hashData = new HashMap<String, String>();
		hashData.put("Q1", Boolean.toString(qualify));
		data.setData(hashData);
		return data;
	}

	@Override
	public PageName getPageName() {
		return Model.PageName.HOME_PAGE;
	}
}
