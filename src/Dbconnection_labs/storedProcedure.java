package Dbconnection_labs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class storedProcedure {
	static String programid;
	  static Statement stmt;
	  static String s;
	  static String ss;
	  static String ss1;
	  static  String programtype;
	  static ResultSet rs;
	  static ResultSet rs1;
	  static String programname;
	  public static WebDriver driver;
	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(480,TimeUnit.SECONDS); driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get("https://labsqa.hebeon.com/labs/accessCourse/446");
		driver.findElement(By.id("Email")).sendKeys("4024");
	      driver.findElement(By.id("Password")).sendKeys("Hb123!@#");
	      driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	      driver.findElement(By.xpath("//*[text()=\"Digital Labs\"]")).click();
	      String base="https://labsqa.hebeon.com/labs/accessCourse/";
			String s=base+446;
	   driver.get(s);
		String SQL;
		String connectionUrl = "jdbc:sqlserver://161.97.104.38;databaseName=Labs_qa;user=Labs_qa;password=765cENH2LPkCWC";

		

		
		//String connectionUrl = "jdbc:sqlserver://161.97.104.38;databaseName=Labs_qa;user=Labs_qa;password=765cENH2LPkCWC";

		Connection con = DriverManager.getConnection(connectionUrl);
				stmt = con.createStatement();
		    
		   
			//SQL= "select * from CourseSteps where courseid=446";
				//int number = Integer.parseInt(programid);
			//programid="Usp_clb_get_programs ";
				SQL="EXEC Usp_clb_get_programs @UserId='student@demo.in', @courseid='446'";
				//programid="Select*From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepId= bb.CourseStepId Where aa.CourseId In(446)";
			 rs=stmt.executeQuery(SQL);
		//	 rs1=stmt.executeQuery(SQL);
			 
		  displayRow("",rs);
		    
		}	

	private static void displayRow(String title,ResultSet rs) throws SQLException, InterruptedException {
			
		
			
		while (rs.next()) {
			Thread.sleep(1000);
			ss=rs.getString("ProgramId");
			programname=rs.getString("ProgramName");
			 //System.out.print(programname);
			 programtype=rs.getString("ProgramType");
			 ss1=rs.getString("TopicName");
			// System.out.print(programtype);
			 ss1=rs.getString("TopicName");
			 System.out.print(" "+ss);
			System.out.println(" "+ss1);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				Thread.sleep(1000);
			//jse.executeScript("document.getElementById('accord-" + ss1 +"')?.click();");
			
			 int number1 = Integer.parseInt(programtype);
			 if(number1==1)
			 {
			//System.ou//t.print(programtype);
				 jse.executeScript("document.getElementById('accord-" + ss1 +"')?.click();");
				 Thread.sleep(1000);
				System.out.println(" "+ss);
				//Thread.sleep(1000);
				 JavascriptExecutor exe = (JavascriptExecutor)driver;
				
//				 jse.executeScript("document.getElementById('module-"+ ss +"')?.click();");
				// driver.findElement(By.xpath("//a[text()=programname]")).click();
				 var at = By.linkText(programname);
				 System.out.println(at);
				
				// List<WebElement> w1=driver.findElements(By.xpath("//*[@href='/labs/accessCourse/accessProgram/446/10805']"));
				 
				 WebElement w1=driver.findElement(By.xpath("//*[text()=\"  Print Single Line Message\"]"));
				 exe.executeScript("window.scrollBy(0,250)", "w1");
				 w1.click();
				// exe.executeScript("arguments[0].click()",w1);
				// WebElement w2=w1.get(1);
				
				
				//w1.get(0).click();
			// exe.executeScript("arguments[0].scrollIntoView();",w1);
			 
				  //	w2.click();
			/*	String cc=s+"/"+id;
				driver.get(cc);
				login();*/
				Thread.sleep(1000);
			
		 }
			 else {
				 System.out.println("fail");
			 }
			
			
			
		}
			
		}
}

