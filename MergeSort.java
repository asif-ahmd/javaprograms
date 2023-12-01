class  MergeSort
{
	public static void main(String[] args) 
	{
		int [] a={5,3,9,6,1};
		int [] b={11,54,76,98,12};
		System.out.println("given array a is: ");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("given array b is: ");
		for (int i=0;i<=b.length-1 ;i++ )
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int [] c=new int[a.length+b.length];
		System.out.println("after merging given arrays: ");
		for (int i=0;i<=c.length-1 ;i++ )
		{
			if (i<=a.length-1)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("after sorting merged array");
		for (int i=0;i<=c.length-1 ;i++ )
		{
			for (int j=i+1;j<=c.length-1 ;j++ )
			{
				if (c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			
		}
		for (int i=0;i<=c.length-1 ;i++ )
		{
			System.out.print(c[i]+" ");
		}
	}
}
