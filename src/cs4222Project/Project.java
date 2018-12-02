package cs4222Project;

import java.sql.Date;

public class Project {
	private String projNo;
	private String sponsor;
	private String stDate;
	private String edDate;
	private String budget;
	private String pricipalInvestigator;
	
	public Project(String projNo, String sponsor, String stDate, String edDate, String budget, String pi) {
		super();
		this.projNo = projNo;
		this.sponsor = sponsor;
		this.stDate = stDate;
		this.edDate = edDate;
		this.budget = budget;
		this.pricipalInvestigator = pi;
	}
	
	public String getProjNo() {
		return projNo;
	}
	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getStDate() {
		return stDate;
	}
	public void setStDate(String stDate) {
		this.stDate = stDate;
	}
	public String getEdDate() {
		return edDate;
	}
	public void setEdDate(String edDate) {
		this.edDate = edDate;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getPricipalInvestigator() {
		return pricipalInvestigator;
	}
	public void setPricipalInvestigator(String pi) {
		this.pricipalInvestigator = pi;
	}
}
