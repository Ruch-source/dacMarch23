import java.util.Scanner;
class Hollow_Full_Pyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		
			for(int j=n;j>i;j--)
				System.out.print(" ");
			
			System.out.print("*");
			for(int k=1;k<2*i;k++)
				System.out.print(" ");
			if(i>0)
				System.out.println("*");
			else
				System.out.println();		
		}
		for(int i=0;i<=n;i++)
			System.out.print("* ");
		
	}
}