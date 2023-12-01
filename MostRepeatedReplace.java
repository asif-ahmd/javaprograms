class MostRepeatedReplace 
{
	public static void main(String[] args) 
	{
		String s1="baahubali";
		int temp=0;//3
		char ch=' ';//a
		for (int i=0;i<=s1.length()-1 ;i++ )
		{
			int count=0;
			for (int j=0;j<=s1.length()-1 ;j++ )
			{
				if (s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if (count>temp)
			{
				temp=count;
				ch=s1.charAt(i);
			}
		}
		for (int i=0;i<=s1.length()-1 ;i++ )
		{
			char ch1=s1.charAt(i);
			if (ch==ch1)
			{
				ch1='@';
			}
			System.out.print(ch1);
		}
		System.out.println();

	}
}
