package Week4Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://www.nykaa.com");
		Actions ac=new Actions(cd);
		WebElement MH = cd.findElement(By.xpath("//a[text()='brands']"));
		ac.moveToElement(MH).perform();
		WebElement MH1 = cd.findElement(By.xpath("//a[text()='L']"));
		ac.moveToElement(MH1).perform();
		cd.findElement(By.xpath("(//div[@id='list_L']/following::a)[5]")).click();
		String title = cd.getTitle();
		System.out.println(title);
		cd.findElement(By.xpath("//div[@id='filter-sort']")).click();
		cd.findElement(By.xpath("//span[text()='customer top rated']")).click();
		cd.findElement(By.xpath("//span[text()='Category']")).click();
		cd.findElement(By.xpath("//span[text()='Hair']")).click();
		cd.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		cd.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		cd.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo With UVA & UVB')]")).click();
		Set<String> windowHs = cd.getWindowHandles();
		 List<String> whs=new ArrayList<String>(windowHs);
		 cd.switchTo().window(whs.get(1));
		 Select st=new Select(cd.findElement(By.xpath("//select[@title='SIZE']")));
		 st.selectByVisibleText("180ml");
		 String MRP = cd.findElement(By.xpath("//span[contains(text(),209)]")).getText();
		 System.out.println("MRP of the selected Product is:" +" "+ MRP);
		 cd.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		 cd.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		 cd.switchTo().frame(0);
		 String GT = cd.findElement(By.xpath("(//span[@color='#001325'])[2]")).getText();
		 System.out.println("Grand Total:" +" "+ GT);
		 Thread.sleep(1000);
		 cd.findElement(By.xpath("//span[text()='Proceed']")).click();
		 cd.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		 String price = cd.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		 System.out.println("The Price Details:"+" "+price);
		  
		
	}

}
