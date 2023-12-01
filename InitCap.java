class InitCap 
{
	public static void main(String[] args) 
	{
		String s1="javalibrary";
		String s2=s1.substring(0,1).toUpperCase();
		String s3=s1.substring(1,s1.length());
		System.out.println(s2.concat(s3));
		//System.out.println(s2);
	}
}
