package Week4Day2;


import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://jqueryui.com/selectable");
		cd.switchTo().frame(0);
		WebElement item1 = cd.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = cd.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = cd.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = cd.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 = cd.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item6 = cd.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement item7 = cd.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions ac=new Actions(cd);
		cd.executeScript("arguments[0].scrollIntoView()", item1);
		ac.keyDown(Keys.CONTROL).click(item1).click(item6).click(item7).keyUp(Keys.CONTROL).perform();
		
		

	}

}
