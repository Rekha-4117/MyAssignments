package Week4Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SlaesForce {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://qeagle-dev-ed.my.salesforce.com/");
		String parent = cd.getWindowHandle();
		cd.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		cd.findElement(By.id("password")).sendKeys("Leaf@1234");
		cd.findElement(By.id("Login")).click();
		cd.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHs = cd.getWindowHandles();
		List<String> whs=new ArrayList<String>(windowHs);
		System.out.println(whs.size());
		cd.switchTo().window(whs.get(1));
		cd.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String title = cd.getTitle();
		System.out.println(title);
		cd.switchTo().window(parent);
		cd.close();

	}

}
