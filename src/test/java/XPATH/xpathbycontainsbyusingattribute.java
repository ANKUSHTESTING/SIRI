package XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathbycontainsbyusingattribute {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//click on create new account
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(3000);
	  //day
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(day);
	Thread.sleep(3000);
		s.selectByVisibleText("2");
		//month
		Thread.sleep(300);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		Thread.sleep(3000);
			s1.selectByVisibleText("Jan");
		//year	
			Thread.sleep(3000);
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			Select s2=new Select(year);
			Thread.sleep(3000);
				s2.selectByVisibleText("2002");
	}

}
