

package com.JQuery_practic;

import java.util.concurrent.TimeUnit;

import javax.swing.SpinnerDateModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JQueryAutomation {
		;
	
	
	private static final WebElement Autocomplete = null;
	WebDriver driver;

	@BeforeMethod
	public void BeforeMethod() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}

	@Test
	public void test() throws Exception {

		
		  driver.get("https://jqueryui.com/"); String webTitle = driver.getTitle();
		  System.out.println("Website title is " + webTitle);
		  
		  String webURL = driver.getCurrentUrl(); 
		  System.out.println("website URL is "+ webURL);
		   Assert.assertEquals(webURL, "https://jqueryui.com/");
		  
		  // draggable
		  
		  driver.findElement(By.partialLinkText("Draggable")).click(); Actions action1
		  = new Actions(driver); driver.switchTo().frame(0); WebElement draggableElem =
		  driver.findElement(By.id("draggable")); action1.moveToElement(draggableElem,
		  147, 147).release().build().perform(); WebElement dragMeAround =
		  driver.findElement(By.xpath("\r\n" + "//*[@id=\"draggable\"]/p"));
		  driver.switchTo().defaultContent(); Actions action = new Actions(driver);
		  
		  
		  
		  // droppble WebElement droppble =
		  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a"));
		  WebElement droppble = null;
		droppble.click();
		  
		  driver.switchTo().frame(0); WebElement sourceElement =
		  driver.findElement(By.id("draggable")); WebElement targetElement =
		  driver.findElement(By.id("droppable")); Thread.sleep(2000);
		  action.clickAndHold(sourceElement).moveToElement(targetElement).release().
		  build().perform(); driver.switchTo().defaultContent(); Thread.sleep(2000);
		  
		  // resizable WebElement resizable =
		  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a"));
		  WebElement resizable = null;
		resizable.click(); driver.switchTo().frame(0); Thread.sleep(2000); WebElement
		  resizableElem =
		  driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		  action.clickAndHold(resizableElem).moveByOffset(80,
		  20).release().build().perform();
		  
		  Thread.sleep(2000);
		  
		  
		  // selectable
		  
		  driver.switchTo().defaultContent();
		  
		  WebElement selectableElem =
		  driver.findElement(By.partialLinkText("Selectable")); selectableElem.click();
		  
		  
		  WebElement myFrame =
		  driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		  driver.switchTo().frame(myFrame);
		  
		  driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(1)")).
		  click(); Thread.sleep(1000); driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(2)")).
		  click(); Thread.sleep(1000); driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(3)")).
		  click(); Thread.sleep(1000); driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(4)")).
		  click(); Thread.sleep(1000); driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(5)")).
		  click(); Thread.sleep(1000); driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(6)")).
		  click(); Thread.sleep(1000); driver.findElement(By.
		  cssSelector("#selectable:nth-child(1) .ui-widget-content:nth-child(7)")).
		  click(); Thread.sleep(2000);
		  
		  driver.switchTo().defaultContent();
		  
		  // Sortable WebElement sortableElem = driver .findElement(By.
		 // cssSelector("#sidebar > aside:nth-child(1) > ul > li:nth-child(5) > a"));
		 // sortableElem.click();
		  
		  WebElement myFram = driver.findElement(By.cssSelector("#content > iframe"));
		  driver.switchTo().frame(myFram); WebElement sortItemElem1 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(1)")); WebElement
		  sortItemElem2 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(2)")); WebElement
		  sortItemElem3 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(3)")); WebElement
		  sortItemElem4 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(4)")); WebElement
		  sortItemElem5 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(5)")); WebElement
		  sortItemElem6 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(6)")); WebElement
		  sortItemElem7 =
		  driver.findElement(By.cssSelector("#sortable > li:nth-child(7)"));
		  
		  action.clickAndHold(sortItemElem1).moveToElement(sortItemElem7).perform();
		  Thread.sleep(1000);
		  action.clickAndHold(sortItemElem3).moveToElement(sortItemElem5).perform();
		  Thread.sleep(1000);
		  action.clickAndHold(sortItemElem2).moveToElement(sortItemElem3).perform();
		  Thread.sleep(1000);
		  action.clickAndHold(sortItemElem6).moveToElement(sortItemElem5).perform();
		  Thread.sleep(1000);
		  action.clickAndHold(sortItemElem7).moveToElement(sortItemElem2).perform();
		  Thread.sleep(1000);
		  action.clickAndHold(sortItemElem5).moveToElement(sortItemElem4).perform();
		  Thread.sleep(1000);
		  action.clickAndHold(sortItemElem4).moveToElement(sortItemElem1).perform();
		  Thread.sleep(1000); driver.switchTo().defaultContent();
		  
		  
		  //Accordion
		  
		  WebElement Accordion = driver.findElement(By.partialLinkText("Accordion"));
		  Accordion.click(); driver.switchTo().frame(0); WebElement Accordion1 =
		  driver.findElement(By.id("ui-id-1")); action.click(
		  Accordion1).build().perform();
		  
		  WebElement Accordion2 = driver.findElement(By.id("ui-id-3"));
		  action.click(Accordion2).build().perform();
		  
		  WebElement Accordion3 = driver.findElement(By.id("ui-id-5"));
		  action.click(Accordion3).build().perform();
		  
		  WebElement Accordion4 = driver.findElement(By.id("ui-id-7"));
		  action.click(Accordion4).build().perform();
		  driver.switchTo().defaultContent();
		  
		  //Autocomplete WebElement Autocomplete =
		  driver.findElement(By.partialLinkText("Autocomplete")); Autocomplete.click();
		  driver.switchTo().frame(0); WebElement Autocomplete1 =
		  driver.findElement(By.id("tags")); Autocomplete1.sendKeys("Ja");
		  Thread.sleep(1000); Autocomplete1.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(1000); Autocomplete1.sendKeys(Keys.ARROW_DOWN);
		  Autocomplete1.click(); driver.switchTo().defaultContent();
		 

		
		  // Button
		  
		  driver.get("https://jqueryui.com/button/"); driver.switchTo().frame(0);
		  WebElement Button1 = driver.findElement(By.cssSelector(".widget button"));
		  Button1.click(); Thread.sleep(2000);
		  
		  WebElement Button2 = driver.findElement(By.cssSelector(".widget input"));
		  Button2.click(); Thread.sleep(2000);
		  
		  WebElement Button3 = driver.findElement(By.cssSelector(".widget a"));
		  Button3.click(); Thread.sleep(2000);
		  
		  WebElement Button4 = driver .findElement(By.
		  cssSelector("body > .ui-button.ui-widget.ui-corner-all:nth-child(3)"));
		  Button4.click(); Thread.sleep(2000);
		  
		  WebElement Button5 =
		  driver.findElement(By.cssSelector("body > [type='submit']:nth-child(4)"));
		  Button5.click(); Thread.sleep(2000);
		  
		  WebElement Button6 = driver .findElement(By.
		  cssSelector("  body > .ui-button.ui-widget.ui-corner-all:nth-child(5)"));
		  Button6.click(); Thread.sleep(2000);
		  
		  // Checkboxradio driver.get("https://jqueryui.com/checkboxradio/");
		  driver.switchTo().frame(0); WebElement Checkboxradio =
		  driver.findElement(By.cssSelector(
		  ".widget > fieldset:nth-child(3) > .ui-checkboxradio-label.ui-corner-all.ui-button.ui-widget.ui-checkboxradio-radio-label:nth-child(2)"
		  )); Checkboxradio.click(); Thread.sleep(2000);
		  
		  WebElement Checkboxradio1 = driver.findElement(By.cssSelector(
		  ".widget > fieldset:nth-child(3) > .ui-checkboxradio-label.ui-corner-all.ui-button.ui-widget.ui-checkboxradio-radio-label:nth-child(4)"
		  )); Checkboxradio1.click(); Thread.sleep(2000);
		  
		  WebElement Checkboxradio2 = driver.findElement(By.cssSelector(
		  ".widget > fieldset:nth-child(5) > .ui-checkboxradio-label.ui-corner-all.ui-button.ui-widget:nth-child(4)"
		  )); Checkboxradio2.click(); Thread.sleep(2000);
		  
		  WebElement checkboxradio3 = driver.findElement(By.cssSelector(
		  ".widget > fieldset:nth-child(5) > .ui-checkboxradio-label.ui-corner-all.ui-button.ui-widget:nth-child(8) .ui-checkboxradio-icon.ui-corner-all.ui-icon.ui-icon-background.ui-icon-blank"
		  )); checkboxradio3.click(); Thread.sleep(2000);
		  
		  WebElement checkboxradio4 = driver.findElement(By.xpath(
		  "/html//div[@class='widget']/fieldset[3]/label[3]")); checkboxradio4.click();
		  Thread.sleep(2000);
		  
		  // Controlgroup driver.get("https://jqueryui.com/controlgroup/"); WebElement
		 // Controlgroup =
		  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[5]/a"));
		  driver.switchTo().frame(0);
		  
		  WebElement Controlgroup1 =
		  driver.findElement(By.xpath("//*[@id=\"car-type-button\"]/span[1]"));
		  Controlgroup1.click(); Thread.sleep(2000);
		  
		  WebElement Controlgroup3 =
		  driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]"));
		  Controlgroup3.click(); Thread.sleep(2000);
		  
		  WebElement Controlgroup4 =
		  driver.findElement(By.xpath("//*[@id=\"ui-id-8-button\"]/span[2]"));
		  Controlgroup4.click(); Thread.sleep(2000);
		  
		  WebElement Controlgroup5 = driver.findElement(By.id("book"));
		  Controlgroup5.click(); Thread.sleep(2000);
		 

		// Datepicker
		driver.get("https://jqueryui.com/datepicker/");
		WebElement Datepicker1 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[5]/a"));
		driver.switchTo().frame(0);

		WebElement Datepicker2 = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		Datepicker2.click();
		Datepicker2.clear();
		Datepicker2.sendKeys("04/05/2019");
		Thread.sleep(2000);

		// Dialog
		driver.get("https://jqueryui.com/dialog/#animated");
		driver.switchTo().frame(0);
		WebElement Dialog1 = driver.findElement(By.xpath("//*[@id=\"opener\"]"));
        Dialog1.click();
		Thread.sleep(2000);

		//Menu
		driver.get("https://jqueryui.com/menu/");
		driver.switchTo().frame(0);
		Actions action2= new Actions(driver); 
		WebElement bookMenu = driver.findElement(By.id("ui-id-2"));
		bookMenu.click();
		Thread.sleep(2000);
		WebElement clothingMenu = driver.findElement(By.id("ui-id-3"));
		clothingMenu.click();
		Thread.sleep(2000);
		WebElement electronicsMenu = driver.findElement(By.id("ui-id-4"));
		electronicsMenu.click();
		Thread.sleep(2000);
		WebElement moviesMenu = driver.findElement(By.id("ui-id-8"));
		moviesMenu.click();
		Thread.sleep(2000);
		WebElement musicMenu = driver.findElement(By.id("ui-id-9"));
		action2.click(musicMenu).build().perform();
		musicMenu.click();
		Thread.sleep(2000);
		
		//Progressbar
		driver.get("https://jqueryui.com/progressbar/");
		driver.findElement(By.id("sidebar"));
		
		//Slider
		driver.get("https://jqueryui.com/slider/");
		driver.findElement(By.partialLinkText("Slider")).click();
		driver.switchTo().frame(0);
		Actions action4 = new Actions(driver);
		WebElement handle = driver.findElement(By.cssSelector(".ui-slider-handle"));
		WebElement slider = driver.findElement(By.id("slider"));
		action4.dragAndDrop(handle, slider).build().perform();
		driver.switchTo().defaultContent();
		
		//Spinner
		driver.get("https://jqueryui.com/spinner/");
		driver.switchTo().frame(0);
		WebElement spinner1 = driver.findElement(By.id("spinner"));
		spinner1.sendKeys("11");
		driver.findElement(By.id("disable")).click();
		driver.findElement(By.id("destroy")).click();
        driver.switchTo().defaultContent();
		
        //Tabs
        driver.get("https://jqueryui.com/tabs/");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).click();
        driver.findElement(By.id("ui-id-1")).click();
        driver.findElement(By.id("ui-id-2")).click();
        driver.findElement(By.id("ui-id-3")).click();
        driver.switchTo().defaultContent();
		
        //Tooltip
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
       driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).click();
        driver.findElement(By.cssSelector("body > p:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("body > p:nth-child(2) > a")).click();
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("36");
        
		

		
	}
	
	@AfterMethod
	public void AfterMethod() {
		try {
			Thread.sleep(3000);
			driver.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
