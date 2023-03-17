import java.util.Scanner;
lass LeapYear{
	void LeapYear(int year){
		if(year%4==0){
			if(year%100==0 && year%400!=0)
				System.out.println("not leapyear");
			else
				System.out.println("leapyear");
		}
		else
			System.out.println("not leapyear");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		LeapYear l=new LeapYear();
		l.LeapYear(year);
	}
}