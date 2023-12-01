class BubbleSort 
{
	public static void main(String[] args) 
	{
		int [] a={42,34,2,11,87,3,99};//length7
		for (int cycle=1;cycle<=a.length ;cycle++ )
		{
			for (int i=0;i<=a.length-2 ;i++ )
			{
				if (a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
