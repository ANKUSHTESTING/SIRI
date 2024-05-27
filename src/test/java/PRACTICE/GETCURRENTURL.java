package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GETCURRENTURL {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
	}

}
