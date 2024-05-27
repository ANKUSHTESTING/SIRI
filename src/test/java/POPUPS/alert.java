package POPUPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	//customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		//submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//use switch to method to switch to ok
		Alert alt=driver.switchTo().alert();
		//get the text 
		String text=alt.getText();
		System.out.println(text);
		//accpt
		alt.accept();
		System.out.print(text);
		
		
		
		
	}


		
	}


