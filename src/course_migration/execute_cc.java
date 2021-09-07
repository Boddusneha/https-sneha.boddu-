package course_migration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class execute_cc extends Connecting_to_db{
	
	public void executeCodeChallenge() throws InterruptedException
	{
		//System.out.print(topicname);
	//	System.out.print(" "+programid);
		
		 JavascriptExecutor exe = (JavascriptExecutor)driver;
		 Thread.sleep(1000);
		exe.executeScript("document.getElementById('accord-" + topicname +"')?.click();");
		
		System.out.println(" "+programid);
		System.out.println("This is"+" "+programname);
		 String text=" "+programname;
		 for(WebElement click:solve)
			{
				
				
			 actions.moveToElement(click).click().perform();
			}
		
       //  WebElement w1=driver.findElement(By.xpath("//*[text()=text]"));
       //  System.out.println(w1);
         exe.executeScript("window.scrollBy(0,250)", "w1");
		// w1.click();
		 //run button as RB1
		 
		 
		WebElement r1=driver.findElement(By.xpath("//*[@data-intro='Button to run the code']"));
	exe.executeScript("window.scrollBy(0,250)", r1);
		r1.click();
		Thread.sleep(2000);
		/*WebDriverWait wait = new WebDriverWait(driver, 60);
         By bs=By.xpath("//input[@id='result']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(bs));*/
		exe.executeScript("window.scrollBy(0,-250)", "");
		//WebDriverWait wait = new WebDriverWait(driver, 15);
         // By bs=By.xpath("//input[@id='btnShowSolution']");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(bs));
		
		
		// by solution ad BS
		
		System.out.println("clikced by solution");
	   driver.findElement(By.id("btnShowSolution")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='OK']")).click();
		
		driver.findElement(By.xpath("//*[@data-intro='Button to run the code']")).click();
		Thread.sleep(1000);
		
		
		
		boolean testcases= driver.findElement(By.xpath("//*[text()=\"Not all Test Cases Passed!, Change the logic and try again!\"]")).isDisplayed();
		
		if(testcases)
		{
			System.out.println(" "+programid);
		}
		exe.executeScript("window.scrollBy(0,-300)", "");
		driver.findElement(By.xpath("//a[text()=\"Back\"]")).click();
		
		 System.out.println("executed cc");
		
	}
	

}
