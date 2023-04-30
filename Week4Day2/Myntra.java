package Week4Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://www.myntra.com/");
		String parent = cd.getWindowHandle();
		WebElement men = cd.findElement(By.xpath("//a[text()='Men'][1]"));
		Actions ac=new Actions(cd);
		ac.moveToElement(men).perform();
		cd.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		String text = cd.findElement(By.xpath("(//div[@class='title-container'])[1]")).getText();
		System.out.println(text);
		String text2 = cd.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		System.out.println("The sum of the catagories" +" "+ text2);
		cd.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).click();
		cd.findElement(By.xpath("//div[@class='brand-more']")).click();
		cd.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		cd.findElement(By.xpath("//ul[@class='FilterDirectory-list']/li[2]")).click();
		cd.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(5000);
		List<WebElement> BrandList = cd.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		for(int i=0;i<BrandList.size();i++)
		{
			String Brand = BrandList.get(i).getText();
			System.out.println(Brand);
		}

		cd.findElement(By.xpath("//span[@class='myntraweb-sprite sort-downArrow sprites-downArrow']")).click();
		cd.findElement(By.xpath("//ul[@class='sort-list']/li[4]")).click();
		String FP = cd.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("The First Displayed Item:" +" "+ FP);
		cd.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
		Thread.sleep(5000);
		Set<String> windowHs = cd.getWindowHandles();
		List<String> whs=new ArrayList<String>(windowHs);
		System.out.println(whs.size());
		cd.switchTo().window(whs.get(1));
		WebElement image1 = cd.findElement(By.xpath("(//div[@class='image-grid-imageContainer'])[1]"));
		TakesScreenshot ts = (TakesScreenshot)image1;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen2.png"));
		System.out.println("the Screenshot is taken");
		cd.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		cd.close();
		


	}

}	