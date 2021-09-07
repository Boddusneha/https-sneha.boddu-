package Dbconnection_labs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class temp {
static String SQL;
static String programid;
static  String programtype;
static String id;
static int count=0;
public static WebDriver driver;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   // driver=new ChromeDriver();
		String connectionUrl = "jdbc:sqlserver://161.97.104.38;databaseName=Labs_qa;user=Labs_qa;password=765cENH2LPkCWC";

		String base="https://labsqa.hebeon.com/labs/accessCourse/";
		String s=base+446;

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
        	 CallableStatement statement = con.prepareCall("{Usp_clb_get_programs()}");
        
        	programid="Select*From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepId= bb.CourseStepId Where aa.CourseId In(446)";
        	
        	statement.execute();
        	/*ResultSet rs1=stmt.executeQuery(statement);
        	
        	while(rs1.next())
//        		
//        		Id    Name
//        		1    Code Challenge
//        		3    Fix It
//        		4    With Solution
//        		5    Without Solution
//        		6    Reference
//        		7    Learn
//        		8    Lesson
//        		11
        		

        		{
        		//Thread.sleep(1000);
        		programtype=rs1.getString("ProgramType");
        		id=rs1.getString("ProgramId");
        		 int number = Integer.parseInt(id);
        		 int number1 = Integer.parseInt(programtype);
        		 if(number1==6)
        		 {
        		//System.out.print(programtype);
        			System.out.println(" "+id);
        			String cc=s+id;
        		count=count+1;
        			
        		 }
        	
        /*	Actions ac=new Actions(driver);
        	//WebElement w1=driver.findElement(By.xpath("//*[@class=\"btn small-padding btn-outline-success ng-star-inserted\"]"));
        	//ac.moveToElement(w1).click().perform();
        	//int i=w1.size();
        	List<WebElement> ww=driver.findElements(By.xpath("//*[@class=\"btn small-padding btn-outline-success ng-star-inserted\"]"));
        	
//        	String f="module-"+id;
        		
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
        	}

        	
        	 


	}*/
	}
        //	System.out.println("count"+count);
        }}
