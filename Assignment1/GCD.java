class GCD{
	public static void main(String []args){
		int a=12,b=18;
		int small;
		int res=1;
		if(a<b)
			small=a;
		else
			small=b;
		for(int i=small;i>=1;i--){
			if(a%i==0 && b%i==0){
				res=i;
				break;
			}
		}
		System.out.println(res);
	}
}