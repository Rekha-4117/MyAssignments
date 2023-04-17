package week3day2;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText;

public class RemoveDuplicates {
	

	public static void main(String[] args){
			String text="We learn java basics as part of java sessions in java week1";
			String drtext1="";
			System.out.println("The original string is:" +" "+ text);
			for	(int i=0;i<text.length();i++)
				{
				int j=0;
				for(j=0;j<i;j++)
				{
					
					 if(text.charAt(i)==text.charAt(j))
					 {	 
						 break;
					 }
				}
				if(i==j)
				{
					drtext1 +=text.charAt(i);
				}
				}
			System.out.println("After deleting the duplicated string:" +" "+ drtext1);
				}
				}
				

				


