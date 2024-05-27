package PRACTICE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class individual_screenshot {
	public static void main(String[]args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
	File dst =new File("C:\\Users\\kalya\\Desktop\\workspace\\ANKUSH_MAVEN\\screenshot\\logo.png");
	Files.copy(src, dst);
	
	}

}
