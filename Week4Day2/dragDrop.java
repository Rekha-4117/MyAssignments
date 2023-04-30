package Week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://leafground.com/drag.xhtml");
		WebElement drag1 = cd.findElement(By.xpath("//span[text()='Drag and Drop']"));
		WebElement drop1 = cd.findElement(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all ui-draggable ui-draggable-handle']"));
		Actions ac=new Actions(cd);
		Thread.sleep(1000);
		ac.dragAndDrop(drag1, drop1).perform();
		WebElement drsource = cd.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drtarget = cd.findElement(By.xpath("//span[text()='Droppable Target']"));
		ac.dragAndDrop(drsource, drtarget).perform();
		
	}

}
