class RemoveDup1 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,5,2};
		int remove=2;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			int count=0;
			for (int j=0;j<=a.length-1 ;j++ )
			{
				if (a[i]==a[j])
				{
					count++;
				}
			}
			if (count>1)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
}
