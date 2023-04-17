package week3day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int l1 = text1.length();
		int l2 = text2.length();
		if(l1==l2)
		{
			System.out.println("The length of the text1 and text2 is same:" +" "+l1);
		}
			else
			{
				System.out.println("The length of the text2 is not " +" "+ l2);
			}
		char[] i=text1.toCharArray();
		char[] j=text2.toCharArray();
		
		Arrays.sort(i);
		Arrays.sort(j);
		System.out.println(i);
		System.out.println(j);
		boolean result = Arrays.equals(i, j);
		if(result)
		{
			System.out.println("The given texts are anagram");
		}else
		{
			System.out.println("The given texts are not an anagram");
		}
			
		}

}
