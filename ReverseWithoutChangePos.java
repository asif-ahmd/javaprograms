import java.util.Scanner;

class ReverseWithoutChangePos 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String s1=scan.nextLine();
		String[] s2=s1.split(" ");//0 index hello 1 index world
		for (int i=0;i<=s2.length-1 ;i++)//String array loop
		{
			String s3=s2[i];//string array index value asign to object
			for (int j=s3.length()-1;j>=0 ;j-- )//String object reverse  loop
			{
				System.out.print(s3.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
