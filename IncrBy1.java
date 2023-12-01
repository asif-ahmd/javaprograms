import java.util.Scanner;

class IncrBy1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size: ");
		int size=scan.nextInt();
		int [] a=new int[size];
		for (int i=0;i<=a.length-1 ;i++ )
		{
			a[i]=scan.nextInt()+1;
			//a[i]++;
			
		}
		for (int i=0;i<=a.length-1 ;i++ )
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
}
