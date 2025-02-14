package Weak2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Lead_Assignment {

	public static void main(String[] args) {
// WebDriver (ChromeDriver)
		ChromeDriver driver=new ChromeDriver();
//webpage
		driver.get("http://leaftaps.com/opentaps/control/main");
//Maximize the screen
		driver.manage().window().maximize();
//Enter a username and password		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//Click on the links	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
//Enter first name ,last name and Compny name 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestAccount");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T A");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//Enter the title		
		String title = "Test lead";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
		driver.findElement(By.name("submitButton")).click();
		
		String DisplayedTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		
		if(title.equals(DisplayedTitle))
		{
			System.out.println("Title is Displayed");
		}
		else
		{
			System.out.println("Title is Not Displayed");
		}
//Close the Browser		
		driver.quit();

	}
	
	}
