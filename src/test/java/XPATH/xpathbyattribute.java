package XPATH;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathbyattribute {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		//for user name
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	//for password
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_saucer");
//for login button
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	// single line 
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"sauce",Keys.ENTER);
	}

}
