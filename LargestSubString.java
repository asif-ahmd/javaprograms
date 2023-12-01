class LargestSubString 
{
	public static void main(String[] args) 
	{
		String s1="I have got placed in Capgemini";
		String s2[]=s1.split(" ");
		String smallestSubString=s2[3];
		int minLength=s2[3].length();
		String largestSubString=s2[3];
		int maxLength=s2[3].length();
		for (int i=0;i<=s2.length-1 ;i++ )
		{
			if (minLength>s2[i].length())
			{
				minLength=s2[i].length();
				smallestSubString=s2[i];
			}
			if (maxLength<s2[i].length())
			{
				maxLength=s2[i].length();
				largestSubString=s2[i];
			}
		}
		System.out.println(smallestSubString+" "+minLength);
		//System.out.println(minLength );
		System.out.println(largestSubString+" "+maxLength);
		//System.out.println(maxLength );
	}
}
