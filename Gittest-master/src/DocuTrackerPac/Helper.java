package DocuTrackerPac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper {
////Login To APP
	
public static void loginapp(String user,String pass,String url) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys(user);
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		Thread.sleep(1000);
		driver.close();
	}



///ISDAcopytemplate
	public static void ISDAcopytemplate() throws InterruptedException {

		String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("maniadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();//Managed Agreements
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/a")).click();//Template Agreements
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/ul/li[2]/a")).click();//Template
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlAgreementType']"))).selectByVisibleText("ISDAAgreement");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartySourceList']"))).selectByIndex(21);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartyTargetList']"))).selectByIndex(11);
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btncopy']")).click();
		Thread.sleep(5000);
						if(driver.getPageSource().contains("Successfully Copied"))
		{
		    System.out.println("Successfully Copied Template to Template");
		}

		else
		{
			System.out.println("Copy Template to Template Failed");
		}
				
		driver.close();
			}

	
	// PBcopytemplate
	public static void PBcopytemplate() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("maniadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();//Managed Agreements
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/a")).click();//Template Agreements
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/ul/li[2]/a")).click();//Template
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlAgreementType']"))).selectByVisibleText("Prime Broker Agreement");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartySourceList']"))).selectByIndex(20);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartyTargetList']"))).selectByIndex(10);
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btncopy']")).click();
		Thread.sleep(6000);
		
		if(driver.getPageSource().contains("Successfully Copied"))
		{
		    System.out.println("Successfully Copied Template to Template");
		}

		else
		{
			System.out.println("Copy Template to Template Failed");
		}
				
		driver.close();
			
	}

	
	// ClientArchive
	public static void ClientArchive() {
				
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net/");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.findElement(By.name("txtUserName")).sendKeys("sivaadmin");
		 driver.findElement(By.name("txtPassword")).sendKeys("123456");
		 driver.findElement(By.name("btnSubmit")).click();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/a/span")).click();
		  driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[1]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[5]/a")).click();
		  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		   java.util.Set<String> AllWindowHandles = driver.getWindowHandles();
		   String window1 = (String) AllWindowHandles.toArray()[0];
		   //System.out.print("window1 handle code = "+AllWindowHandles.toArray()[0]);
		    String window2 = (String) AllWindowHandles.toArray()[1];
		  
		    if( driver.switchTo().window(window2) != null){
		    driver.findElement(By.xpath(".//*[@id='btnClose']")).click();
		  
		    System.out.println("Close Window Successfully");
		       }
		   else {//if( driver.switchTo().window(window1) != null){
		      driver.findElement(By.xpath(".//*[@id='btnArchive']")).click();
		     driver.findElement(By.xpath(".//*[@id='btnClose']")).click();
		     System.out.println("Archive Successfull");
		    }
		}

	
	// ISDABENCHMARKsingleReportTest
	public static void ISDABENCHMARKsingleReportTest() throws InterruptedException, AWTException {
				
			  WebDriver driver = new FirefoxDriver();
			     driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net/");
			    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			    driver.manage().window().maximize();
			    driver.findElement(By.name("txtUserName")).sendKeys("manisubadmin");
			    driver.findElement(By.name("txtPassword")).sendKeys("123456");
			    driver.findElement(By.name("btnSubmit")).click();
			    
			   
			    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			    driver.findElement(By.tagName("body")).sendKeys("keys.down");
			    driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			    driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			    driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			    driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
			    driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/a")).click();
			    driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/ul/li[2]/a")).click();
			    Thread.sleep(5000);
			    new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Delta Advisors LLC");
			     Thread.sleep(3000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntityList']"))).selectByVisibleText("Delta Distressed Arbitrage Fund");
			     Thread.sleep(3000);
			     
			     String parentwindow=driver.getWindowHandle();//For Parent window 
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnPreview']")).click();
			       Thread.sleep(10000);
			     

			         for (String Child_Window : driver.getWindowHandles())
			                 {
			                driver.switchTo().window(Child_Window); 
			                      }
			                 Thread.sleep(2000);
			                 driver.findElement(By.linkText("Generate PDF")).click();//Switch to Child window
			                 Thread.sleep(3000);
			                 driver.findElement(By.xpath(".//*[@id='btnGeneratePDF']")).click();
			                 Thread.sleep(5000);
			                 Robot rb=new Robot();
			                 rb.keyPress(KeyEvent.VK_ENTER);
			                 Thread.sleep(2000);
			        		         driver.close();     //Close Child window
			         driver.switchTo().window(parentwindow); //Finally Switch to
			         Thread.sleep(2000);
    		         driver.close();
	}
	}
		
		
		




	


	
		
	
	
	

	

