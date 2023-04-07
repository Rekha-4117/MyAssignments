package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		ch.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
		Thread.sleep(500);
		ch.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::div)[19]")).click();
		ch.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean enab = ch.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		System.out.println("The Checkbox is disabled:" +" "+ enab);
		ch.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		ch.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible'])[22]"));
		Thread.sleep(1000);
		ch.findElement(By.xpath("(//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'])[1]//div//div/following-sibling::div")).click();
		ch.findElement(By.xpath("(//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'])[2]//div//div/following-sibling::div")).click();
		ch.findElement(By.xpath("(//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'])[3]//div//div/following-sibling::div")).click();
		ch.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
}
}
