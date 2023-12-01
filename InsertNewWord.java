class  InsertNewWord
{
	public static void main(String[] args) 
	{
		String s="Hello how are you";
		String [] s1=s.split(" ");
		String [] s2=new String[5];
		int len=s2.length-1;
		int index=1;
		String newWord="Smith";
		for (int i=len-1;i>=index ;i-- )
		{
			s2[i+1]=s1[i];
		}
		s1[index]=newWord;
		for (int i=0;i<=s2.length-1;i++ )
		{
			System.out.print(s2[i]);
		}
	}
}
