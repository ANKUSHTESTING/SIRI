package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class singlelinepgm_byusing_keysclass {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("charming_siri",Keys.TAB,"siri",Keys.ENTER);
	}

}
