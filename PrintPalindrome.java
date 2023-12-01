class PrintPalindrome 
{
	public static void main(String[] args) 
	{
		int[] a={19,11,21,22,121};
		System.out.println("palindrome number are: ");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			int temp=a[i];
			int rev=0;
			while (temp!=0)
			{
				int digit=temp%10;
				rev=rev*10+digit;
				temp=temp/10;
			}
			if (rev==a[i])
			{
				System.out.println(a[i]);
			}
		}
	}
}
