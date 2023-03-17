class LCM{
	public static void main(String []args){
		int a=12, b=18;
		int max,res=a*b;
		if(a>b)
			max=a;
		else
			max=b;
		for(int i=max;i<=a*b;i=i+max){
			if(i%a==0 && i%b==0){
				res=i;
				break;
			}
		}
		System.out.println(res);
	}
}