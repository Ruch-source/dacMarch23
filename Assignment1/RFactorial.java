import java.util.Scanner;
class RFactorial{
	int Factorial(int n){
		if(n==1)
			return 1;
		else
			return n*Factorial(n-1);
	}
	public static void main(String args[]){
		RFactorial rf=new RFactorial();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(rf.Factorial(n));
	}
}