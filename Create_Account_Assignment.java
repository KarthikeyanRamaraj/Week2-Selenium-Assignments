package Weak2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Create_Account_Assignment {

    public static void main(String[] args) {
        //  WebDriver (ChromeDriver)
    		ChromeDriver driver=new ChromeDriver();
		
    		 driver.get("http://leaftaps.com/opentaps/");// Load the URL
		
    		 driver.manage().window().maximize();
         {
            
            // Enter username and password
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

    		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

            // Click the Login button
    		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

            // Click on the "CRM/SFA" link
    		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
    		
    		
            // Click on the "Accounts" tab
            driver.findElement(By.linkText("Accounts")).click();

            // Click on the "Create Account" button
            driver.findElement(By.linkText("Create Account")).click();

            // Enter account name
            driver.findElement(By.id("accountName")).sendKeys("TestAccount");

            // Enter description
            driver.findElement(By.id("description")).sendKeys("Selenium Automation Tester");

            // Select industry "ComputerSoftware"
            WebElement industry = driver.findElement(By.id("industryEnumId"));
            Select inds = new Select(industry);
            inds.selectByVisibleText("ComputerSoftware");

            // Select ownership "S-Corporation"
            WebElement ownership = driver.findElement(By.id("ownershipEnumId"));
            Select owner = new Select(ownership);owner.selectByVisibleText("S-Corporation");

            // Select source "Employee"
            WebElement sourceemp = driver.findElement(By.id("dataSourceId"));
            Select source = new Select(sourceemp);source.selectByValue("EMPLOYEE");

            // Select marketing campaign "eCommerce Site Internal Campaign"
            WebElement mc= driver.findElement(By.id("marketingCampaignId"));
            Select campaign = new Select(mc);campaign.selectByIndex(2); 

            // Select state/province "Texas"
            WebElement sp = driver.findElement(By.id("generalStateProvinceGeoId"));
            Select sps = new Select(sp);sps.selectByValue("Texas");

            // Click the "Create Account" button
            WebElement createAccount = driver.findElement(By.className("smallSubmit"));
            createAccount.click();

            // Verify that the account name is displayed correctly
            WebElement CreatedAccount = driver.findElement(By.xpath("//span[@class='tabletext' and contains(text(),'TestAccount')]"));
    		
    		if(CreatedAccount.isDisplayed())
    		{
    			System.out.println("Account Verified");
    		}
    		else
    		{
    			System.out.println("Account Not Verified");
    		}
            // Close the browser window
            driver.quit();
        }
    }
}