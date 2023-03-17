import java.util.Scanner;
class Pattern2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		char c='A';
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			c='A';
			for(int j=1;j<=i;j++)
				System.out.print(c++ +" ");
			System.out.println();
		}
		
	}
}