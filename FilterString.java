class FilterString 
{
	public static void main(String[] args) 
	{
		String s1="Jspiders@1234Jsp";
		String s2="";
		String s3="";
		String s4="";
		for (int i=0;i<=s1.length()-1 ;i++ )
		{
			char ch=s1.charAt(i);
			if ((ch>='a' && ch<='z'||ch>='A' && ch<='Z'))
			{
				s2=s2+ch;
			}
			else if (ch>='0' && ch<='9')
			{
				s3=s3+ch;
			}
			else
			{
				s4=s4+ch;
			}
			
		}
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
