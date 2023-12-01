class  ReverseStringWithoutPos1
{
	public static void main(String[] args) 
	{
		String s1="Hello How Are you";
		String [] s2=s1.split(" ");
		String s3="";
		for (int i=0;i<=s2.length-1 ;i++ )
		{
			if (i%2==0)
			{
				s3=s2[i];
				for (int j=s3.length()-1;j>=0 ;j-- )
				{
					System.out.print(s3.charAt(j));
				}
			}
			else
			{
				System.out.print(s2[i]);
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
