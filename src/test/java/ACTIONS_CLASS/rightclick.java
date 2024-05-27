package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
	WebElement	gmail=driver.findElement(By.xpath("//a[@class='gb_J']"));
	Actions s=new Actions(driver);
	s.moveToElement(gmail).contextClick().perform();
	
	}

}
