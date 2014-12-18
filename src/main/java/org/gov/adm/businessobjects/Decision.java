package org.gov.adm.businessobjects;

public class Decision {

	private int id;
	private Article8Section article8Section;
	private XSection xSection;
	
	public Decision() {
		article8Section = new Article8Section();
		xSection = new XSection();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Article8Section getArticle8Section() {
		return article8Section;
	}

	public void setArticle8Section(Article8Section article8Section) {
		this.article8Section = article8Section;
	}

	public XSection getxSection() {
		return xSection;
	}

	public void setxSection(XSection xSection) {
		this.xSection = xSection;
	}
}
