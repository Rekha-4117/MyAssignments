package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ch=new ChromeDriver();
		ch.get("http://leaftaps.com/opentaps/control/main");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement username = ch.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		WebElement password=ch.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		ch.findElement(By.className("decorativeSubmit")).click();
		ch.findElement(By.linkText("CRM/SFA")).click();
		ch.findElement(By.linkText("Leads")).click();
		ch.findElement(By.linkText("Find Leads")).click();
		ch.findElement(By.xpath("//span[text()='Phone']")).click();
		WebElement countrycode = ch.findElement(By.name("phoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("+91");
		ch.findElement(By.name("phoneAreaCode")).sendKeys("44");
		ch.findElement(By.name("phoneNumber")).sendKeys("9884696887");
		ch.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		ch.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		ch.findElement(By.className("subMenuButtonDangerous")).click();
		ch.findElement(By.xpath("//a[text()='Find Leads']")).click();
		ch.findElement(By.xpath("//span[text()='Name and ID']")).click();
		ch.findElement(By.xpath("//input[@name='id']")).sendKeys("12126");
		ch.findElement(By.xpath("//button[text()='Find Leads']")).click();
		ch.close();
		
}

}