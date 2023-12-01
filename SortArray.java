class SortArray 
{
	public static void main(String[] args) 
	{
		int [] a={1,98,34,100,3,7};
		for (int i=0;i<=a.length-1 ;i++ )
		{
			for (int j=0;j<=a.length-1 ;j++ )
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.print(a[i]+" ");
		}

	}
}
