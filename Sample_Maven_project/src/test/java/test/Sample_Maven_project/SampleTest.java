package test.Sample_Maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void registerTC()
	{
		System.setProperty("webdriver.chrome.driver","D:\\installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@name='FirstName']"))).click().sendKeys("pushpa").build().perform();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("praj@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("pr@1234");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("pr@1234");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.close();	
	} 
	
	@Test
	public void loginTC()
	{
		System.setProperty("webdriver.chrome.driver","D:\\installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.cssSelector("input#Email")).sendKeys("praj@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pr@1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();
	}


}
