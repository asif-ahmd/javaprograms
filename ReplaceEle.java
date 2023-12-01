class ReplaceEle 
{
	public static void main(String[] args) 
	{
		String s1="baahubali";
		char[] ch=s1.toCharArray();
		for (int i=0;i<=ch.length-1 ;i++ )
		{
			if (ch[i]=='a')
			{
				ch[i]='@';
			}
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}
