class SmallestElement 
{
	public static void main(String[] args) 
	{
		int [] a={-23,-76,-89,-24,-100};
		int small=a[3];
		for (int i=0;i<=a.length-1 ;i++ )
		{
			if (small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}
}
