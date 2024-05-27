package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QUIT {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.quit();
		//quit is used to close the all the tabs
	}

}
