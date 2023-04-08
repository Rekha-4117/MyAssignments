package week3day1ass1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation am=new Automation();
		am.python();
		am.ruby();
		am.java();
		am.Selenium();

	}

	public void Selenium() {
		System.out.println("Selenium Tool");
		
	}

	public void java() {
		System.out.println("Java Language");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language");
		
	}

}
