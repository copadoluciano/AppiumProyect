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

public class LogoutCasasco {
	WebDriver driver;
	
	public void pasosLoginCasasco(Datasources data, Reports report, Repo_Template repo, DriverManager DM, int iteration, String name) throws InterruptedException {
		driver = DM.getActualDriver();

		
		// Logout
		report.AddLine("Vamos a Inicio");
		report.Screenshot(name);
		repo.get_btn_menu().click();
		Thread.sleep(4000);
			
		report.AddLine("Apretamos Salir");
		report.Screenshot(name);
		repo.get_btn_salir().click();
		Thread.sleep(4000);
			
		report.AddLine("Seleccionamos la cuenta a desconectar");
		report.Screenshot(name);
		repo.get_btn_pick_account().click();
		Thread.sleep(4000);
	
	
	}

}