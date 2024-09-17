package TestNGDemo.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrive {
@Test(dataProvider="getTextData",dataProviderClass=DataSupplier.class)
	public void VerifyLogin(String email,String password) {//parametarise
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("kaverijamb1234@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
        System.out.ptintln("Hello");
	
	
	}



}
