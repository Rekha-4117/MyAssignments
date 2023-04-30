package Week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
		int size1 = cd.findElements(By.tagName("iframe")).size();
		cd.switchTo().frame(0);
		cd.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		Thread.sleep(5000);
		cd.switchTo().defaultContent();
		WebElement element1 = cd.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		cd.switchTo().frame(element1);
		cd.findElement(By.xpath("//button[text()='Count Frames']")).click();
		System.out.println("How many Frames in this page:" +" "+ size1 +" "+ "Frames");
		cd.switchTo().defaultContent();		
		Thread.sleep(3000);
		WebElement element = cd.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		cd.switchTo().frame(element);
		WebElement element3 = cd.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		cd.switchTo().frame(element3);
		Thread.sleep(4000);
		cd.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
	}

}
