class LargestElement 
{
	public static void main(String[] args) 
	{
		int [] a={-23,-76,-89,-24,-100};
		int large=a[3];//23---76---89---100
		for (int i=0;i<=a.length-1 ;i++ )
		{
			if (large<a[i])
			{
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
