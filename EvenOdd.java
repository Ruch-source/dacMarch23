import java.util.Scanner;
class EvenOdd{
	void checkEvenOdd(int n){
		if((n&1)==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
	public static void main(String args[]){
		EvenOdd e=new EvenOdd();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		e.checkEvenOdd(n);
		
		
	}
}