package pages;

import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BookReturnFlight extends TestAnnotations {
	BookReturnFlight()
	{
		
	}
	WebDriver driver;
	WebElement ele;
	public static Select select;
	Workbook workbook;
	Sheet sheet;
	Cell cell;
	Row row;
	public static String username, password, fromPort, toPort, toMonth, preference, firstname, lastname, Meal, card;
	public static String creditcardfirstname, creditcardlastname, Address1, Billcity, Billstate, billcountry,expirymonth;
	public static int passcount, fromMonth, fromDay, toDay, expiryyear, Billzip;
	public static double number;

	
	@Test
	public void bookingflight() {
		try {
			driver.get("http://newtours.demoaut.com/mercurysignon.php");
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))
					.sendKeys(username);
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
					.sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			driver.findElement(By.xpath("//input[@name='tripType'][@value='oneway']")).click();
			// ele =driver.findElement(By.name("passCount"));
			// select = new Select(ele);
			// select.selectByValue(passcount);
			select = new Select(driver.findElement(By.name("fromPort")));
			select.selectByValue(fromPort);
			select = new Select(driver.findElement(By.name("fromMonth")));
			select.selectByValue(String.valueOf(fromMonth));
			select = new Select(driver.findElement(By.name("fromDay")));
			System.out.println("from day is:" + String.valueOf(fromDay));
			select.selectByVisibleText(String.valueOf(fromDay));
			select = new Select(driver.findElement(By.name("toPort")));
			select.selectByValue(String.valueOf(toPort));
			select = new Select(driver.findElement(By.name("toMonth")));
			select.selectByVisibleText(toMonth);
			select = new Select(driver.findElement(By.name("toDay")));
			select.selectByVisibleText(String.valueOf(toDay));
			driver.findElement(By.xpath("//input[@value='Coach']"));
			select = new Select(driver.findElement(By.name("airline")));
			select.selectByVisibleText(preference);
			driver.findElement(By.xpath("//input[@name='findFlights']")).click();
			driver.findElement(By.xpath("//input[contains(@value,'Blue Skies Airlines')][@name='outFlight']")).click();
			driver.findElement(By.xpath("//input[contains(@value,'Blue Skies Airlines')][@name='inFlight']")).click();
			driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input"))
					.sendKeys(firstname);
			driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(lastname);
			ele = driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[3]/select"));
			select = new Select(ele);
			select.selectByVisibleText(Meal);
			ele = driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[1]/select"));
			select = new Select(ele);
			select.selectByVisibleText(card);
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[2]/input"))
					.sendKeys(String.valueOf(number));
			ele = driver.findElement(
					By.xpath("//tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[3]/select[1]"));
			select = new Select(ele);
			select.selectByVisibleText(expirymonth);
			ele = driver.findElement(By.xpath(
					"//tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[3]/select[2]"));
			select = new Select(ele);
			select.selectByVisibleText(String.valueOf(expiryyear));
			driver.findElement(By.xpath("//input[@name='cc_frst_name'] ")).sendKeys(creditcardfirstname);
			driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(creditcardlastname);
			driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
			driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys(Address1);
			driver.findElement(By.xpath("//input[@name='billCity']")).clear();
			driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys(Billcity);
			driver.findElement(By.xpath("//input[@name='billState']")).clear();
			driver.findElement(By.xpath("//input[@name='billState']")).sendKeys(Billstate);
			driver.findElement(By.xpath("//input[@name='billZip']")).clear();
			driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys(String.valueOf(Billzip));
			ele = driver.findElement(By.name("billCountry"));
			select = new Select(ele);
			select.selectByVisibleText(billcountry);
			driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
			ele = driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"));
			int x = ele.getLocation().x;
			int y = ele.getLocation().y;
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			String command = String.format("window.scrollTo(%d,%d)", x, y);
			jse.executeScript(command);
			ele.click();
			// driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	
}
