class OneToTen{
	int print(int n){
		if(n==1)
			return 1;
		else
		{
			
			print(n--);
			System.out.println(n);
			return 1;
		}

	}
	public static void main(String args[]){
		OneToTen o=new OneToTen();
		//o.print(10);
		System.out.println(o.print(10));
	}
}