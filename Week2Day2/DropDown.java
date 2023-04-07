package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.leafground.com/select.xhtml");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Select s1 = new Select(ch.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		s1.selectByIndex(1);
		ch.findElement(By.xpath("//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']")).click();
		ch.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(500);
		ch.findElement(By.xpath("//label[text()='Select City']/following-sibling::div")).click();
		ch.findElement(By.xpath("//li[text()='Chennai']")).click();
		ch.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		ch.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		ch.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[3]")).click();
		ch.findElement(By.xpath("//li[text()='English']")).click();
		ch.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[4]")).click();
		ch.findElement(By.xpath("//li[text()='Two']")).click();
		ch.close();
	}

}
