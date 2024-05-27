package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class visibletext {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//login by using visible text
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
