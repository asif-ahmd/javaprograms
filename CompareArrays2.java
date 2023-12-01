import java.util.Arrays;
class CompareArrays2 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4};
		int [] b={1,2,3,4};
		if (Arrays.equals(a,b))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
