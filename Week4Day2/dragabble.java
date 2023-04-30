package Week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragabble {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://jqueryui.com/draggable");
		cd.switchTo().frame(0);
		WebElement drag = cd.findElement(By.xpath("//div[@id='draggable']"));
		Actions ac=new Actions(cd);
		ac.dragAndDropBy(drag, 50, 100).perform();
		

	}

}
