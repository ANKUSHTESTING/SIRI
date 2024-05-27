package POPUPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class authentiocation {
	public static void main(String[]args) {
		WebDriver driver=new EdgeDriver();
		//use admin:admin@
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	}


