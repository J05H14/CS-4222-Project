package cs4222Project;

import java.sql.Date;

public class Project {
	private String projNo;
	private String sponsor;
	private Date stDate;
	private Date edDate;
	private String budget;
	private String pi;
	
	public Project(String projNo, String sponsor, Date stDate, Date edDate, String budget, String pi) {
		super();
		this.projNo = projNo;
		this.sponsor = sponsor;
		this.stDate = stDate;
		this.edDate = edDate;
		this.budget = budget;
		this.pi = pi;
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
	public Date getStDate() {
		return stDate;
	}
	public void setStDate(Date stDate) {
		this.stDate = stDate;
	}
	public Date getEdDate() {
		return edDate;
	}
	public void setEdDate(Date edDate) {
		this.edDate = edDate;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getPi() {
		return pi;
	}
	public void setPi(String pi) {
		this.pi = pi;
	}
}
