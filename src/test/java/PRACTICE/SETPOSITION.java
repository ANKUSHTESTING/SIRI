package PRACTICE;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SETPOSITION {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");
		Point p=new Point(100, 200);
		driver.manage().window().setPosition(p);
		
	}

}
