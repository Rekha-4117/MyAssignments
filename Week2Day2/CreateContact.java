package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		ch.findElement(By.linkText("Contacts")).click();
		ch.findElement(By.linkText("Create Contact")).click();
		WebElement firstname = ch.findElement(By.id("firstNameField"));
		firstname.sendKeys("Rekha");
		WebElement lastname = ch.findElement(By.id("lastNameField"));
		lastname.sendKeys("Moorthy");
		WebElement localfname = ch.findElement(By.id("createContactForm_firstNameLocal"));
		localfname.sendKeys("Thanish");
		WebElement locallname = ch.findElement(By.id("createContactForm_lastNameLocal"));
		locallname.sendKeys("krishnan");
		WebElement department = ch.findElement(By.id("createContactForm_departmentName"));
		department.sendKeys("IT");
		WebElement description = ch.findElement(By.id("createContactForm_description"));
		description.sendKeys("welcome");
		WebElement email = ch.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("rekhakrishnan4117@gmail.com");
		Select state=new Select(ch.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		ch.findElement(By.xpath("//input[@value='Create Contact']")).click();
		ch.findElement(By.linkText("Edit")).click();
		WebElement editdescription = ch.findElement(By.id("updateContactForm_description"));
		editdescription.clear();
		WebElement impnote = ch.findElement(By.id("updateContactForm_importantNote"));
		impnote.sendKeys("XXXXXXXXX");
		ch.findElement(By.xpath("//input[@value='Update']")).click();
		String title=ch.getTitle();
		System.out.println(title);
		
		
		
		
		
		
	}

}
