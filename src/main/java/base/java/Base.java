package base.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	String URL ="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	protected RemoteWebDriver driver=null;

	
	@BeforeMethod
	public void startApp() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("7010811128", Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("deeputherocker", Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		
	}
		
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
		
}
