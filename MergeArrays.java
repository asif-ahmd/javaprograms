class MergeArrays 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7};// length is 7
		int [] b={8,9,10,11,12};// length 5
		int [] c=new int[a.length+b.length];
		//System.out.println(c.length);
		int j=0;
		for (int i=0;i<=c.length-1 ;i++ )
		{
			if (i<=a.length-1)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[j];
				j++;
			}
			System.out.print(c[i]+",");
		}
		System.out.println();
		
	}
}
