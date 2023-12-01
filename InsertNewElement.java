class InsertNewElement 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6};//length 7
		int [] b=new int[a.length+1];
		int index=2;
		int newValue=100;
		for (int i=b.length-2;i>=index ;i-- )
		{
			b[i+1]=a[i];
		}
		b[index]=newValue;
		
		for (int i=0;i<index ;i++ )
		{
			b[i]=a[i];
		}
		for (int i=0;i<=b.length-1 ;i++ )
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		
	}
}
