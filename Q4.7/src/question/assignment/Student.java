package question.assignment;

public class Student {
	private String name;
	 private int  id;
	 private String major;
	 private double gpa;
	 private double tuition;
	 
	public double getTuition() {
		return tuition;
	}
	public void setTuition(double tuition) {
		this.tuition = tuition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	void calculateTuition() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", major=" + major + ", gpa=" + gpa + ", tuition=" + tuition
				+ "]";
	}
	void printTuition() {
		
	}
}
