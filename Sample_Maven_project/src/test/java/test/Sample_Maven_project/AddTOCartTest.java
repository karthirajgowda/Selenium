package test.Sample_Maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AddTOCartTest {
	@Test
	public void addToCart() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();

		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
         
		driver.close();
		
	}

}
