class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String s1="Mom";
		String s2="";
		for (int i=s1.length()-1;i>=0 ;i-- )
		{
			s2=s2+s1.charAt(i);
		}
		if (s2.equalsI gnoreCase(s1))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
	}
}
