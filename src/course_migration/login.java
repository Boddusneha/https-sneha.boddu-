package course_migration;

import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static WebDriver driver;
	static String SQL2;
	static Statement stmt;
	
	public static void login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	  
		/*ChromeOptions option=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		option.setHeadless(true);
		 driver=new ChromeDriver(option);*/
		 
	  
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://labsqa.hebeon.com/labs/accessCourse/446");
		 driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("status_01");
	      driver.findElement(By.id("Password")).sendKeys("Hb123!@#");
	      driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	      driver.findElement(By.xpath("//*[text()=\"Digital Labs\"]")).click();
	      System.out.println("login successful");
	    

	}
}
