class CharIndex 
{
	public static void main(String[] args) 
	{
		String s1="java library";
		char ch='i';
		for (int i=0;i<=s1.length()-1 ;i++ )
		{
			if (s1.charAt(i)==ch)
			{
				System.out.print("given char is present: "+s1.charAt(i)+" "+"char index is: "+i);
			}
		}
		System.out.println();

	}
}
