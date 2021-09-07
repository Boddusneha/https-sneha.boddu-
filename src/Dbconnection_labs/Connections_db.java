package Dbconnection_labs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import course_migration.execute_cc;

public class Connections_db extends login {
	static String programid,programid1,programtype;
  static Statement stmt;
  static String s;
  static String programsolution;
  static String s1;
  static String ss;
  static ResultSet rs;
  
  static String programname;
  
	public static void courseid() throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		String SQL;
	
String connectionUrl = "jdbc:sqlserver://161.97.104.38;databaseName=Labs_qa;user=Labs_qa;password=765cENH2LPkCWC";

Connection con = DriverManager.getConnection(connectionUrl);
		stmt = con.createStatement();
    
   
	//SQL= "select * from CourseSteps where courseid=446";
	programid="Select*From CourseSteps aa Inner Join tbl_CollegeLabPrograms bb on aa.StepId= bb.CourseStepId Where aa.CourseId In(446)";

	 rs=stmt.executeQuery(programid);
	
   displayRow("",rs);
    
}	

private static void displayRow(String title,ResultSet rs) throws SQLException, InterruptedException {
	
	
	
while (rs.next()) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//System.out.println(rs.getString("StepName"));
	
	 ss=rs.getString("StepName");
	
//System.out.println(rs.getString("StepName"));
	 programtype=rs.getString("ProgramType");
programid1=rs.getString("ProgramId");
programname=rs.getString("ProgramName");
programsolution=rs.getString("ProgramSolution");


System.out.println();

//System.out.println(" "+rs.getString("programsolution"));


	/*JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('accord-" + ss +"')?.click();");
	program_type clikid= new  program_type();
	clikid.programtype();*/
int number1 = Integer.parseInt(programtype);
if(number1==1)
{
	//program type as pt
	//System.out.print(programid1);
	 System.out.print(" "+programname);
	 System.out.println();
	
}
	
	

	
  }

//System.out.println("done");
}

public static void main(String[] args) throws SQLException, InterruptedException
{

	courseid();
	 //programtype();
	 
}

	}


