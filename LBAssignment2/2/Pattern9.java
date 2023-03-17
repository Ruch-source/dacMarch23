import java.util.Scanner;
class Pattern9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=1;i<n;i++){
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=i;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}