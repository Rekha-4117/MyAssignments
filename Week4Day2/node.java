package Week4Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class node {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.get("https://leafground.com/window.xhtml");
		String parent = cd.getWindowHandle();
		cd.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHs = cd.getWindowHandles();
		 List<String> whs=new ArrayList<String>(windowHs);
		 cd.switchTo().window(whs.get(1));	
		System.out.println(cd.getTitle());
		Thread.sleep(1000);
		cd.switchTo().window(whs.get(0));
		cd.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		ArrayList<String> tabs=new ArrayList<String>(cd.getWindowHandles());
		System.out.println("No. of tabs:"+ " "+ tabs.size());
		cd.switchTo().window(whs.get(0));
		cd.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> WH = cd.getWindowHandles();
		System.out.println(WH.size());
		List<String> whs1=new ArrayList<String>(WH);
		cd.switchTo().window(whs1.get(1));
		System.out.println(cd.getTitle());
		cd.switchTo().window(whs1.get(6));
		cd.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert=cd.switchTo().alert();
		alert.accept();
		cd.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		cd.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		cd.findElement(By.xpath("//span[text()='Dismiss']")).click();
		cd.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		cd.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		cd.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Rekha");
		System.out.println(alert.getText());
		alert.accept();
		cd.findElement(By.xpath("//span[text()='Delete']")).click();
		cd.findElement(By.xpath("//span[text()='No']")).click();
		cd.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		cd.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
		
		
		for(String s1:whs1)
		{
			if(!s1.equals(parent))
			{
				cd.switchTo().window(s1);
				cd.close();
			}
		}
		cd.switchTo().window(whs.get(0));
		cd.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> wh2=cd.getWindowHandles();
		List<String> whs2=new ArrayList<String>(wh2);
		cd.switchTo().window(whs2.get(1));
		String title = cd.getTitle();
		System.out.println(title);
		cd.switchTo().window(whs2.get(2));
		String title1=cd.getTitle();
		System.out.println(title1);
		
		
		
	}
	

	

}
