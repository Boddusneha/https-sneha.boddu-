package course_migration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.JavascriptExecutor;

public class Connecting_to_db extends login {
	static String programid;
	  static Statement stmt;
	  static String s;
	  static String ss;
	  static String topicname;
	  static ResultSet rs;
	  static  String programtype;
	  static String programname;
		public static void courseid() throws SQLException, InterruptedException {
			// TODO Auto-generated method stub
			String SQL;
		
	String connectionUrl = "jdbc:sqlserver://161.97.104.38;databaseName=Labs_qa;user=Labs_qa;password=765cENH2LPkCWC";

	Connection con = DriverManager.getConnection(connectionUrl);
			stmt = con.createStatement();
	    
	   
		//SQL= "select * from CourseSteps where courseid=446";
			SQL="EXEC Usp_clb_get_programs @UserId='student@demo.in', @courseid='446'";;

		 rs=stmt.executeQuery(SQL);
		
	   displayRow("",rs);
	    
	}	

	private static void displayRow(String title,ResultSet rs) throws SQLException, InterruptedException {
		String base="https://labsqa.hebeon.com/labs/accessCourse/";
		s=base+446;
		driver.get(s);
		
		
	while (rs.next()) {
		programtype=rs.getString("ProgramType");
		 topicname=ss=rs.getString("TopicName");;
		 programid=rs.getString("ProgramId");
		 programname=rs.getString("ProgramName");
		 
		 System.out.print(" "+programname);
		//System.out.print(rs.getString("programtype"));
		
		//
	 //  System.out.print(" "+rs.getString("programid"));
	    //System.out.println();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementById('accord-" + ss +"')?.click();");*/
	
		Program_type Pt=new Program_type();
		Pt.programtype();
		
	}	
	System.out.println("connected to db");
	}

}
