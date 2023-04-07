package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://en-gb.facebook.com/");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.linkText("Create new account")).click();
		WebElement fname =cd.findElement(By.name("firstname"));
		fname.sendKeys("Rekha");
		WebElement lname = cd.findElement(By.name("lastname"));
		lname.sendKeys("Moorthy");
		WebElement mobileno = cd.findElement(By.name("reg_email__"));
		mobileno.sendKeys("9789949717");
		WebElement pwd = cd.findElement(By.id("password_step_input"));
		pwd.sendKeys("Thanish@4117");
		Select bday=new Select(cd.findElement(By.id("day")));
		bday.selectByVisibleText("12");
		Select bmonth=new Select(cd.findElement(By.id("month")));
		bmonth.selectByIndex(6);
		Select byear=new Select(cd.findElement(By.id("year")));
		byear.selectByValue("1991");
		cd.findElement(By.xpath("//input[@name='sex']")).click();
		

	}

}
