class Palindrome{
	public static void main(String[] args){
		int num=121;
		int res=0;
		int rem;
		int check=num;
		while(num!=0){
			rem=num%10;
			res=res*10+rem;
			num/=10;
			
		}
		
		if(res!=check)
			System.out.println("not Palindrome");
		else
			System.out.println("palindrome");
	}
}