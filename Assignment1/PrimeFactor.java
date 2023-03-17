import java.util.Scanner;
class PrimeFactor{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int j=0;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				for(j=2;j<=i/2;j++){
					if(i%j==0)
						break;
				}
				if(j==i/2+1)
					System.out.print(i+" ");
			}	
		}
		//System.out.println(num);
	}
}