package Dbconnection_labs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class program_type extends Connections_db {
static String programid;
  static  String getid;
  static String id;
  static  String programtype;
	static int count=0;
 
public static void programtype() throws SQLException, InterruptedException
	{
	program_type pp=new program_type();
	
		
		programtype=rs.getString("ProgramType");
		id=rs.getString("ProgramId");
		 int number = Integer.parseInt(id);
		 int number1 = Integer.parseInt(programtype);
		 if(number1==1)
		 {
		//System.out.print(programtype);
			System.out.println(" "+id);
			//Thread.sleep(1000);
			 JavascriptExecutor exe = (JavascriptExecutor)driver;
			 Thread.sleep(2000);
			  exe.executeScript("document.getElementById('module-" + id +"')?.click();");
		/*	String cc=s+"/"+id;
			driver.get(cc);
			login();*/
			//Thread.sleep(2000);
		count=count+1;
	 }
		 System.out.print("count"+count);
		
		 }
	
}
	//courseid();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//programid="Select*From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepId= bb.CourseStepId Where aa.CourseId In(446)";
		
		
		//ResultSet rs1=stmt.executeQuery(programid);
		
		
//			
//			PT    Name
//			1    Code Challenge
//			3    Fix It
//			4    With Solution
//			5    Without Solution
//			6    Reference
//			7    Learn
//			8    Lesson
//			11
			

			
			//Thread.sleep(1000);
	 /*	Actions ac=new Actions(driver);
		//WebElement w1=driver.findElement(By.xpath("//*[@class=\"btn small-padding btn-outline-success ng-star-inserted\"]"));
		//ac.moveToElement(w1).click().perform();
		//int i=w1.size();
		List<WebElement> ww=driver.findElements(By.xpath("//*[@class=\"btn small-padding btn-outline-success ng-star-inserted\"]"));
		
//		String f="module-"+id;
			
		// System.out.println(f);
		 switch (getid) {
		/*  case "1":
			  w1.click();
			
	       
		  case "3":
			  w1.click();
		  case "4":
			  w1.click();
		  case "5":
			  w1.click();
		   
		  case "6":
			 // Thread.sleep(1000);
			  w1.click();*/
		
		/*  case "7":
			  JavascriptExecutor exe = (JavascriptExecutor)driver;
				 
			  exe.executeScript("document.getElementById('accord-" + id +"')?.click();");
			 
			 // w1.click(id);
		 
		 }}
			
		 System.out.println("failed");
		}*/



