package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MINIMIZE {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.rapido.com");
	}

}
