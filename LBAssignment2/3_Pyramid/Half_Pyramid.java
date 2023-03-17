import java.util.Scanner;
class Half_Pyramid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height:");
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			
			for(int k=1;k<=i;k++)
				System.out.print("* ");
			System.out.println();
		}
		
	}
}