package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.leafground.com/input.xhtml");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ch.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]")).sendKeys("Rekha");
		ch.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys("India");
		WebElement textbox = ch.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']"));
		boolean b1=textbox.isEnabled();
		System.out.println("The textbox is enable:" +" "+ b1);
		ch.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String text = ch.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println("The retrieved text is:" +" "+ text);
		ch.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("sdhvfdhvf@gmail.com");
		ch.findElement(By.xpath("//textarea[@class='ui-inputfield ui-inputtextarea ui-widget ui-state-default ui-corner-all ui-inputtextarea-resizable']")).sendKeys("Hi");
		ch.findElement(By.xpath("//div[@class='ql-editor ql-blank']/p")).sendKeys("jbfsdjkfbsjdkb");
		ch.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]")).sendKeys(Keys.ENTER);
		boolean popup = ch.findElement(By.xpath("//span[text()='Age is mandatory']")).isDisplayed();
		System.out.println("Pop Message:" +" "+ popup);
		ch.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[3]")).sendKeys("Babu Manickam");
		ch.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Rekha");
		ch.findElement(By.xpath("//li[text()='2']")).click();
		Thread.sleep(500);
		ch.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		boolean keyboard = ch.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).isDisplayed();
		System.out.println("Keyboard appears when click:" +" "+ keyboard);
		Boolean toolbar = ch.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).isDisplayed();
		System.out.println("Custom tool is there:" +" "+ toolbar);
}
}