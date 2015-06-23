package DocuTrackerPac;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class NewTest {
	 /*
	 @Test
public void createISDAWorkflowTest() throws InterruptedException, AWTException{
	  ISDAworkflow.CreateISDAWorkflow();
	  }
	
	@Test
	 public void LoginAppTest() throws InterruptedException
	 {
		  Helper.loginapp("maniadmin", "123456","http://73f03a3c373340a596d220e47e539824.cloudapp.net");
	 }
	  

  	@Test
  	public void ISDACopytemplateTest() throws InterruptedException{
  		  Helper.ISDAcopytemplate();
  		  }
	

	  @Test
	  public void PBCopytemplateTest() throws InterruptedException{
	  	  Helper.PBcopytemplate();
	  	  }
	    	
	
	  @Test
	  public static void PBWorkflowTest() throws InterruptedException, AWTException {
			
		  PBworkflowTest.CreatPBTestWorkflow();
		}
		
	
	@Test
	  public static void CreateISDADraft() throws InterruptedException, AWTException {
		  Create_ISDADraftAgreement.CreateISDADraft(2,2);
	  }
	    @Test
  public void ArchiveTest(){
	  Helper.ClientArchive();
	  }
 
  
  @Test(priority = 0)
  public void SearchAgreementTest(){
	  Helper.searchagreement();
	  }
	  	
	 @Test
	  public static void PBCustomReportTest() {
		 PBCustomReport.PBCustomReportTset();
		}
	 
	  @Test
	  public static void ISDABENCHMARKsingleReportTest() throws InterruptedException, AWTException {
	  	 Helper.ISDABENCHMARKsingleReportTest();
	  	}
	  	  @Test
	 public static void ISDACustomReportTest() throws InterruptedException, AWTException {
		 CustomReport.ISDACustomReportTset("bllsj");
		}
		
	 @Test
	  public static void PBCustomReportTest() throws InterruptedException, AWTException {
		 CustomReport.PBCustomReportTset("bxgjx");
		}
	

	 */
	
	

	 @Test
	  public static void ISDADRAFTCustomReportTest() throws InterruptedException, AWTException {
		 CustomReport cr = new CustomReport();
		 
		 cr.ISDADraftCustomReportTset("cab");
		}
	
//	@Test
	//  public static void ISDACustomReportFiltersTest() throws Exception {
		// iSDACustomReportFilters.CreatISDACustomReportFilters("a1", "a2");
		//}
  //@Test
	 // public static void PBCustomReportFiltersTest() throws InterruptedException, AWTException {
	//	 pbCustomReportFilters.CreatPBCustomReportFilters();
	//	}


	

	
 	
}
