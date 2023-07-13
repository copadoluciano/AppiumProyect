package TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import CentaJava.Core.Datasources;
import CentaJava.Core.DriverManager;
import CentaJava.Core.Reports;
import Pasos.CumpleCasasco;
import Pasos.HoraActual;
import Pasos.HoraUltimaConexion;
import Pasos.ProxCumpleCasasco;
import Pasos.Generales.LoginCasasco;
import Pasos.Generales.LogoutCasasco;
import Repositories.Repo_Template;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import Pasos.HoraActual;
 
public class TestCasasco5 {
	WebDriver driver;

	public boolean Test(Datasources data,Reports report, DriverManager DM, int iteration,String name, String ocasion) {
	//public boolean Test(Reports report, DriverManager DM, int iteration,String name) {
		//validation var
		boolean result = true;
		try {			
			System.out.println("Configuring");
			
			AndroidDriver<AndroidElement> driver;
			//Definir capabilities segun versión android y app
			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability("deviceName", "NYC");
//			capabilities.setCapability("udid", "emulator-5554");
			capabilities.setCapability("udid", "1164227322");
			capabilities.setCapability("platformName", "Android");
//			capabilities.setCapability("platformVersion", "7.1.1");
			capabilities.setCapability("appActivity", "com.artech.activities.StartupActivity");
			capabilities.setCapability("appPackage", "com.casasco.casascoapp");
			capabilities.setCapability("automationName", "UiAutomator1");
			
			
			//SET THE SERVER
			driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
			report.SetDriver(driver);
			//Wait Time
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			//SET THE REPOSITORIES TO USE
			LoginCasasco pLoginCasasco = new LoginCasasco();
			ProxCumpleCasasco pProxCumpleCasasco = new ProxCumpleCasasco();
			
			LogoutCasasco pLogoutCasasco = new LogoutCasasco();
			
		
					
			Repo_Template repo = new Repo_Template();
			repo.setDriver(driver);
			
			System.out.println("Initializating test");
						
			//Pasos 		
			pLoginCasasco.pasosLoginCasasco(data, report, repo, DM, iteration, name);
			
			pProxCumpleCasasco.pasosProxCumpleCasasco(data, report, repo, DM, iteration, name, "hola");
//			pLogoutCasasco.pasosLoginCasasco(data, report, repo, DM, iteration, name);	
		 
			//ADD VALIDATIONS AT THE END
			report.AddLine("Validamos que se haya cerrado la sesión");
			WebDriverWait waitFor = new WebDriverWait(driver, 15);
//			result = report.validateObjectIsDisplayable(repo.get_img_cumple());
			report.Screenshot(name);
			
			
			
						
		} catch (Exception e) {
	        e.printStackTrace();
			report.AddLineAssertionError(e.getStackTrace()[0].toString());
			report.AddLineAssertionError(e.getMessage());
			report.Screenshot(name);
			result = false;
			}
		//Try to erase the driver
		try {
			driver.close();
			driver.quit();}
			catch(Exception e2) {}
		//return the test result
		return result;
	}
	
	private void WaitTime(int i) {
		try
		{
		    Thread.sleep(i);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
 
}

