package in.utilityclass;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public interface IBaseClass {

    void applicationlaunch(String string);
	
	void inputKeys(WebElement ele, String value);

	void button(WebElement ele);
	
	boolean displayed(WebElement ele);

	boolean selected(WebElement ele);
	
	boolean enabled(WebElement ele);

	void moveForward();

	void moveBackward();

	String returnText(WebElement ele);

	String returnAttribute(WebElement ele, String attribute);

	String returnCssValue(WebElement ele, String cssName);

	void valueSelect(WebElement ele, String value);

	void indexSelect(WebElement ele, int i);

	List<WebElement> returnOptions(WebElement ele);

	void parentWindow();

	void childWindow();

	void alert(Alert a, String value);

	void screenshot(String imageName);

	void browserClose();

	String pageUrl();

	String pageTitle();

	void dragDrop(WebElement src, WebElement tar);

	void moveTo(WebElement ele);

	void actclick(WebElement ele);

	void actionesc();


	void doubleclick(WebElement ele);

	void rightclick();

	void rightclickonele(WebElement ele);



	void enterFrame(String frame);

	void exitFrame(String value);


	void inputKeys(WebElement ele, String value, Keys enter);
	
	void valueSelect(String value, WebElement ele);

	//JavaScriptExecutorClick
	void javascriptexecutorclick(WebElement element);
	 
	//for JavaScriptexecutor scrolldown
	void javascriptscrolldown(WebElement element);

	//for JavaScriptExecutor scrollUp
	void javascriptscrollup(WebElement element);

	void roboclass() throws AWTException;

	void robboclassesc() throws AWTException;

	void robboclasstab() throws AWTException;

	void javascriptpopup();

	// Implicit Wait - Global wait time set for the driver
	void setImplicitWait();

	//for explicit wait 
	void waitForelementToBeClickable(WebElement element);
	

	void waitForvisible(WebElement element);


	// Explicit Wait - Wait for an element to be present in the DOM
	void waitForElementPresence(WebElement element);

	// Explicit Wait - Wait for an element to disappear (not visible)
	void waitForElementToDisappear(WebElement element);

	// Explicit Wait - Wait for an alert to be present
	void waitForAlertToBePresent();

	// Explicit Wait - Wait for a text to be present in the element
	Boolean waitForTextToBePresentInElement(WebElement element, String text);



	}

