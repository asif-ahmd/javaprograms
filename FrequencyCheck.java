//aaaBBBBB
class  FrequencyCheck
{
	public static void main(String[] args) 
	{
		String s1="aaaBBBBB";
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
			int previouslyPresent=0;
			for (int k=0;k<i ;k++ )
			{
				if (s1.charAt(i)==s1.charAt(k))
				{
					previouslyPresent++;
				}
			}
			if (previouslyPresent==0)
			{
				System.out.print(s1.charAt(i)+""+count);
			}
			
			
		}
		System.out.println();
		
	}
}
