import java.util.Scanner;
class Pattern16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
			for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			System.out.print("*");
			for(int j=3;j<=i;j++)
				System.out.print(" ");
			if(i>1)
				System.out.println("*");
			else
				System.out.println();
		}
		for(int i=1;i<=n;i++)
			System.out.print("*");
		
	}
}