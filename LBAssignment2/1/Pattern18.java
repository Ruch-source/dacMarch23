import java.util.Scanner;
class Pattern18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			char c='A';
			for(int j=n;j>=i;j--)
				System.out.print(c+++" ");
			System.out.println();
		}
		
	}
}