package PRACTICE;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SETPAGESIZE {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");
		Dimension s=new Dimension(100,200);
		driver.manage().window().setSize(s);
		
	}

}
