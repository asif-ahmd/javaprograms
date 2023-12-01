class CodeOfSeries 
{
	public static void main(String[] args) 
	{
		String s1="a3B5";
		char ch=' ';
		
		for (int i=0;i<=s1.length()-1 ;i++ )
		{
			int n=0;
			if ((s1.charAt(i)>='a' && s1.charAt(i)<='z')||(s1.charAt(i)>='A' && s1.charAt(i)<='Z'))
			{
				ch=s1.charAt(i);
			}
			else
			{
				n=(s1.charAt(i)-'0');
			}
			for (int j=0;j<n ;j++)
			{
				System.out.print(ch);
			}
		}
		System.out.println();
	}
}
