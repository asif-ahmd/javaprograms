class RemoveDupl 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,5,2};
		//int remove=2;
		
		for (int i=0;i<=a.length-1 ;i++ )
		{
			/*if (a[i]==remove)
			{
				//continue;
			}
			else
			{
				System.out.print(a[i]+" ");
			}*/
		
		//System.out.println();
		int count=0;
		for (int j=i+1;j<=a.length-1 ;j++ )
		{
			if (a[i]==a[j])
			{
				count++;
			}
		}
		if (count==0)
		{
			System.out.print(a[i]+" ");
		}
	}
	}
}


