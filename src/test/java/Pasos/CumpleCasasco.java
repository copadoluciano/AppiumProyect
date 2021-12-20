package Pasos;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import TestCases.TestCasasco1;
import bsh.Capabilities;
import CentaJava.Core.Datasources;
import CentaJava.Core.DriverManager;
import CentaJava.Core.Reports;
import Repositories.Repo_Template;
import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CumpleCasasco {
	WebDriver driver;
	
	public void pasosCumpleCasasco(Datasources data, Reports report, Repo_Template repo, DriverManager DM, int iteration, String name, String ocasion) throws InterruptedException {
		driver = DM.getActualDriver();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyy");
		
		
		Thread.sleep(2000);
		report.AddLine("Hacemos click en "+ocasion);
//		report.AddLine("Validamos banner "+ocasion);
//		repo.get_img_cumple().isDisplayed();
		report.AddLine("----------------------------");
		report.AddLine("Validamos "+ocasion+" del día");
	
		
		repo.get_btn_cumple_validacion().isDisplayed();
		Thread.sleep(2000);
		report.AddLine(repo.get_btn_cumple_validacion().getText()+ " "+ dtf.format(LocalDateTime.now()));
		report.Screenshot(name);
	
	
	
	}

}