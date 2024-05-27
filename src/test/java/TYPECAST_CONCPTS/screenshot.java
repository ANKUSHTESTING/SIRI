package TYPECAST_CONCPTS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot {
	public static void main(String[]args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		//typecasting
		TakesScreenshot s=(TakesScreenshot)driver;
		File src= s.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\kalya\\Desktop\\workspace\\ANKUSH_MAVEN\\screenshot\\siri.png");
		Files.copy(src, dest);
			}

}
