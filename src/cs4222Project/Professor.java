package cs4222Project;

public class Professor {
	private String ssn;
	private String name;
	private String gender;
	private int age;
	private String rank;
	private String specialty;
	private String worksIn;
	
	public Professor(String ssn, String name, String gender, int age, String rank, String specialty, String worksIn) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.rank = rank;
		this.specialty = specialty;
		this.worksIn = worksIn;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getWorksIn() {
		return worksIn;
	}

	public void setWorksIn(String worksIn) {
		this.worksIn = worksIn;
	}

}
