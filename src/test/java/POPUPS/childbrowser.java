package POPUPS;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class childbrowser {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		//search  space
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles under 20000");
		//search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click on 1 st phone
		driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
		//get text
		
		System.out.println(driver.getTitle());
		//title of the  child window
	Set<String>	wind=driver.getWindowHandles();
	
	for(String win:wind) {
		driver.switchTo().window(win);
	}
	System.out.println(driver.getTitle());
	}


}
