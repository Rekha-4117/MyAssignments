package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("http://leaftaps.com/opentaps/control/main");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ch.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		ch.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		ch.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		ch.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		ch.findElement(By.xpath("//a[text()='Leads']")).click();
		

	}

}
