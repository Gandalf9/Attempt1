package org.gov.adm.presentation.model;


public interface Model {

	public enum PageName {HOME_PAGE, RELEVENT, SUITABILITY};
	
	PageData getPageData();
	PageName getPageName();
}
