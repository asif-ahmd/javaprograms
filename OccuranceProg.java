class  OccuranceProg
{
	public static void main(String[] args) 
	{
		String s1="aaabbbbbaaccff";
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for (int j=0;j<=s1.length()-1 ;j++ )
			{
				if (ch==s1.charAt(j))
				{
					count++;
				}
			}
			if (count>=1)
			{
				System.out.print(ch+""+count);
			}
		}
		System.out.println();
	}
}
