package pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginVaidation extends TestAnnotations {
 
	
	WebDriver driver;
	WebElement ele;
	LoginVaidation()
	{
		
	}
 
  @Test
  public void login()
  {
	  try
	  {
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")).sendKeys("hello");
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello");
	  driver.findElement(By.name("login")).click();
	  String Signoff = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
	  if(Signoff.equals("SIGN-OFF"))
	  {
		  System.out.println("login successfull");
	  }
	  else
	  {
		  throw new Exception("invalid credentials");
	  }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
  }
 
}
