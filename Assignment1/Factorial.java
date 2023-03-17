import java.util.Scanner;
class Factorial{
	void Factorial(int n){
		int res=1;
		for(int i=1;i<=n;i++)
			res*=i;
		System.out.println(res);
	}
	public static void main(String args[]){
		Factorial f=new Factorial();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		f.Factorial(n);
		
	}
}