package Pasos.Generales;


import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import TestCases.TestCasasco1;
import bsh.Capabilities;
import CentaJava.Core.Datasources;
import CentaJava.Core.DriverManager;
import CentaJava.Core.Reports;
import Repositories.Repo_Template;
import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class LoginCasasco {
	WebDriver driver;
	
	public void pasosLoginCasasco(Datasources data, Reports report, Repo_Template repo, DriverManager DM, int iteration, String name) throws InterruptedException {
		driver = DM.getActualDriver();
		
		//Inicio
				
		report.AddLine("Iniciamos la app");
		report.Screenshot(name);
		
		report.AddLine("Accedemos a Cuenta con 365");
		report.Screenshot(name);
		repo.get_btn_365().click();
		try {
			//Login sin cache
			repo.get_btn_email();
			report.AddLine("Ingresamos correo");
			report.Screenshot(name);
			repo.get_btn_email().sendKeys("mobiletest@casasco.com.ar");;
			repo.get_btn_siguiente().click();
			
			report.AddLine("Ingresamos el Password");
			report.Screenshot(name);
			repo.get_btn_password().sendKeys("boyA8371#");
			repo.get_btn_siguiente().click();
			
			
		} catch(Exception e) {
			//Login con cache
			report.AddLine("Elegimos la cuenta");
			report.Screenshot(name);
			repo.get_btn_pick_account().click();
			
			report.AddLine("Ingresamos el Password");
			report.Screenshot(name);
			repo.get_btn_pick_password().sendKeys("boyA8371#");
			
			try {
			    repo.get_btn_pick_pick_password().click();
			    Thread.sleep(2000);
	
			} catch(Exception i) {
			}
			repo.get_btn_pick_login().click();
			
			}
		Thread.sleep(57000);

		
	
	
	}

}