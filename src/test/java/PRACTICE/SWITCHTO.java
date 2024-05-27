package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SWITCHTO {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");
		driver.switchTo();
		driver.get("https://www.instagram.com");
	}

}
