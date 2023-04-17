package Week2Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.log.model.ViolationSetting.Name;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.leafground.com/checkbox.xhtml");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ch.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Thread.sleep(500);
		ch.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		ch.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(500);
		ch.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::div)[19]")).click();
		ch.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean enab = ch.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		System.out.println("The Checkbox is disabled:" +" "+ enab);
		Thread.sleep(2000);
		ch.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']/span")).click();
		Thread.sleep(2000);
		WebElement lon = ch.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//label)[2]"));
		ch.executeScript("arguments[0].click();",lon);
		WebElement par = ch.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//label)[3]"));
		ch.executeScript("arguments[0].click();",par);
		Thread.sleep(2000);
		WebElement rome = ch.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//label)[7]"));
		ch.executeScript("arguments[0].click();",rome);
		WebElement ams = ch.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//label)[9]"));
		ch.executeScript("arguments[0].click();",ams);
		ch.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	}
	}
