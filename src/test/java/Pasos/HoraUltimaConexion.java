package Pasos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

public class HoraUltimaConexion {
	WebDriver driver;
	
	public void pasosHoraUltimaConexion(Datasources data, Reports report, Repo_Template repo, DriverManager DM, int iteration, String name) throws InterruptedException {
		driver = DM.getActualDriver();
		
		Thread.sleep(2000);
		report.AddLine("Validamos el cartel 'Sin conexión' ");
		repo.get_pop_sinConexion().isDisplayed();
		report.Screenshot(name);
//		repo.get_pop_continuar().click();
		
	
	
	}

}