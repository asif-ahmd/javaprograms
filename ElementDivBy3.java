class ElementDivBy3 
{
	public static void main(String[] args) 
	{
		int [] a=new int[5];
		a[0]=34;
		a[1]=78;
		a[2]=21;
		a[3]=97;
		a[4]=132;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			if (a[i]%3==0 && a[i]%7==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
}
