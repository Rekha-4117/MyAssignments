package week1.day1;

class Student {
	String studentName="Thanish G.R.";
    int rollNo=5630;
    String collegeName="Velamal college of arts and science";
    int markScored=500;
    float cgpa=8.3f;
}
    public class Report{	
	
	public static void main(String[] args) {
		Student st=new Student();
		System.out.println(st.studentName);
		System.out.println(st.rollNo);
		System.out.println(st.collegeName);
		System.out.println(st.markScored);
		System.out.println(st.cgpa);
	}

}
