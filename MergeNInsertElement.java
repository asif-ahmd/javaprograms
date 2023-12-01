class MergeNInsertElement 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5};
		int [] b={6,7,8,9,0};
		int [] c=new int[a.length+b.length];
		System.out.println(c.length);
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
		for (int i=c.length-2;i>=0 ;i-- )
		{
			c[i+1]=c[i];
		}
		c[0]=546;
		for (int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}
