package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NAVIGATE {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.meesho.com");
		Thread.sleep(4000);
		driver.navigate().to("https://www.purple.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		
	}

}
