package week3day2;

public class oddIndexToUppercase {
	

	public static void main(String[] args) {
		String test="changeme";
		System.out.println(test);
		String otest="";
		char[] k=test.toCharArray();
		
		
		for(int j=0;j<k.length;j++)
		{
			if(j%2==1)
			{
				String otest1=otest+test.charAt(j);
				String Upper=otest1.toUpperCase();
				System.out.print(Upper);
				
			}
			else
			{
				String otest1=otest+test.charAt(j);
				String Lower=otest1.toLowerCase();
				System.out.print(Lower);
		}
			
	}
		
	}
}
	


