package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		ch.findElement(By.xpath("//span[text()='Email']")).click();
		WebElement email= ch.findElement(By.name("emailAddress"));
		email.sendKeys("rekhakrishnan4117@gmail.com");
		ch.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement leadfname1 = ch.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		String leadfname=leadfname1.getText();
		WebElement leadlname1 = ch.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a"));
		String leadlname=leadlname1.getText();
		System.out.println(leadfname +" "+ leadlname);
		Thread.sleep(2000);
		ch.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		ch.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String duplicate=ch.getTitle();
		System.out.println(duplicate);
		ch.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String viewlead=ch.getTitle();
		System.out.println(viewlead);
		WebElement viewfname = ch.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String vfname=viewfname.getText();
		WebElement viewlname = ch.findElement(By.xpath("//span[@id='viewLead_lastName_sp']"));
		String vlname=viewlname.getText();
		System.out.println(vfname +" "+ vlname);
		
		
		
		
	}

}