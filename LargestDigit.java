class LargestDigit 
{
	public static void main(String[] args) 
	{
		int n=54673;
		int large=0;
		while (n!=0)
		{
			int digit=n%10;
			if (large<digit)
			{
				large=digit;
				
			}
			n=n/10;
		}
		System.out.println(large);
	}
}
