package in.utilityclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.stepdefinition.NicPolicy;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass   {
	
	public static Actions ac;
	public static Select s;
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Robot r;
	public void launch() {
 WebDriverManager.edgedriver().setup();
 driver = new EdgeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.manage().window().maximize();
}
	
public void applicationlaunch(String url)
{
	driver.get(url);
}

public void inputKeys(WebElement ele, String value) {
    ele.sendKeys(value);		
}

public void button(WebElement ele) {
       ele.click();		
}
public boolean displayed(WebElement ele) {
	boolean display=ele.isDisplayed();
	return display;
}

public boolean selected(WebElement ele) {
	boolean selected=ele.isSelected();
	return selected;
}

public boolean enabled(WebElement ele) {
	boolean enabled=ele.isEnabled();
	return enabled;
}

public void moveForward() {
   driver.navigate().forward();		
}

public void moveBackward() {
  driver.navigate().back();		

}

public String returnText(WebElement ele) {
	String text=ele.getText();
	return text;
}

public String returnAttribute(WebElement ele, String attribute) {
	String attribute2=ele.getAttribute(attribute);
	return attribute2;
}

public String returnCssValue(WebElement ele, String cssName) {
	String cssvalue=ele.getCssValue(cssName);
	return cssvalue;
}

public void valueSelect(WebElement ele, String value) {
       s =new Select(ele);
      s.selectByValue(value);      
}

public void indexSelect(WebElement ele, int i) {
     s =new Select(ele);
    s.deselectByIndex(i);
}

public List<WebElement> returnOptions(WebElement ele) {
	 s =new Select(ele);
    List<WebElement> options=s.getOptions();
    return options;
}

public void parentWindow() {
	String parentWindow=driver.getWindowHandle();
	driver.switchTo().window(parentWindow);	
}

public void childWindow() {
	String parentWindows=driver.getWindowHandle();
	Set<String> childwindow=driver.getWindowHandles();
	for(String x:childwindow) {
		if(!parentWindows.equals(x)) {
			driver.switchTo().window(x);
		}
	}	
}

public void alert(Alert a, String value) {
	Alert al=driver.switchTo().alert();
 	if(value.equals("ok")) {
 		al.accept();
 	}else {
 		al.dismiss();
 	}}

public void screenshot(String imageName) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	File trg =new File("C:\\Users\\srika\\eclipse-workspace\\cucumber\\target\\"+imageName+".png");
	try {
		FileUtils.copyFile(src, trg);
		} catch (IOException e) {
		e.printStackTrace();
		}
}

public void browserClose() {
     	driver.close();	
}

public String pageUrl() {
	String text = driver.getCurrentUrl();
	return text;
   		
}

public String pageTitle() {
	String text = driver.getTitle();
	return text;
	
}

public void dragDrop(WebElement src, WebElement tar) {
	ac=new Actions(driver);
	ac.dragAndDrop(src, tar).perform();
}

public void moveTo(WebElement ele) {
    ac=new Actions(driver);
	ac.moveToElement(ele).perform();
	
	
}

public void actclick(WebElement ele) {
    ac=new Actions(driver);
    ac.click(ele).build().perform();
}

public void actionesc() {
    ac=new Actions(driver);
    ac.sendKeys(Keys.ESCAPE).perform();
}


public void doubleclick(WebElement ele) {
	 ac=new Actions(driver);
	ac.doubleClick(ele).perform();
}

public void rightclick() {
	 ac=new Actions(driver);
	ac.contextClick().perform();
}

public void rightclickonele(WebElement ele) {
	 ac=new Actions(driver);
	ac.contextClick(ele).perform();
}



public void enterFrame(String frame) {
	driver.switchTo().frame(frame);
	}

public void exitFrame(String value) {
	if(value.equals("parent")) {
		driver.switchTo().parentFrame();
	}
	else if(value.equals("default")){
		driver.switchTo().defaultContent();
}}


public void inputKeys(WebElement ele, String value, Keys enter) {
	ele.sendKeys(value,enter);
}
public void valueSelect(String value, WebElement ele) {
    s =new Select(ele);
   s.selectByVisibleText(value);      
}

//JavaScriptExecutorClick
 public void javascriptexecutorclick(WebElement element) {
	    js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()",element);
    }
 
//for JavaScriptexecutor scrolldown
public void javascriptscrolldown(WebElement element) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);

}

//for JavaScriptExecutor scrollUp
public void javascriptscrollup(WebElement element) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)",element);
}

public void roboclass() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);	
}

public void robboclassesc() throws AWTException  {
	r = new Robot();
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);
}

public void robboclasstab() throws AWTException {
	r = new Robot();
	for (int i=0; i<=15; i++)
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
}

public void javascriptpopup() {
	js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector('.popup-class').style.display='none';");
}

// Implicit Wait - Global wait time set for the driver
public void setImplicitWait() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

//for explicit wait 
public void waitForelementToBeClickable(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void waitForvisible(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOf(element));   
}


// Explicit Wait - Wait for an element to be present in the DOM
public void waitForElementPresence(WebElement element) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
}

// Explicit Wait - Wait for an element to disappear (not visible)
public void waitForElementToDisappear(WebElement element) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
}

// Explicit Wait - Wait for an alert to be present
public void waitForAlertToBePresent() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
}

// Explicit Wait - Wait for a text to be present in the element
public Boolean waitForTextToBePresentInElement(WebElement element, String text) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    return wait.until(ExpectedConditions.textToBePresentInElement(element, text));
}

}

