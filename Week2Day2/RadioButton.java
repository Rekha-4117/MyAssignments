package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.leafground.com/radio.xhtml");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ch.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		Thread.sleep(500);
		ch.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[12]")).click();
		Thread.sleep(500);
		WebElement df = ch.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		System.out.println("The default  select radio button is:" +" "+ df.getText());
		ch.findElement(By.xpath("//label[text()='1-20 Years']")).click();
	
	}

}
