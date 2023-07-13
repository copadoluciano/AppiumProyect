package Repositories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class Repo_Template {
	
	WebDriver driver = null;
	WebDriverWait waitt;

	public void setDriver(WebDriver d) {
		driver = d;
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	//
	public WebElement search() {
		return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
	}
	public WebElement btn_Categories() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Categorías, tab, 2 of 4\"]/android.widget.TextView"));
	}
	
	
	
	//Login
	public WebElement get_btn_cuenta() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cuenta, tab, 4 of 4']/android.widget.TextView[1]"));

	}
	public WebElement get_btn_perfil() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[2]"));

	}
	
	public WebElement get_btn_login() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView\r\n"));

	}
	public WebElement get_tittle_user() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"));
	}
	
	
	
	//Login Sin Cache
	public WebElement get_btn_email() {
		return driver.findElement(By.id("i0116"));
	}
	public WebElement get_btn_siguiente() {
		return driver.findElement(By.id("idSIButton9"));
	}
	public WebElement get_btn_password() {
		return driver.findElement(By.id("i0118"));
	}
	public WebElement get_checkbox() {
		return driver.findElement(By.id("KmsiCheckboxField"));
	}
	public WebElement get_btn_no_mostrar() {
		return driver.findElement(By.id("idBtn_Back"));
	}

	
	//Login Con Cache
	
	public WebElement get_btn_365() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));
	}
	
	public WebElement get_btn_pick_account() {
		return driver.findElement(By.xpath("//*[contains(@text, 'mobiletest@casasco.com.ar')]"));

	}
	public WebElement get_btn_pick_password() {
		return driver.findElement(By.id("i0118"));

	}
	public WebElement get_btn_pick_pick_password() {
		return driver.findElement(By.xpath("//*[@text='Continuar']"));

	}
	public WebElement get_btn_pick_login() {
		return driver.findElement(By.id("idSIButton9"));
	}
	
	//Salir
	public WebElement get_btn_menu() {
		return driver.findElement(By.xpath("//*[@content-desc='Navegar hacia arriba']"));
	}
	public WebElement get_btn_salir() {
		return driver.findElement(By.xpath("//*[contains(@text, 'Salir')]"));
	}
	public WebElement get_btn_recent_apps() {
		return driver.findElement(By.id("recent_apps"));
	}
	public WebElement get_btn_recent_apps_casasco() {
		return driver.findElement(By.xpath("//*[@id='task_view_bar' and ./*[@text='Casasco App']]"));
	}
	
	//Validación
	public WebElement get_btn_validar() {
		return driver.findElement(By.xpath("//*[@text='Cerró la sesión de su cuenta']"));
	}
	
	//Hora actual
	public WebElement get_btn_horaApp() {
		return driver.findElement(By.xpath("//*[contains(@text, 'ACTUALIZADO EL')]"));
	}
	public WebElement get_btn_horaMobile() {
		return driver.findElement(By.xpath("//android.widget.EditText[@id='clock']"));
	}
	//Cartel sin conexion
	public WebElement get_pop_sinConexion() {
		return driver.findElement(By.xpath("//*[@text='En este momento no tiene conexión a internet, los datos que se muestran podrían estar momentáneamente desactualizados.']"));
	}
	public WebElement get_pop_continuar() {
		return driver.findElement(By.id("button1"));
	}
	
	// Cumpleaños
	
	public WebElement get_btn_cumple() {
		return driver.findElement(By.xpath("//*[contains(@text, 'Cumpleaños')]"));
	}
	
	public WebElement get_img_cumple() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));
	}
	public WebElement get_btn_cumple_validacion() {
		return driver.findElement(By.xpath("//*[contains(@text, 'MATIAS')]"));
	}
	public WebElement get_btn_prox_cumple() {
		return driver.findElement(By.xpath("//*[contains(@text, 'PRÓXIMOS CUMPLEAÑOS')]"));
	}
	
	// Aniversarios
	public WebElement get_btn_aniversarios() {
		return driver.findElement(By.xpath("//*[contains(@text, 'Aniversarios')]"));
	}
		
	public WebElement get_img_aniversario() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
	}
	public WebElement get_btn_aniversario_validacion() {
		return driver.findElement(By.xpath("//*[contains(@text, 'CARLOS')]"));
	}
	
	
	
	



	
	
	
	
	

	
	
	

}
