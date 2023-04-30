package Week4Day1;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://www.ajio.com/");
		cd.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
		cd.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String totalItems = cd.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = cd.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = cd.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}

		
	}

}
