package week3day2;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		int slength = s.length();
		
		for(int i=slength-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		System.out.println("The reversed string is:" + rev);
		}
		if(s.equals(rev))
		{
			System.out.println(s + " The given string is palindrome");
		}
		else
		{
			System.out.println(s + " The given string is not a palindrome");
		}
		
				}

}


