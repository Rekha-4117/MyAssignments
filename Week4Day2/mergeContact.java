package Week4Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("http://leaftaps.com/opentaps/control/login");
		WebElement username = cd.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		WebElement password=cd.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Contacts")).click();
		cd.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		cd.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Thread.sleep(3000);
		Set<String> windowHs = cd.getWindowHandles();
		 List<String> whs=new ArrayList<String>(windowHs);
		 cd.switchTo().window(whs.get(1));
		 Thread.sleep(3000);
		cd.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();
		cd.switchTo().window(whs.get(0));
		Thread.sleep(3000);
		cd.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Thread.sleep(3000);
		Set<String> windowHs1 = cd.getWindowHandles();
		 List<String> whs1=new ArrayList<String>(windowHs1);
		 cd.switchTo().window(whs1.get(1));
		 Thread.sleep(3000);
		cd.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[2]/a")).click();
		cd.switchTo().window(whs1.get(0));
		cd.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert=cd.switchTo().alert();
		alert.accept();
		System.out.println(cd.getTitle());
	}

}
