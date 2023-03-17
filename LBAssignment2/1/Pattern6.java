import java.util.Scanner;
class Pattern6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=2*n-2*i;k>=1;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
	}
}