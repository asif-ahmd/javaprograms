import java.util.*;

class SortArrayinbuiltFun
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();//array size input
		int [] a=new int[size];//array object
		System.out.println("enter array elements");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			a[i]=scan.nextInt();//assigning values at runtime
		}
		Arrays.sort(a);//in-built function to sort array elements
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
