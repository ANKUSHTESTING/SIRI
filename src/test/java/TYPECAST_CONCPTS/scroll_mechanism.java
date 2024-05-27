package TYPECAST_CONCPTS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scroll_mechanism {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		//typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window,scrollBy(0,2000) ");//scroll down
		Thread.sleep(3000);
		
		js.executeScript("window,scrollBy(0,-1000) ");//scroll up
	}

}
