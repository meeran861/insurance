package in.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.utilityclass.BaseClass;

public class NicPom extends BaseClass{
	public NicPom() {
		BaseClass base = new BaseClass();
		PageFactory.initElements(base.driver, this);
	}
@FindBy (xpath = "//p[text()='OR']//following-sibling::div[text()='Continue as a Guest ']")
 private WebElement user_guest;

@FindBy (xpath = "//span[text()='×']")
private WebElement user_close;

@FindBy (xpath = "(//button[@class='premium-btn mat-stroked-button']//following::span[text()='Check Premium' and @class='mat-button-wrapper'])[1]")
private WebElement user_checkpremium;

@FindBy (xpath = "(//mat-select[@panelclass='myPanelClass' and contains(@class,'ng-untouched ng-pristine mat-select-required mat-select-empty ng-star-inserted ng-invalid')]/div)[1]")
private WebElement user_type;

@FindBy (xpath = "//span[text()=' New ']")
private WebElement user_new;

@FindBy (xpath = "(//div[@class='mat-select-value']//following-sibling::span[contains(@class,'mat-select-placeholder ng-tns-')])[1]")
private WebElement user_plan;

@FindBy (xpath = "//span[text()='5 Year Long Term Liability Only ']")
private WebElement user_year;

@FindBy (xpath = "(//div[@class='mat-select-value']//following-sibling::span[contains(@class,'mat-select-placeholder ng')])[last()]")
private WebElement user_class;

@FindBy (xpath = "//span[text()='Motor cycle ']")
private WebElement user_motor;

@FindBy (xpath = "(//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid'])[1]")
private WebElement user_location;

@FindBy (xpath = "//span[text()=' Delhi - North ']")
private WebElement user_delhi;

@FindBy (xpath = "(//mat-autocomplete[@class='mat-autocomplete']//preceding::input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid'])[1]")
private WebElement user_make;

@FindBy (xpath = "//span[text()=' ADMS ']")
private WebElement user_adms;

@FindBy (xpath = "(//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid'])[1]")
private WebElement user_model;

@FindBy (xpath = "//span[text()=' BOXER (2023-2025) ']")
private WebElement user_boxer;

@FindBy (xpath = "//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid']")
private WebElement user_variant;

@FindBy (xpath = "//span[text()=' STANDARD (2023-2025) ']")
private WebElement user_standard;

@FindBy (xpath = "//span[text()='Generate Quick Quote']")
private WebElement user_generate;


public WebElement getUser_guest() {
	return user_guest;
}

public WebElement getUser_close() {
	return user_close;
}

public WebElement getUser_checkpremium() {
	return user_checkpremium;
}

public WebElement getUser_type() {
	return user_type;
}

public WebElement getUser_new() {
	return user_new;
}

public WebElement getUser_plan() {
	return user_plan;
}

public WebElement getUser_year() {
	return user_year;
}

public WebElement getUser_class() {
	return user_class;
}

public WebElement getUser_motor() {
	return user_motor;
}

public WebElement getUser_location() {
	return user_location;
}

public WebElement getUser_delhi() {
	return user_delhi;
}

public WebElement getUser_make() {
	return user_make;
}

public WebElement getUser_adms() {
	return user_adms;
}

public WebElement getUser_model() {
	return user_model;
}

public WebElement getUser_boxer() {
	return user_boxer;
}

public WebElement getUser_variant() {
	return user_variant;
}

public WebElement getUser_standard() {
	return user_standard;
}

public WebElement getUser_generate() {
	return user_generate;
}
@FindBy (xpath = "//p[text()='OR']//following-sibling::div[text()='Continue as a Guest ']")
private WebElement user_guest2;

@FindBy (xpath = "//span[text()='×']")
private WebElement user_close1;

@FindBy (xpath = "//p[text()='Cashless Garages']")
private WebElement user_cashless;

@FindBy (xpath = "//input[@title='Enter the terms you wish to search for.']")
private WebElement user_search;

@FindBy (xpath = "//a[text()='Private Car']")
private WebElement user_car;

@FindBy (xpath = "//button[text()='Claims Procedure']")
private WebElement user_claim;

@FindBy (xpath = "//a[text()='LIST OF CASHLESS GARAGES']")
private WebElement user_garages;

@FindBy (xpath = "//a[contains(text(),'              List of service centers of Windshield Experts')]")
private WebElement user_service;

public WebElement getUser_guest2() {
	return user_guest2;
}

public WebElement getUser_close1() {
	return user_close1;
}

public WebElement getUser_cashless() {
	return user_cashless;
}

public WebElement getUser_search() {
	return user_search;
}

public WebElement getUser_car() {
	return user_car;
}

public WebElement getUser_claim() {
	return user_claim;
}

public WebElement getUser_garages() {
	return user_garages;
}

public WebElement getUser_service() {
	return user_service;
}

@FindBy (xpath = "//p[text()='OR']//following-sibling::div[text()='Continue as a Guest ']")
private WebElement user_guest3;

@FindBy (xpath = "//span[text()='×']")
private WebElement user_popup;

@FindBy (xpath = "//a[text()='Product']")
private WebElement user_prod;

@FindBy (xpath = "//label[text()=' Health Insurance ']")
private WebElement user_health;

@FindBy (xpath = "//a[@class='menu-item-header']//following-sibling::a[text()='National Mediclaim']")
private WebElement user_mediclaim;

@FindBy (xpath = "//b[text()='Downloads']")
private WebElement user_downloads;

@FindBy (xpath = "//a[text()='Policy Document']")
private WebElement user_policy;

public WebElement getUser_guest3() {
	return user_guest3;
}

public WebElement getUser_popup() {
	return user_popup;
}

public WebElement getUser_prod() {
	return user_prod;
}

public WebElement getUser_health() {
	return user_health;
}

public WebElement getUser_mediclaim() {
	return user_mediclaim;
}

public WebElement getUser_downloads() {
	return user_downloads;
}

public WebElement getUser_policy() {
	return user_policy;	
}

@FindBy (xpath = "//p[text()='OR']//following-sibling::div[text()='Continue as a Guest ']")
private WebElement user_guest4;

@FindBy (xpath = "//span[text()='×']")
private WebElement user_pop;

@FindBy (xpath = "//a[text()='Product']")
private WebElement user_product;

@FindBy (xpath = "//label[text()=' Travel Insurance ']")
private WebElement user_travel;

@FindBy (xpath = "//a[@class='menu-item-header']//following-sibling::a[text()='National Overseas Travel Policy']")
private WebElement user_overseas;

@FindBy (xpath = "//b[text()='Claims Procedure']")
private WebElement user_claimprocedure;

@FindBy (xpath = "//strong[text()='What are the Documents required (originals)?']")
private WebElement user_documents;

public WebElement getUser_guest4() {
	return user_guest4;	
}

public WebElement getUser_pop() {
	return user_pop;	
}

public WebElement getUser_product() {
	return user_product;	
}

public WebElement getUser_travel() {
	return user_travel;	
}

public WebElement getUser_overseas() {
	return user_overseas;	
}

public WebElement getUser_claimprocedure() {
	return user_claimprocedure;	
}

public WebElement getUser_documents() {
	return user_documents;	
}

@FindBy (xpath = "//p[text()='OR']//following-sibling::div[text()='Continue as a Guest ']")
private WebElement user_guest5;

@FindBy (xpath = "//span[text()='×']")
private WebElement user_close5;

@FindBy (xpath = "//a[text()='Product']")
private WebElement user_pro;

@FindBy (xpath = "//label[text()=' Home and Property Insurance ']")
private WebElement user_home;

@FindBy (xpath = "//a[@class='menu-item-header']//following-sibling::a[text()='National Bharat Griha Raksha Plus Policy']")
private WebElement user_griha;

@FindBy (xpath = "//b[text()='Downloads']")
private WebElement user_down;

@FindBy (xpath = "//a[text()='Griha Raksha Plus Claim Form']")
private WebElement user_form;


public WebElement getUser_guest5() {
	return user_guest5;	
}

public WebElement getUser_close5() {
	return user_close5;	
}

public WebElement getUser_pro() {
	return user_pro;	
}

public WebElement getUser_home() {
	return user_home;	
}

public WebElement getUser_griha() {
	return user_griha;	
}

public WebElement getUser_down() {
	return user_down;	
}

public WebElement getUser_form() {
	return user_form;	
}

}



