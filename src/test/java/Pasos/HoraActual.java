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

public class HoraActual {
	WebDriver driver;
	
	public void pasosHoraActual(Datasources data, Reports report, Repo_Template repo, DriverManager DM, int iteration, String name) throws InterruptedException {
		driver = DM.getActualDriver();
		
		Thread.sleep(2000);
		report.AddLine("Tomamos los valores de hora");
		String horaApp = repo.get_btn_horaApp().getText().replace("ACTUALIZADO EL ", "").split(" ")[3];
		System.out.println(horaApp);
		report.AddLine("Hora App: "+horaApp);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		String horaMobile = dtf.format(LocalDateTime.now());
		System.out.println(horaMobile);
		report.AddLine("Hora Mobile: "+horaMobile);
		report.Screenshot(name);
		//Validamos los horarios
		Assertions.assertEquals(horaApp, horaMobile);
		
	
	
	}

}