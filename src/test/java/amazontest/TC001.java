package amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.java.Base;


public class TC001 extends Base {
	
	
	@Test
	public void SuccessfulOrder() {
		WebElement total=driver.findElement(By.xpath("//span[@id='sc-subtotal-label-activecart']"));
		String actual2= total.getText();
		Assert.assertEquals(actual2, "Subtotal (5 items):");
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		driver.findElement(By.xpath("//div[.='Cash on Delivery/Pay on Delivery']")).click();
		driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")).click();
		driver.findElement(By.xpath("//span[@id='submitOrderButtonId']")).click();
		WebElement element=driver.findElement(By.xpath("//h4[.='Order placed, thank you!']"));
		String actual3=element.getText();
		Assert.assertEquals(actual3, "Order placed, thank you!");	
	}
	@Test(dependsOnMethods = "SuccessfulOrder")
	public void EmptyCart() {
		WebElement element2=driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		String zero=element2.getText();
		Assert.assertEquals(zero, "0");
		WebElement element3=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
		String empty=element3.getText();
		Assert.assertEquals(empty, "Your Amazon Cart is empty.");        
	}
	@Test(dependsOnMethods= "EmptyCart")
	public void BuyOrdersInEmptyCart() {
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Amazon.in Shopping Cart");
	}
}
