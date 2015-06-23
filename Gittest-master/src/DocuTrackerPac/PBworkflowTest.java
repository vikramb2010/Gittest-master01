package DocuTrackerPac;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PBworkflowTest {

	
	
	public static void CreatPBTestWorkflow() throws InterruptedException, AWTException   {
		
		System.out.println("Create New PBAgreement");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net");
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("maniadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[3]/ul/li[1]/a")).click();
		  //manage Agreements create agreement Dropdown code
		  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlPBEntity"))).selectByIndex(1);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClient"))).selectByIndex(1);
          Thread.sleep(2000);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClientEntities"))).selectByIndex(1);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddFormofPrimeBroker"))).selectByIndex(1);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByIndex(1);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_dd"))).selectByIndex(1);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_yyyy"))).selectByValue("2015");
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddSignedPB"))).selectByValue("Yes");
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddSignedCE"))).selectByValue("Yes");
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddStrength"))).selectByValue("Strong");
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddAgreementslist"))).selectByValue("Not Applicable");
          driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
          Thread.sleep(2000);
          
          System.out.println("Answer one Provison Approve IT");
          driver.findElement(By.linkText("Input Agreement Terms")).click();
          //PB LOCKUP TERMS
          driver.findElement(By.id("ContentPlaceHolder1_btnPBLT")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("Notes Regarding PB Lockup Terms")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("Notes are ok");
          driver.findElement(By.id("ContentPlaceHolder1_ctl00_btnSubmit54")).click();
          Thread.sleep(2000);
        //Approve
          driver.findElement(By.id("ContentPlaceHolder1_btnSubmitforApproval")).click();
          Thread.sleep(2000);
          new Select(driver.findElement(By.id("ContentPlaceHolder1_ddStatusList"))).selectByValue("3");//Approved
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_tb_Notes_Review']")).sendKeys("ok Approved");
          driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
          Thread.sleep(3000);
          
          System.out.println("Check for Single report Generation ");
          
          String parentwindow=driver.getWindowHandle();//For Parent window 
		     driver.findElement(By.id("ContentPlaceHolder1_btnPreview")).click();
		       Thread.sleep(10000);
		               for (String Child_Window : driver.getWindowHandles())
		                 {
		                driver.switchTo().window(Child_Window); 
		                      }
		                 Thread.sleep(2000);
		                 driver.findElement(By.linkText("Generate PDF")).click();//Switch to Child window
		                 Thread.sleep(3000);
		                 driver.findElement(By.id("btnGeneratePDF")).click();
		                 Thread.sleep(10000);
		                 Robot rb=new Robot();
		                 rb.keyPress(KeyEvent.VK_ENTER);
		                 Thread.sleep(2000);
		        		         driver.close();     //Close Child window
		         driver.switchTo().window(parentwindow); //Finally Switch to main window
		         Thread.sleep(2000);
		         driver.close(); 
	}

}
