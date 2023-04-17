package week3day2;

public class Students {
	public static void getStudentinfo(int id)
	{
		System.out.println("id:" +id);
	}
	public static void getStudentinfo(int id, String FName)
	{
		
		System.out.println("id:"+ id+ " "+ "Fname:" +FName);
	}
	public static void getStudentinfo(String email, String phone_no)
	{
		System.out.println("email:" + email+ " "+"phone_no:"+ phone_no);
		
	}
	

	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentinfo(101);
		st.getStudentinfo(101, "Rekha M.");
		st.getStudentinfo("rekhakrishna@gmail.com", "9789949717");
		
		
			}

}
