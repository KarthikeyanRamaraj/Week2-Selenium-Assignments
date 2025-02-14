package Weak2Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Facebook_Home_Assignment {

	public static void main(String[] args) {
// WebDriver (ChromeDriver)	
	ChromeDriver driver = new ChromeDriver();
//WebPage		
		driver.get("https://www.facebook.com/");
//Maximize
		driver.manage().window().maximize();
//Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//Enter the First name,Surname
		driver.findElement(By.name("firstname")).sendKeys("TestAccount");
		driver.findElement(By.name("lastname")).sendKeys("TA");
//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("Testaccount@gmail.com");
//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");
//Dropdown in DOB
	//DAY	
		WebElement day = driver.findElement(By.id("day"));
		Select Days = new Select(day);
		Days.selectByValue("01");
	//Month
		WebElement Month = driver.findElement(By.id("month"));
		Select Months = new Select(Month);
		Months.selectByValue("jan");
		
	//Year
		WebElement Year = driver.findElement(By.id("year"));
		Select Years = new Select(Year);
		Years.selectByValue("1905");
		
//Radio button for Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Others']")).click();

	}

}
