package Dbconnection_labs;

import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		static String SQL2;
		static Statement stmt;
		
		public static void login() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(480,TimeUnit.SECONDS);
			/*ChromeOptions option=new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			option.setHeadless(true);
			 driver=new ChromeDriver(option);*/
			// driver=new ChromeDriver(option);
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			driver.get("https://labsqa.hebeon.com/labs/accessCourse/446");
			driver.findElement(By.id("Email")).sendKeys("4024");
		      driver.findElement(By.id("Password")).sendKeys("Hb123!@#");
		      driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		      driver.findElement(By.xpath("//*[text()=\"Digital Labs\"]")).click();
		      
		    

		}
		

	}


