package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.leafground.com/button.xhtml");
		ch.manage().window().maximize();
		ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ch.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String npage=ch.getTitle();
		System.out.println("The navigate page is:" +" "+ npage);
		ch.navigate().back();
		boolean b1 = ch.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println("The button is Enable:" +" "+ b1);
		ch.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		String npage1=ch.getTitle();
		System.out.println("The position of the submit page is:" +" "+ npage1);
		
	}

}
