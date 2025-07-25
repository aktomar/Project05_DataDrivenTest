package DataDriven_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven_WebObjects.InputLoginData;
import DataDriven_UtilitiesFiles.Logs;
import DataDriven_UtilitiesFiles.XUtils;

public class TC01_VerifyDifferent_Input_LoginCredentials extends BaseClass {

	
	@Test(dataProvider="LoginDetails")
	public void ValidateUserLoginDetails(String username,String password) throws InterruptedException {
		
		InputLoginData login = new InputLoginData(driver);
		
		login.EnterUsername(username); 
		Logs.info("Username Entered.....");
		Thread.sleep(2000);
		login.EnterPassword(password);
		Logs.info("Password Entered.....");
		Thread.sleep(2000);
		login.ClickedLoginButton();
		Logs.info("Loggin Button clicked.....");
		String HomePageTitle = driver.getTitle();
		
		if(HomePageTitle.equals("Logged In Successfully | Practice Test Automation")) {
			
			System.out.println("Logged In Successfully !!");
			login.ClickedLoggedOutButton();
			Logs.info("Clicked Logged Out....");
			Thread.sleep(2000);
		}
		else {
			
			System.out.println("Bad Credentials !!");
		}
		
		
	}
	
	
	
	@DataProvider(name ="LoginDetails")
	
	public Object[][] UserDetails() throws IOException{
		
		
		String path = System.getProperty("user.dir")+"/src/test/java/DataDriver_TestData/Input.xlsx";
		
		
		int rownum=XUtils.getRowCount(path, "Sheet1");
		int colcount=XUtils.getCellCount(path, "Sheet1",1);
		
		Object logindata[][] = new Object[rownum][colcount];
		
		for (int i=1;i<=rownum;i++)
		{
			
			for (int j=0;j<colcount;j++)
			{
			logindata[i-1][j]=XUtils.getCellData(path,"Sheet1", i,j);
			
			}
		}
		return logindata;
		
		
	}

}
