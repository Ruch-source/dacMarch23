package question.assignment;

public class Graduate extends Student{
	private  int creditHours;
	private double researchFee;
	private final int  tuitionRate =1000;
	public int getTuitionRate() {
		return tuitionRate;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public double getResearchFee() {
		return researchFee;
	}
	public void setResearchFee(double researchFee) {
		this.researchFee = researchFee;
	}

	void calculateTuition() {
		if(this.researchFee>=5000)
			setTuition(this.creditHours*tuitionRate-(this.creditHours*tuitionRate*0.1));
		else
			setTuition(this.creditHours*tuitionRate);
	}
	@Override
	public String toString() {
		return "Graduate ["+super.toString() + this.creditHours + ", researchFee=" + this.researchFee + ", tuitionRate=" + this.tuitionRate+ "]";
	}
	void printTuition() {
		System.out.println(this.toString());
	}
	
}
