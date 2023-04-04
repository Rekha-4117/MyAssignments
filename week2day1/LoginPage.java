package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) {
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
		ch.findElement(By.linkText("Create Lead")).click();
		WebElement companyname = ch.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("ABCDEFG");
		WebElement firstname = ch.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Rekha");
		WebElement lastname = ch.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Moorthy");
		WebElement localname = ch.findElement(By.id("createLeadForm_firstNameLocal"));
		localname.sendKeys("Rekha");
		WebElement department = ch.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("IT");
		WebElement description = ch.findElement(By.id("createLeadForm_description"));
		description.sendKeys("welcome");
		WebElement email = ch.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("rekhakrishnan4117@gmail.com");
		Select state=new Select(ch.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		ch.findElement(By.className("smallSubmit")).click();
		//edit Lead//
		ch.findElement(By.linkText("Edit")).click();
		WebElement updatedescription = ch.findElement(By.id("updateLeadForm_description"));
		updatedescription.clear();
		WebElement note = ch.findElement(By.id("updateLeadForm_importantNote"));
		note.sendKeys("ABCDEFGHIJK");
		ch.findElement(By.name("submitButton")).click();
		//Duplicate//
		ch.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyname1 = ch.findElement(By.id("createLeadForm_companyName"));
		companyname1.clear();
		companyname1.sendKeys("TTTTTTTT");
		WebElement firstname1 = ch.findElement(By.id("createLeadForm_firstName"));
		firstname1.clear();
		firstname1.sendKeys("Thanish");
		ch.findElement(By.className("smallSubmit")).click();
		String title=ch.getTitle();
		System.out.println(title);
		
	
		
		  

	}

}
