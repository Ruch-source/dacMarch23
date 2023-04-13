package question.assignment;

public class UnderGraduate extends Student{
	private int creditHours;
	private final int  tuitionRate =500;
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public int getTuitionRate() {
		return tuitionRate;
	}
	
	void calculateTuition() {
		if(getGpa()>=3.5) 
			setTuition(this.creditHours*500-(this.getCreditHours()*500*0.2));
		else
			setTuition(this.creditHours*500);
	}
	public String toString() {
		return "Under Graduate ["+super.toString() + ", creditHours=" + creditHours + "]";
	}
	void printTuition() {
		System.out.println(toString());
	}
}
