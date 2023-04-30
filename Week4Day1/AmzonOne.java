package Week4Day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class AmzonOne {

	
public static void main(String[] args) throws InterruptedException {

			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver cd = new ChromeDriver(options);
			cd.manage().window().maximize();
			cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			cd.get("https://www.amazon.in/");
			cd.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
			String oneplus = cd.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
			System.out.println("Price of the 1st Displayed Product is :"+ oneplus);
			
			String review = cd.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
			System.out.println("The Number of reviews for first product :"+ review);
			Thread.sleep(2000);
			cd.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
			
			Set<String> windowHs = cd.getWindowHandles();
			 List<String> whs=new ArrayList<String>(windowHs);
			 cd.switchTo().window(whs.get(1));
			 System.out.println(cd.getTitle());
			 Thread.sleep(2000);
			cd.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			Thread.sleep(2000);
			WebElement cart = cd.findElement(By.xpath("(//input[@id='attach-string-cart-subtotal-single']/following::span[@id='attach-accessory-cart-subtotal'])[1]"));
			Thread.sleep(2000);
			String cartsub=cart.getText();
            System.out.println("Cart Subtotal:"+ cartsub);
            cd.quit();

}
}	
