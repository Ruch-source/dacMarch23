import java.util.Scanner;
class Hollow_Inverted_Half_Pyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print("*");
		System.out.println();
		for(int i=n-1;i>=1;i--){
			System.out.print("*");
			for(int j=2;j<=i;j++){
				if(i==j)
					System.out.println("*");
				else
					System.out.print(" ");
			}
		}
		
		
	}
}