package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GETPAGESOURCE {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		String page=driver.getPageSource();
		System.out.println(page);
	}

}
