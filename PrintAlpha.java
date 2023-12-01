class PrintAlpha 
{
	public static void main(String[] args) 
	{
		String s1="J@A$V#A";
		for (int i=0;i<=s1.length()-1 ;i++ )
		{
			//char ch=s1.charAt(i);
			/*if (Character.isAlphabetic(ch))
			{
				System.out.print(ch);
			}*/


			/*if ((ch>='a' && ch<='z' || ch>='A' && ch<='Z'))
			{
				System.out.print(ch);
			}*/if (i%2==0)
			{
				System.out.print(s1.charAt(i));
			}
		}
		System.out.println();
	}
}
