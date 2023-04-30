package Week4Day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://www.snapdeal.com");
		WebElement mf = cd.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
		Actions ac=new Actions(cd);
		ac.moveToElement(mf).perform();
		cd.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String count = cd.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count of the sports shoes are:" +" "+ count);
		cd.findElement(By.xpath("//div[text()='Sports Shoes for Men']")).click();
		cd.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		cd.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		cd.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		cd.findElement(By.xpath("//input[@name='fromVal']")).clear();
		cd.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("530");
		cd.findElement(By.xpath("//input[@name='toVal']")).clear();
		cd.findElement(By.xpath("//input[@name='toVal']")).sendKeys("645");
		cd.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//label[@for='Color_s-Gray']")).click();
		String text = cd.findElement(By.xpath("//h1[@class='category-name']")).getText();
		System.out.println(text);
		String text3 = cd.findElement(By.xpath("//div[@class='sort-drop clearfix']")).getText();
		System.out.println(text3);
		String text1 = cd.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();
		System.out.println(text1);
		WebElement pr = cd.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions ac1=new Actions(cd);
		ac1.moveToElement(pr).perform();
		cd.findElement(By.xpath("//div[@pogid='640015266547']")).click();
		String text2 = cd.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println(text2);
		WebElement ts1 = cd.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		TakesScreenshot ts = (TakesScreenshot)ts1;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		System.out.println("the Screenshot is taken");
		cd.close();
		cd.quit();
		
	}

}
