package Android;

import org.junit.jupiter.api.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;

import CentaJava.Core.Reports;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class app {
	
	
	
	
	@Test
	public void setup() throws MalformedURLException, InterruptedException{
		
		AndroidDriver<AndroidElement> driver;
		//Definir capabilities segun versión android y app
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "NYC");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appActivity", "com.nantes.app.MainActivity");
		capabilities.setCapability("appPackage", "com.nantes.app");
		
		//Iniciar driver
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		
		//Wait time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Categorías, tab, 2 of 4\"]")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();
		Thread.sleep(1000);
		String precio = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")).getText();
		System.out.println("El precio del Pouch Dog Chow es"+precio);
		
		driver.closeApp();
		
		
//		repo.get_categorias().click();		
//		Thread.sleep(1000);
//		repo.get_categorias_perro().click();
//		Thread.sleep(1000);
//		repo.get_categorias_alimentoSeco().click();
//		Thread.sleep(1000);
//		repo.get_categorias_alimentoSecoDogchow().click();
//		Thread.sleep(1000);
//		String precio = repo.get_precio_pouch().getText().trim().replace("$","");
//		System.out.println(precio);
//		Assertions.assertEquals(precio, "90,00");

	
	}
	
}
