package week3day2;

import java.util.Arrays;

public class EvenReverse {

	public static void main(String[] args) {
		String text="I am a software tester";
		String[] words=text.split(" ");
				
					for(int i=0;i<=words.length-1;i++)
					{
						if(i%2!=0)
						{
						char[] word=words[i].toCharArray();
				for(int j=word.length-1;j>=0;j--)
					{
						
			System.out.println(word[j]);
	}
			
	}
						else
						{
							System.out.print(words[i]);
						}
						
	}
}
}
	
		
