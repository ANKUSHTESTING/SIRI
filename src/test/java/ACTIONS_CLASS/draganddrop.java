package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[]args) {
	 WebDriver driver=new EdgeDriver();
	 driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	 //xpath for src element
	 WebElement src = driver.findElement(By.xpath("//img[@id='drag1']"));
	 //xpath for dst element
	WebElement dst = driver.findElement(By.xpath("//div[@id='div2']"));
	 //actions class
	 Actions s=new Actions(driver);
	 s.dragAndDrop(src, dst).perform();
			 
	}

}
