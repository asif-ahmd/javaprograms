class CompareArrays 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4};
		int [] b={1,2,6,4};
		int count=0;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			
			if (a[i]==b[i])
			{
				count++;
				continue;
			}
			else
			{
				System.out.println("not equal");
				break;
			}
		}
		if (count==a.length && count==b.length)
		{
			System.out.println("equal");
		}		
	}
}
