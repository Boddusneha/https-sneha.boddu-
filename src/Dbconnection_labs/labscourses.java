package Dbconnection_labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class labscourses {
	public static WebDriver driver;
	static String SQL2;
	static Statement stmt;
	static String rs;
	
	public static void login() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
		driver.findElement(By.id("Email")).sendKeys("student@demo.in");
	      driver.findElement(By.id("Password")).sendKeys("Demo@123");
	      driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	      driver.findElement(By.xpath("//*[text()=\"Digital Labs\"]")).click();
	      
	    

	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String SQL,programid;
				//String SQL1=null;
		//labs_Dbconnections labslogin=new labs_Dbconnections();
//login();
		
		String connectionUrl = "jdbc:sqlserver://161.97.104.38;databaseName=Labs_qa;user=Labs_qa;password=765cENH2LPkCWC";

		 

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            //createTable(stmt);
           //String SQL = "SELECT * FROM tbladaptivemodules";
        	SQL= "select * from CourseSteps where courseid=446";
       programid="Select*From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepId= bb.CourseStepId Where aa.CourseId In(446)";
      //  programid="Select*From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepName= bb.CourseStepName Where aa.CourseId In(446)";
        //SQL1= "select * from Courses";
        	
        	
        	//SQL1="Select  ProgramId From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepId= bb.CourseStepId Where aa.CourseId In(401)";
            //String SQL="SELECT * FROM Courses where CourseId='1'";
        	//ResultSet rs = stmt.executeQuery(SQL);
        	 ResultSet rs1=stmt.executeQuery(SQL);
        	// ResultSet count = stmt.executeQuery(SQL2);
         	
        	 //ResultSet rs1 = stmt.executeQuery(SQL1);
        	 
            // rs1 = stmt.executeQuery(SQL1);
           //displayRow("", rs,count,rs);
           displayRow("",rs1);
            
        }	
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            	
        }
      //System.out.println(rs1);
       
    
	}																
	

    private static void displayRow(String title,ResultSet rs1) throws SQLException {
    	int j;
    	int k=0;
    	System.out.println(title);
    	//String base="https://labsqa.hebeon.com/labs/accessCourse/";
    	//String s=base+446;
	//	driver.get(s);
        while (rs1.next()) {
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       // boolean d=rs.next();
        	//String i=rs.getString("CourseID");
        	//String i=rs.getString("courseid");
        //	String s1=rs1.getString("ProgramID");
        	//SQL2="select count(stepid) from coursesteps"; 
        	//String i=rs1.getString("ProgramID");
        	//System.out.print(rs1.getString("ProgramID")+" ");
        //	String i2=rs1.getString("ProgramType");
        	//System.out.print(rs1.getString("ProgramType")+" ");
        //	System.out.print(rs1.getString("StepId")+" ");
        	//System.out.println(rs1.getString("ProgramSolution")+" ");
        String ss=rs1.getString("StepName");
        	System.out.println(rs1.getString("StepName"));
        	JavascriptExecutor jse = (JavascriptExecutor)driver;
        //	jse.executeScript("document.getElementById('accord-" + ss +"')?.click();");
        	j=++k;
        	 k=j;
        	/* if(i=="7")
        	 {
        		 jse.executeScript("document.getElementById(ss)?.click();");
        	 }*/
        
        	//c=j++;
        	//System.out.println(rs.getString(count));
        	
        	
        	
        /*	 System.out.println("count"+k);
             for(int a = 0;a<k;a++)
             {
          	   int acc=rs.getInt("stepId");*/
          	   
          	   
          	   
             }

        		
        
        	
        	//System.out.println();
        	//System.out.println(rs.getString("Coursename"));
        	//System.out.println(rs.getString("select * from tbl_CollegeLabPrograms"));
        	
        	
        	//System.out.println(rs);
        	
        }
        
        
      
	}


