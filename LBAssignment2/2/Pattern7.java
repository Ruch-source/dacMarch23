import java.util.Scanner;
class Pattern7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		int j=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			
			for(int k=1;k<=n-j+i;k++)
				System.out.print("*");
			System.out.println();
		}
		int i=0,l=0;

		for(i=n-1;i>=1;i--){
			for(l=n;l>i;l--)
				System.out.print(" ");
			for(int k=1;k<=i+l-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}