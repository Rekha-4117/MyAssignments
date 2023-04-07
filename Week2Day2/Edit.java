package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

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
		ch.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rekha");
		ch.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		String title=ch.getTitle();
		System.out.println(title);
		ch.findElement(By.xpath("//a[text()='Edit']")).click();
		String cname= ch.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getAttribute("value");
		System.out.println("Previous Company Name:" +" "+ cname);
		ch.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		ch.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("BNP");
		ch.findElement(By.xpath("//input[@value='Update']")).click();
		WebElement updatedcname1 = ch.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String updatedcname=updatedcname1.getText();
		System.out.println("Updated company name:" +" "+ updatedcname);
	}

}
