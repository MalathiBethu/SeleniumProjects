package pages;
import org.testng.annotations.Test;
import utils.SendMailUsingGmail;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class TestAnnotations {
	TestAnnotations()
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
	@BeforeMethod
	public void readExcel() {
		try {
			FileInputStream input = new FileInputStream(new File("C:\\Users\\M1037726\\Oxygen\\python\\EdurekaFinalProjectUsingReportNG\\src\\utils\\Input.xlsx"));
			workbook = WorkbookFactory.create(input);
			sheet = workbook.getSheetAt(0);
			System.out.println(sheet.getSheetName());
			System.out.println(sheet.toString());
			int rowcount = sheet.getLastRowNum();
			for (int row = 1; row < rowcount + 1; row++) {
				Row irow = sheet.getRow(row);
				username = irow.getCell(1).getStringCellValue();
				System.out.println(username);
				password = irow.getCell(2).getStringCellValue();
				System.out.println(password);
				int passcount = (int) irow.getCell(3).getNumericCellValue();
				System.out.println(passcount);
				System.out.println(String.valueOf(passcount));
				fromPort = irow.getCell(4).getStringCellValue();
				System.out.println(fromPort);
				fromMonth = (int) irow.getCell(5).getNumericCellValue();
				System.out.println(fromMonth);
				System.out.println("String value of fromMonth" + String.valueOf(fromMonth));
				fromDay = (int) irow.getCell(6).getNumericCellValue();
				System.out.println(fromDay);
				toPort = irow.getCell(7).getStringCellValue();
				System.out.println(toPort);
				toMonth = irow.getCell(8).getStringCellValue();
				System.out.println(toMonth);
				toDay = (int) irow.getCell(9).getNumericCellValue();
				System.out.println(toDay);
				preference = irow.getCell(10).getStringCellValue();
				System.out.println(preference);
				firstname = irow.getCell(11).getStringCellValue();
				System.out.println(firstname);
				lastname = irow.getCell(12).getStringCellValue();
				System.out.println(lastname);
				Meal = irow.getCell(13).getStringCellValue();
				System.out.println(Meal);
				card = irow.getCell(14).getStringCellValue();
				System.out.println(card);
				number = irow.getCell(15).getNumericCellValue();
				System.out.println(card);
				expirymonth = irow.getCell(16).getStringCellValue();
				System.out.println(expirymonth);
				expiryyear = (int) irow.getCell(17).getNumericCellValue();
				System.out.println(expiryyear);
				creditcardfirstname = irow.getCell(18).getStringCellValue();
				System.out.println(creditcardfirstname);
				creditcardlastname = irow.getCell(19).getStringCellValue();
				System.out.println(creditcardlastname);
				Address1 = irow.getCell(20).getStringCellValue();
				System.out.println(Address1);
				Billcity = irow.getCell(21).getStringCellValue();
				System.out.println(Billcity);
				Billstate = irow.getCell(22).getStringCellValue();
				System.out.println(Billstate);
				Billzip = (int) irow.getCell(23).getNumericCellValue();
				System.out.println(Billzip);
				billcountry = irow.getCell(24).getStringCellValue();
				System.out.println(billcountry);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(" http://newtours.demoaut.com/mercurysignon.php");
	}
	@AfterSuite
	public void afterSuite() {
		try {
			String filename=
			 "C:\\Users\\M1037726\\Oxygen\\python\\EdurekaFinalProjectUsingReportNG\\test-output\\html\\index.html";			
			SendMailUsingGmail.sendMail(filename);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  @AfterMethod
  public void afterMethod() {
  }
  @BeforeClass
  public void beforeClass() {
  }
  @AfterClass
  public void afterClass() {
  }
  @BeforeTest
  public void beforeTest() {
  }
  @AfterTest
  public void afterTest() {
  }}