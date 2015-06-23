package DocuTrackerPac;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class pbCustomReportFilters {

	public static void CreatPBCustomReportFilters() throws InterruptedException, AWTException {
		
		System.out.println("CreatPBCustomReportFilters");
		String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		driver.get(url);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom 
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkExec_1']")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/div/div/div/span[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[7]/div/div/div/div/span[2]/label/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
		Thread.sleep(10000);
		
		//==========================FILTERING TREE================================
		driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
		Thread.sleep(10000);
		if(driver.getPageSource().contains("Questions Filtered"))
		{
		    System.out.println("Questions Filtered Successfully");
		}

		else
		{
		    System.out.println("Questions are not Filtered");
		}
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		Thread.sleep(2000);
		for(int i=0;i<15;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("pb51223390_Nw1221");
		driver.findElement(By.xpath(".//*[@id='Submit']")).click();
		Thread.sleep(20000);
		
		//=======================CLICK FOR CUSTOM REPORT=============================
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		Thread.sleep(20000);
		
		
		
		driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
		Thread.sleep(10000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		Robot rbt4=new Robot();
		rbt4.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download41PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt1=new Robot();
		rbt1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download113PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt2=new Robot();
		rbt2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download1113PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt3=new Robot();
		rbt3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
//		driver.close();
		
		
		//==============BACK TO CUSTOM FILTERS==========================
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(20000);
		
		
		//=======================2-3-4==============================
		System.out.println("2//3//4");
		driver.findElement(By.xpath(".//*[@id='CENI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
		Thread.sleep(10000);
		if(driver.getPageSource().contains("Questions Filtered"))
		{
		    System.out.println("2-3-4/Questions Filtered Successfully");
		}

		else
		{
		    System.out.println("Questions are not Filtered");
		}
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		Thread.sleep(2000);
		for(int i=0;i<15;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("pb++034");
		driver.findElement(By.xpath(".//*[@id='Submit']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
		Thread.sleep(10000);
		Robot rbt5=new Robot();
		rbt5.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		Robot rbt6=new Robot();
		rbt6.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download41PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt7=new Robot();
		rbt7.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download113PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt8=new Robot();
		rbt8.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download1113PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt9=new Robot();
		rbt9.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
//		driver.close();
		
		
		
		//==============BACK TO CUSTOM FILTERS==========================
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(20000);		
		
		
		//=======================2-3-4==============================
		System.out.println("1//3//4");
		driver.findElement(By.xpath(".//*[@id='CPNI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
		Thread.sleep(10000);
		if(driver.getPageSource().contains("Questions Filtered"))
		{
		    System.out.println("1-3-4/Questions Filtered Successfully");
		}

		else
		{
		    System.out.println("Questions are not Filtered");
		}
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		Thread.sleep(2000);
		for(int i=0;i<15;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("pb123dr");
		driver.findElement(By.xpath(".//*[@id='Submit']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
		Thread.sleep(10000);
		Robot rbt10=new Robot();
		rbt10.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		Robot rbt11=new Robot();
		rbt11.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='download41PDF1']")).click();
		Thread.sleep(8000);
		Robot rbt12=new Robot();
		rbt12.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download113PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt13=new Robot();
		rbt13.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='download1113PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt14=new Robot();
		rbt14.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
//		driver.close();

	}

}
