import java.util.Scanner;
class Pattern13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		int n=sc.nextInt();
		char c='A';
		for(int i=1;i<=n;i++){
			
			for(int k=n-i;k>=1;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
				System.out.print(c +" ");
			System.out.println();
			c++;
		}
		
	}
}