import java.util.Scanner;
class Pattern6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter height:");
		int i=0,j=0;
		int n=sc.nextInt();
		for(i=n;i>=1;i--){
			for(j=n;j>i;j--)
				System.out.print(" ");
			for(int k=1;k<=i+j-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}