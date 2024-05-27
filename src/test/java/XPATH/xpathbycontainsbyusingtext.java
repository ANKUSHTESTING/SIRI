package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class xpathbycontainsbyusingtext {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//user name
	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("standard_user");
			//password
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("secret_sauce");
		//login
	driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
	}
	

}