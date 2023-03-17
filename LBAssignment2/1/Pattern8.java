import java.util.Scanner;
class Pattern8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter height:");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			
			for(int k=n+1-i;k<=n;k++)
				System.out.print(k+" ");
			System.out.println();
		}
		
	}
}